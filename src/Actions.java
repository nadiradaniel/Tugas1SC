import aima.core.agent.Action;

public class Actions implements Action{
    
	private int move;
	public static final int UP = 0;
	public static final int RIGHT = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	public static final int AMBIL = 4;
	
		
	@Override
	public boolean isNoOp() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Actions(int move) {
		this.move = move;
	}

	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}

	@Override
	public String toString() {
		switch(move){
		case 0: return "ATAS";
		case 1: return "KANAN";
		case 2: return "BAWAH";
		case 3: return "KIRI";
		case 4: return "AMBIL";
		}
		return null;
	}
	

}
