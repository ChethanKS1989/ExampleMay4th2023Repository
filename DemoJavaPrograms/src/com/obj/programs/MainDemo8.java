package com.obj.programs;
class Post
{
	String category;
	String commentscount;
	String author;
	

}
class Comment
{
	String category;
	int commentcount;
	String location;
	String like;
	

}
class Readers
{
	String name;
	String popularity;
	int count;


}

public class MainDemo8 {

	public static void main(String[] args) {
		Post obj=new Post();
		obj.category="Current affair";
		obj.author="venu";
		obj.commentscount="3990";
		

		System.out.println("post category is:" + obj.category);
		System.out.println("Post author is:" + obj.author);
		System.out.println("post comments count is: " + obj.commentscount);		
		System.out.println("++++++++++++++++++++++++++++++++");
		Comment obj1=new Comment();
		obj1.category="sports";
		obj1.commentcount=7;
		obj1.location="Bangalore";
		obj1.like="100 likes";
		

		System.out.println("Comment category is:" + obj1.category);
		System.out.println("Comment count is:" + obj1.commentcount);
		System.out.println("Comment location is:" + obj1.location);
		System.out.println("Comment total :" + obj1.like);
		
		System.out.println("++++++++++++++++++++++++++++++++");
		
		Readers obj3=new Readers();
		obj3.name="kiran publishers";
		obj3.count=8789;
		obj3.popularity="no 1";
		

		System.out.println("Readers Name is:" + obj3.name);
		System.out.println("Readers popularity is:" + obj3.popularity);
		System.out.println("Readers count  is:" + obj3.count);
		
		System.out.println("++++++++++++++++++++++++++++++++");



	}

}
