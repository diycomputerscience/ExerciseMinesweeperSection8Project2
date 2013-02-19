package com.diycomputerscience.minesweeper;


public class FilePersistenceStrategy implements PersistenceStrategy {

	private String fileName;
	
	public FilePersistenceStrategy(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void save(Board board) throws PersistenceException {
		
	}

	@Override
	public Board load() throws PersistenceException {
		return null;		
	}
	
	public static String dataForSquare(int row, int col, Square square) {
		return row + " " + col + " " + square.getState() + " " + square.getCount() + " " + square.isMine();
	}

}
