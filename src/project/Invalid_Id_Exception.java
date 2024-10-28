package project;

public class Invalid_Id_Exception extends RuntimeException
{
     public String toString()
     {
    	return getClass()+"invalid id" ;
     }
}
