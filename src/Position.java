
public class Position {
	private int x;
	private int y;
	static int maxX;
	static int maxY;
	
	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Position left(){
		if(y-1>0){
			return new Position (x,y-1);
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}

	public Position down(){
		if(x+1 <= maxX){
			return new Position (x+1,y);
		}
		return null;
	}
	
	public Position right(){
		if(y+1<=maxY){
			return new Position (x,y+1);
		}
		return null;
	}
	
	public Position up(){
		if(x-1 > 0){
			return new Position (x-1,y);
		}
		return null;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
}
