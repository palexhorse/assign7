
package play;

import java.io.IOException;
import java.util.List;
import board.*;

public class Play {
	
	GameBoard startBoard;


	private void init(int row,int col){
		startBoard = new GameBoard(row, col);
	}

	public Play(String[] args) {
		if (args.length == 0) {
			init(0, 0);
		}
		else {
			init(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		}



	}

	
	//DFS function to traverse game tree
	public void DFS() {
		GameTree root = new GameTree(startBoard);
		
		for (GameBoard nextBoard : startBoard.possibleBoards()) {
			GameTree nextNode = new GameTree(nextBoard);
			if (play(nextBoard, nextNode))
				root.addChild(nextNode);
		}
		
		printWinningGame(root);
	}


	private void printWinningGame(GameTree parent) {
		System.out.println(parent.getGameBoard());
		
		if (parent.numChildren() > 0) {
			GameTree nextNode = parent.getFirstChild();			
			// recursive call
			printWinningGame(nextNode);
			if (nextNode.numChildren() == 0)	
				parent.removeFirstChild();
		} else {
			System.out.println("===============================================");
		}
	}
	
	// generate possible solutions
	private boolean play(GameBoard gb, GameTree parent) {
		// if solution is winning solution
		if (gb.finalBoard())
			return true;
		
		List<GameBoard> nextBoards = gb.possibleBoards();
			
		boolean found = false;
		
		for (GameBoard nextBoard : nextBoards) {
			GameTree nextNode = new GameTree(nextBoard);
			// recursive call
			if (play(nextBoard, nextNode)) {
				found = true;
				parent.addChild(nextNode);
			}
		}
		
		return found;
	}
}
