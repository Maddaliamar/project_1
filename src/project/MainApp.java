package project;

import java.util.Scanner;

public class MainApp
{
	 
	public static void main(String[] args) 
	{
		String tittle;
		 int id;
		 int cost;
		 int noOfPages;
		 String Other;
		Library l=new Library();
		Scanner sc=new Scanner(System.in);
		boolean b=true;
		while(b)
		{
			System.out.println("Enter the choice: 1:addBooks  /2:display / 3:searchid(int id) /"
					+ " 4:searOthor(String name) / 5:searchTytle(String name) / 6:searchId(int id)");
			System.out.println("enter a choice");
			int ch=sc.nextInt();
			switch(ch)
			{
				 case 1:
				 {
					 
					 while(true)
					 {
						 try
						 {
							 System.out.println("enter tytle for book");
							 tittle=sc.next();
							 System.out.println("enter id for book");
							 id=sc.nextInt();
							 System.out.println("enter cost");
							 cost=sc.nextInt();
							 System.out.println("enter noOfPages");
							 noOfPages=sc.nextInt();
							 System.out.println("enter Other for book");
							 Other=sc.next();
							 l.addBook(new Book(tittle,id,cost,noOfPages,Other));
							 
						 }
						 catch(InvalidTitleException e)
						 {
							 System.out.println("tytle exception was handled");
							 System.out.println("enter tytle for book");
							 tittle=sc.next();
						 }
						 catch(Invalid_Id_Exception e)
						 {
							 System.out.println("id exceprion handled");
							 System.out.println("enter id for book");
							 id=sc.nextInt(); 
						 }
						 catch(Invalid_Cost_Exception e)
						 {
							 System.out.println("cost exceprion handled");
							 System.out.println("enter cost");
							 cost=sc.nextInt();
						 }
						 catch(ValidatePageN0Exception e)
						 {
							 System.out.println("pageNoexceptin exceprion handled");
							 System.out.println("enter noOfPages");
							 noOfPages=sc.nextInt();
						 }
						 catch(ValidOtherExceptin e)
						 {
							 System.out.println("otherNameexception exceprion handled");
							 System.out.println("enter Other for book");
							 Other=sc.next(); 
						 }
						 break;
						 
					 }
					 
				 }
				 break;
			     case 2:
				 {
					 l.displayBook();
				 }
				 break;
				 case 3:
				 {
					 System.out.println("enter a id");
					  id=sc.nextInt();
					 l.searchid(id);
				 }
				 break;
				 case 4:
				 {
					 System.out.println("enter a name other");
					 String name =sc.next();
					 l.searOthor(name);
				 }
				 break;
				 case 5:
				 {
					 System.out.println("enter a title");
					  tittle=sc.next();
					 l.searchTytle(tittle);
				 }
				 break;
				 case 6:
				 {
					 System.out.println("enter a id");
					 id=sc.nextInt();
					 l.searchId(id);
				 }
				 break;
				 case 7:
				 {
					 b=false;
					 System.out.println("Thankue");
				 }
				 break;
				 default:
				 {
					 System.out.println("enter valid data");
				 }
			}
		}
	}

}
