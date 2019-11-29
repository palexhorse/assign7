// CSCE 4300 - Assignment 7
// Aaron Johnson
// Java implementation on Peg Puzzle Solver
// based on: https://www.codeproject.com/Articles/272466/Triangle-Peg-Solitaire

package main;

import java.io.IOException;
import play.*;


public class PegBoard {

/**
* @param args
*/
    public static void main(String[] args) throws IOException {

        Play play = new Play(args);

        play.DFS();
    }
}