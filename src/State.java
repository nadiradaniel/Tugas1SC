import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class State{
	private Position toni;
	public  Set<Position> barang = new HashSet<Position>();
	private static HashSet<Position> tembok = new HashSet<Position>();
	
	public State(Position toni){
		this.toni = toni;

	}
	
	public Position getToni() {
		return toni;
	}

	public void setToni(Position toni) {
		this.toni = toni;
	}

	
	public static void addBarang(Position b){
		barang.add(b);
	}
	
	public Set<Position> getBarang(){
		return barang;
	}
	
	public static void addTembok (Position t){
		tembok.add(t);
	}
	
	public boolean canUp(){
		Position newPos = toni.up();
		return newPos != null && !tembok.contains(newPos);
	}
	
	public boolean canDown(){
		Position newPos = toni.down();
		return newPos != null && !tembok.contains(newPos);
	}
	
	public boolean canLeft(){
		Position newPos = toni.left();
		return newPos != null && !tembok.contains(newPos);
	}
	
	public boolean canRight(){
		Position newPos = toni.right();
		return newPos != null && !tembok.contains(newPos);
	}
	
	public boolean canTake(){
		Position newPos = toni;
		boolean  hasil =  newPos != null &&barang.contains(toni);
		return hasil;
	   
	}
	
	public State moveUp(){
		return new State (toni.up());
	}
	
	public State moveRight(){
		return new State (toni.right());
	}
	
	public State moveDown(){
		return new State (toni.down());
	}
	
	public State moveLeft(){
		return new State (toni.left());
	}
	
	public State takeThings(){
		Position pos = toni;
		Set<Position> hale = barang;
		hale.remove(pos);
		barang = hale;
		return new State (toni);
	}
//	public State ambilBarang(Position b){
//		for(int i = 0; i< barang.size(); i++){
//			if(barang.get(i).equals(b)){
//				System.out.println("Ambil Barang");
//				System.out.println(barang.get(i).toString());
//				barang.remove(i);
//				System.out.println(barang.size());
//			}
//		}
//		return new State(toni);
//	}
	
	
	public boolean isGoal(){
	
//		System.out.println(barang.size());
		return barang.size() == 0;
//		if(toni.equals(new Position(1,2))){
//			System.out.println(barang.size());
//			return true;	
//		}
//		else
//			return false;
		
	}
	
}
