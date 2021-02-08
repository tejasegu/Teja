package teja;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;
    
    
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	
    
}

public class Assignment5Q2 {
    public static int maxComments(List<News> news) {
		return news.stream().max(Comparator.comparing(News::getCommentByUser)).get().getNewsId();
    	
    }

    public static int budgetCount (List < News > news) {
    	
    	int count = 0;
    	List<String> allComments = new ArrayList<>();
    	news.stream().forEach(i->allComments.add(i.getComment()));
    	for(String s:allComments) {
    		if(s.contains("budget")) {
    			count++;
    		}
    	}
    	return count;
    }
    public static String maxCommentsByUser (List < News > news) {
    	 return news.stream().max(Comparator.comparing(News::getComment)).get().getCommentByUser();
    }

    public static Map<Object, List<News>> sortMaxCommentsByUser (List < News > news) {
    	return news.stream().collect(Collectors.groupingBy(w -> w.getComment()));
    }

    public static void main(String[] args) {
    	News n1 = new News(1,"Teja","Uday","Wow");
    	News n2 = new News(2,"Kiran","Uday","budget");
    	News n3 = new News(1,"Teja","Kiran","Wow");
    	News n4 = new News(3,"Uday","Kiran","budget");
    	News n5 = new News(1,"Teja","venkat","budget");
    	News n6 = new News(3,"Uday","Teja","budget");
    	News n7 = new News(1,"Teja","Kiran","comment");
    	List<News> news = new ArrayList<News>();
    	news.add(n1);
    	news.add(n2);
    	news.add(n3);
    	news.add(n4);
    	news.add(n5);
    	news.add(n6);
    	news.add(n7);
    	Assignment5Q2 ab=new Assignment5Q2();
      	System.out.println(ab.maxComments(news));
    	System.out.println(ab.budgetCount(news));
    	System.out.println(ab.maxCommentsByUser(news));
    	System.out.println(ab.sortMaxCommentsByUser(news));
    
    }
}
