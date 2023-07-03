package com.sgtesting.parameterizedconstructor;



class Post
{
	String category;
	String commentscount;
	String author;
	Post(String Cat,String Com, String Aut )
	{
		category=Cat;
		author=Aut;
		commentscount=Com;


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
	Comment(String Cat, int CC, String Loc, String Like )
	{
		category=Cat;
		commentcount=CC;
		location=Loc;
		like=Like;


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
	Readers(String Name, String Pop, int Count)
	{
		name=Name;
		count=Count;
		popularity=Pop;


		System.out.println("Readers Name is:" + name);
		System.out.println("Readers popularity is:" + popularity);
		System.out.println("Readers count  is:" + count);

		System.out.println("++++++++++++++++++++++++++++++++");

	}

}

public class Assignment8 {

	public static void main(String[] args) {
		Post obj=new Post("Social","fgh","256");
		Comment obj1=new Comment("Juke",25,"Bottom","256");
		Readers obj3=new Readers("SLB","25",256);



	}

}


