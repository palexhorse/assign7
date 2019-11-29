
package board;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class Moves {
	private static Map<Position,List<Move>> validMoves = new HashMap<Position,List<Move>>();
	
	static {
		// Create list of valid moves for each position
		/* 
		 *          0,0 
		 *       1,0  1,1
		 *     2,0  2,1  2,2
		 *   3,0  3,1  3,2  3,3
		 * 4,0  4,1  4,2  4,3  4,4
		 * 
		 */
		Position start;
		
		start = new Position(0,0);	
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(1,0), new Position(2,0)));
		validMoves.get(start).add(new Move(start, new Position(1,1), new Position(2,2)));
		
		start = new Position(1,0);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(2,0), new Position(3,0)));
		validMoves.get(start).add(new Move(start, new Position(2,1), new Position(3,2)));
		
		start = new Position(1,1);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(2,1), new Position(3,1)));
		validMoves.get(start).add(new Move(start, new Position(2,2), new Position(3,3)));	
		/* 
		 *          0,0 
		 *       1,0  1,1
		 *     2,0  2,1  2,2
		 *   3,0  3,1  3,2  3,3
		 * 4,0  4,1  4,2  4,3  4,4
		 * 
		 */	
		start = new Position(2,0);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(1,0), new Position(0,0)));
		validMoves.get(start).add(new Move(start, new Position(2,1), new Position(2,2)));
		validMoves.get(start).add(new Move(start, new Position(3,0), new Position(4,0)));
		validMoves.get(start).add(new Move(start, new Position(3,1), new Position(4,2)));
	
		start = new Position(2,1);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(3,1), new Position(4,1)));
		validMoves.get(start).add(new Move(start, new Position(3,2), new Position(4,3)));
		
		start = new Position(2,2);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(1,1), new Position(0,0)));
		validMoves.get(start).add(new Move(start, new Position(2,1), new Position(2,0)));
		validMoves.get(start).add(new Move(start, new Position(3,2), new Position(4,2)));
		validMoves.get(start).add(new Move(start, new Position(3,3), new Position(4,4)));	
		/* 
		 *          0,0 
		 *       1,0  1,1
		 *     2,0  2,1  2,2
		 *   3,0  3,1  3,2  3,3
		 * 4,0  4,1  4,2  4,3  4,4
		 * 
		 */	
		start = new Position(3,0);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(2,0), new Position(1,0)));
		validMoves.get(start).add(new Move(start, new Position(3,1), new Position(3,2)));	

		start = new Position(3,1);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(2,1), new Position(1,1)));
		validMoves.get(start).add(new Move(start, new Position(3,2), new Position(3,3)));

		start = new Position(3,2);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(2,1), new Position(1,0)));
		validMoves.get(start).add(new Move(start, new Position(3,1), new Position(3,0)));	
		
		start = new Position(3,3);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(2,2), new Position(1,1)));
		validMoves.get(start).add(new Move(start, new Position(3,2), new Position(3,1)));	
		/* 
		 *          0,0 
		 *       1,0  1,1
		 *     2,0  2,1  2,2
		 *   3,0  3,1  3,2  3,3
		 * 4,0  4,1  4,2  4,3  4,4
		 * 
		 */	
		start = new Position(4,0);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(3,0), new Position(2,0)));
		validMoves.get(start).add(new Move(start, new Position(4,1), new Position(4,2)));	

		start = new Position(4,1);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(3,1), new Position(2,1)));
		validMoves.get(start).add(new Move(start, new Position(4,2), new Position(4,3)));	
		
		start = new Position(4,2);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(3,1), new Position(2,0)));
		validMoves.get(start).add(new Move(start, new Position(3,2), new Position(2,2)));
		validMoves.get(start).add(new Move(start, new Position(4,1), new Position(4,0)));
		validMoves.get(start).add(new Move(start, new Position(4,3), new Position(4,4)));
		
		start = new Position(4,3);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(3,2), new Position(2,1)));
		validMoves.get(start).add(new Move(start, new Position(4,2), new Position(4,1)));

		start = new Position(4,4);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(3,3), new Position(2,2)));
		validMoves.get(start).add(new Move(start, new Position(4,3), new Position(4,2)));	
	}

	
	public static List<Move> getMoves(Position position) {
		// if move is not listed / not valid
		if (!validMoves.containsKey(position))
			throw new RuntimeException("Invalid position: " + position);
		
		return validMoves.get(position);
	}

	
	public String toString() {
		return validMoves.toString();
	}
}
