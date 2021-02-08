package SpringAssignments.Assignment2;

public class author {
	String name;
	String noofques;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNoofques() {
		return noofques;
	}
	public void setNoofques(String noofques) {
		this.noofques = noofques;
	}
	@Override
	public String toString() {
		return "" + name + "\nNo.of questions writtened:" + noofques;
	}
	

}
