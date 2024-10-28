package project;

import java.util.ArrayList;
import java.util.ListIterator;

public class Library
{
    private int Libraryid;
    private String Location;
    
    private Book b;
    private ArrayList<Book> book=new ArrayList();
    
    public void addBook(Book b)
    {
    	book.add(b);
    	System.out.println("book is abbed successfully");
    }
    public void displayBook()
    {
    	
    	if(book.isEmpty())
    	{
    		System.out.println("books are not added at");
    	}
    	else
    	{
    	     for(Book b:book)
    	     {
    	    	 b.display();
    	    	 
    	     }
    	     System.out.println("-------------------");
    	}
    	
    }
    public void searchid(int id)
    {
    	if(book.isEmpty())
    	{
    		System.out.println("books are not added at");
    	}
    	else
    	{
    		boolean e=false;
    		for(Book b:book)
    		{
    			if(b.getid()==id)
    			{
    			System.out.println("title"+b.gettittle());
    				e=true;
    			}
    		}
    		if(e==false)
    		{
    	      throw  new Invalid_Id_Exception();
    		}
    	}
    }
    public void searOthor(String name)
    {
    	if(book.isEmpty())
    	{
    		System.out.println("books are not added at");
    	}
    	else
    	{
    		boolean e=false;
	    	for(Book b:book)
	    	{
	    		if(b.getOther().equalsIgnoreCase(name))
	    		{
	    			b.display();
	    			e=true;
	    		}
	    	}
	    	if(e==false)
	    	{
	    		throw new ValidOtherExceptin();
	    	}
    	}
    }
    public void searchTytle(String tittle)
    {
    	if(book.isEmpty())
    	{
    		System.out.println("books are not added at");
    	}
    	else
    	{
    		boolean e=false;
    		for(Book b:book)
    		{
    			if(b.gettittle().equalsIgnoreCase(tittle))
    			{
    				b.setcost(700);
    				e=true;
    				System.out.println("cost is updated");
    			}
    		}
    		if(e==false)
    		{
    			throw new InvalidTitleException();
    		}
    	}
    }
    public void searchId(int id)
    {
    	if(book.isEmpty())
    	{
    		System.out.println("books are not added at");
    	}
    	else
    	{
    		boolean e=false;
    		ListIterator<Book> b=book.listIterator();
    		while(b.hasNext())
    		{
    			if(b.next().getid()==id)
    			{
    				b.remove();
    				System.out.println("value is removed");
    				e=true;
    			}
    		}
    		if(e==false)
    		{
    			throw new Invalid_Id_Exception();
    		}
    	}
    }
    
}
