package Model;

public class Task {

	private int task_id;
	private double arrival_time;
	private double execution_time;
	private double deadline;
	private int area;

	public Task(int task_id, double arrival_time, double execution_time, double deadline, int area) {
		this.task_id = task_id;
        this.arrival_time = arrival_time;
        this.execution_time = execution_time;
        this.deadline = deadline;
        this.area = area;
	}

	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

	public double getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(double arrival_time) {
		this.arrival_time = arrival_time;
	}
	public double getExecution_time() {
		return execution_time;
	}
	public void setExecution_time(double execution_time) {
		this.execution_time = execution_time;
	}
	public double getDeadline() {
		return deadline;
	}
	public void setDeadline(double deadline) {
		this.deadline = deadline;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
}
