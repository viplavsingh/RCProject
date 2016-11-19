package Sched;

import java.util.ArrayList;

import Model.Space;
import Model.Task;

public class Scheduler {
	ArrayList<Space> spaceList;
	ArrayList<Task> taskset;
	ArrayList<Task> readyList;
	double localTime;
	public void schedule(ArrayList<Task> taskset){
		spaceList=new ArrayList<Space>();
		populateReadyList();
        scheduleAtTick();
        localTime++;
	}

	private void scheduleAtTick() {
		for(Task t : readyList){
			//if(spaceList.size()==0 && computeSUR>=1)
				
		}
	}

	public void  populateReadyList() {
		for (Task t : taskset) {
			if (t.getArrival_time() == localTime) {
				addToReadyList(t);
			}
		}
	}

	public void addToReadyList(Task t) {
		readyList.add(t);
	}
}
