import java.util.List;
import java.util.Properties;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import aima.core.agent.Action;
import aima.core.agent.Agent;
import aima.core.search.framework.Search;
import aima.core.search.framework.SearchAgent;
import aima.core.search.framework.problem.Problem;
import aima.core.search.uninformed.IterativeDeepeningSearch;

public class Tugas1A {
	public static void main(String [] args) throws Exception{
		long startTime = System.currentTimeMillis();
		BufferedReader reader = new BufferedReader(new FileReader(new File(args[1])));
		FileWriter writer = new FileWriter(new File(args[2]));
		StringTokenizer tokens = new StringTokenizer(reader.readLine());
		int maxX = Integer.parseInt(tokens.nextToken(","));
		int maxY = Integer.parseInt(tokens.nextToken(",")); 
		Position.maxX = maxX;
		Position.maxY = maxY;
		tokens = new StringTokenizer(reader.readLine());
		Position start = new Position(Integer.parseInt(tokens.nextToken(",")),Integer.parseInt(tokens.nextToken(",")));		
		tokens = new StringTokenizer(reader.readLine());	
		
		//add barang
		while(tokens.hasMoreTokens()){
			String item = tokens.nextToken(" "); 
			String xPos = item.substring(1,2);
			String yPos = item.substring(3,4);
			Position temp = new Position(Integer.parseInt(xPos),Integer.parseInt(yPos));
			State.addBarang(temp);
		}
		
		//add tembok
		tokens = new StringTokenizer(reader.readLine());		
		while(tokens.hasMoreTokens()){
			String wall = tokens.nextToken(" "); 
			String xPos = wall.substring(1,2);
			String yPos = wall.substring(3,4);
			Position temp = new Position(Integer.parseInt(xPos),Integer.parseInt(yPos));
			State.addTembok(temp);
		}

		State init = new State(start);
		ActionFunction actFunc = new ActionFunction();
		Result resultFunc = new Result();
		Goal goal = new Goal();
		Problem p = new Problem(init, actFunc, resultFunc, goal);
		Search search;
		SearchAgent agent;
		List <Action> listAct = null;
		Properties properties = null;
		
		if(args[0].equals("ids")){
			search = new IterativeDeepeningSearch();
			agent = new SearchAgent(p,search);
			listAct = agent.getActions();
			properties = agent.getInstrumentation();
		}
		else{
			
		}
		for(Action action : listAct){
			Actions act = (Actions) action;
			System.out.println(act.toString());
//			/writer.append(",");
		}
		writer.close();
		Iterator<Object> iterat = properties.keySet().iterator();
		while(iterat.hasNext()){
			String foo = (String) iterat.next();
			String bar = properties.getProperty(foo);
			System.out.println(foo+" "+bar);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time: " +(endTime-startTime)+ "milisecond");
		
	}
}