package com.sgtesting.noargsconstructor;


class Post
{
	String category;
	String commentscount;
	String author;
	Post()
	{
		category="Current affair";
		author="venu";
		commentscount="3990";


		System.out.println("post category is:" + category);
		System.out.println("Post author is:" + author);
		System.out.println("post comments count is: " + commentscount);		
		System.out.println("++++++++++++++++++++++++++++++++");

	}


}
class Comment
{
	String category;
	int commentcount;
	String location;
	String like;
	Comment()
	{
		category="sports";
		commentcount=7;
		location="Bangalore";
		like="100 likes";


		System.out.println("Comment category is:" + category);
		System.out.println("Comment count is:" + commentcount);
		System.out.println("Comment location is:" + location);
		System.out.println("Comment total :" + like);

		System.out.println("++++++++++++++++++++++++++++++++");

	}


}
class Readers
{
	String name;
	String popularity;
	int count;
	Readers()
	{
		name="kiran publishers";
		count=8789;
		popularity="no 1";


		System.out.println("Readers Name is:" + name);
		System.out.println("Readers popularity is:" + popularity);
		System.out.println("Readers count  is:" + count);

		System.out.println("++++++++++++++++++++++++++++++++");

	}

}

public class MainDemo8 {

	public static void main(String[] args) {
		Post obj=new Post();
		Comment obj1=new Comment();
		Readers obj3=new Readers();



	}

}

