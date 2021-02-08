package SpringAssignments.Assignment2;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Required;

public class Question {

private int Questionid;
private String quesname;
@Resource
private ans answers;
@Inject
private author auth;



@Required
public author getAuth() {
	return auth;
}
public void setAuth(author auth) {
	this.auth = auth;
}
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


public ans getAnswers() {
	return answers;
}
public void setAnswers(ans answers) {
	this.answers = answers;
}


@Override
public String toString() {
	return "Question [Questionid=" + Questionid + ", quesname=" + quesname + ", answers=" + answers + ", auth=" + auth
			+ "]";
}
public void disp() {
	System.out.println(Questionid+"."+quesname+"\n"+answers+"\nAuthor Name:"+auth);
}
	}
	
