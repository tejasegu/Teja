package SpringAssignments.Assignment2;

public class ans {

	private String qans1;
	private String qans2;
	

	public String getQans1() {
		return qans1;
	}


	public void setQans1(String qans1) {
		this.qans1 = qans1;
	}


	public String getQans2() {
		return qans2;
	}


	public void setQans2(String qans2) {
		this.qans2 = qans2;
	}


	@Override
	public String toString() {
		return "ans.[" + qans1 +", "+qans2 + "]";
	}

}
