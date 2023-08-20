package lec21;

import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {
		printBoardPaths(0, 0, 2, 2, "");
		ArrayList<String> list = getBoardPaths(0,0,2,2);
		System.out.println(list);
	}

	private static void printBoardPaths(int cr, int cc, int er, int ec, String ans) {
		if(cr==er&&cc==ec) {
			System.out.println(ans);
			return;
		}
		if(cr>er||cc>ec) {
			return;
		}
		// right
		printBoardPaths(cr, cc + 1, er, ec, ans + "R");

		// down
		printBoardPaths(cr + 1, cc, er, ec, ans + "D");
	}
	
	private static ArrayList<String> getBoardPaths(int cr, int cc, int er, int ec) {
		if(cr==er&&cc==ec) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		if(cr>er||cc>ec) {
			return new ArrayList<>();
		}
		// right
		ArrayList<String> list = getBoardPaths(cr, cc + 1, er, ec);
		for(String s : list) {
			list.add(s+"R");
		}

		// down
		list = getBoardPaths(cr + 1, cc, er, ec);
		for(String s : list) {
			list.add(s+"D");
		}
		return list;
	}

}
