import aima.core.search.framework.problem.GoalTest;

public class Goal implements GoalTest {

	@Override
	public boolean isGoalState(Object state) {
		// TODO Auto-generated method stub
		return ((State)state).isGoal();
		
		
	}
     
}
