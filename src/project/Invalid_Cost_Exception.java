package project;

public class Invalid_Cost_Exception extends RuntimeException
{
   public String toString()
   {
	   return getClass()+"invalid cost";
   }
}
