package Sched;
import Model.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;


public class TaskGen {
    ArrayList<Task> taskset;
    ArrayList<Space> spaceList;
    
	public void generateTasks(){
		try {
			int t=0;
			taskset=new ArrayList<Task>();
			Scanner scan = new Scanner(new FileInputStream("/home/hduser/Desktop/TaskSet.txt"));
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				System.out.println(line);
				StringTokenizer st = new StringTokenizer(line, " ");
                double at = Double.parseDouble(st.nextToken());
                double et = Double.parseDouble(st.nextToken());
                double deadline = Double.parseDouble(st.nextToken());
                int area = Integer.parseInt(st.nextToken());
                Task task=new Task(t++,at,et,deadline,area);
                taskset.add(task);
                new Scheduler().schedule(taskset);
			}
			 scan.close();
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
	
	
	
}
