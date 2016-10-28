import aima.core.agent.Action;
import aima.core.search.framework.problem.ResultFunction;

public class Result implements ResultFunction{

	@Override
	public Object result(Object s, Action a) {
		// TODO Auto-generated method stub
		State st = (State) s;
		Actions act = (Actions) a;
		
		if(act.getMove() == Actions.AMBIL) {
			return st.takeThings();
		} 
		
		else if(act.getMove() == Actions.UP){
			return st.moveUp();
		} 
		
		else if (act.getMove() == Actions.RIGHT){
			return st.moveRight();
		} 
		else if (act.getMove() == Actions.DOWN){
			return st.moveDown();
		} 
		else if(act.getMove() == Actions.LEFT) {
			return st.moveLeft();
		} 
		
	
		
		return st;
		
	}

}
