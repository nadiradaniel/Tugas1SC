import java.util.HashSet;
import java.util.Set;

import aima.core.agent.Action;
import aima.core.search.framework.problem.ActionsFunction;

public class ActionFunction implements ActionsFunction {

	@Override
	public Set<Action> actions(Object s) {
		// TODO Auto-generated method stub
		Set<Action> actionSet = new HashSet<>();
		State st = (State) s;
		
		
		if(st.canUp()){
				actionSet.add(new Actions (Actions.UP));
		}
		if(st.canRight()){
				actionSet.add(new Actions (Actions.RIGHT));
		}
		if(st.canDown()){
				actionSet.add(new Actions (Actions.DOWN));
		}
		if(st.canLeft()){
				actionSet.add(new Actions (Actions.LEFT));
		}
		if(st.canTake()){
			actionSet.add(new Actions(Actions.AMBIL));
		}


		return actionSet;
	}

}
