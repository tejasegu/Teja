package SpringAssignments.Assignment2;

//import java.util.List;
import java.util.Map;
//import java.util.Set;

public class Question {
private int Questionid;
private String quesname;
/*private List <String> qans;
private Set <String> qansset;*/
private Map <Integer,String> qansmap;
public int getQuestionid() {
	return Questionid;
}
public void setQuestionid(int questionid) {
	Questionid = questionid;
}
public String getQuesname() {
	return quesname;
}
public void setQuesname(String quesname) {
	this.quesname = quesname;
}
/*public List<String> getQans() {
	return qans;
}
*public void setQans(List<String> qans) {
	this.qans = qans;
}
*public Set<String> getQansset() {
	return qansset;
}
*public void setQansset(Set<String> qansset) {
	this.qansset = qansset;
}**/
public Map<Integer, String> getQansmap() {
	return qansmap;
}
public void setQansmap(Map<Integer, String> qansmap) {
	this.qansmap = qansmap;
}
public void disp() {
	System.out.println("Question ID: "+Questionid+"\n"+quesname);
	System.out.println("Answers are :");
	
	  /*for(String s:qans) { System.out.println(s); }
	  for(String s:qansset) { System.out.println(s);}*/ 
	  for (Map.Entry<Integer,String> entry : qansmap.entrySet()) {
	  System.out.println(entry.getKey() + ":" +
	  entry.getValue()); }
	 
	}
	

}
