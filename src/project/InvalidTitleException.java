package project;

public class InvalidTitleException extends RuntimeException
{
     public String toString()
     {
    	 return getClass()+"invalid vitle";
     }
}
