package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //posi�ao inicial da pe�a criada ser� nula
	}

	protected Board getBoard() {
		return board;
	}

	
}
