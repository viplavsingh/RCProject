package Model;

public class Space {

	private int leftEnd;
	private int rightEnd;
	
	public Space(int leftEnd, int rightEnd){
		this.leftEnd=leftEnd;
		this.rightEnd=rightEnd;
	}
	
	public int getLeftEnd() {
		return leftEnd;
	}
	public void setLeftEnd(int leftEnd) {
		this.leftEnd = leftEnd;
	}
	public int getRightEnd() {
		return rightEnd;
	}
	public void setRightEnd(int rightEnd) {
		this.rightEnd = rightEnd;
	}
	
}
