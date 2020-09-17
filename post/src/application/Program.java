package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		List<Post> posts = new ArrayList<>();
		
		//Post 1
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
        
		Post post = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country", 
				12);
		
		post.addComment(c1);
		post.addComment(c2);
		posts.add(post);
		
		//Post 2
		c1 = new Comment("Good night");
		c2 = new Comment("May the Force be with you");
		
		post = new Post(
        		sdf.parse("28/07/2018 23:14:19"),
        		"Good night guys",
        		"See you tomorrow",
        		5);
        
		post.addComment(c1);
		post.addComment(c2);
        posts.add(post);
		
        for (Post p : posts) {
        	System.out.println(p);
        }

	}

}
