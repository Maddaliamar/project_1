package project;

public class Book 
{
     private String tittle; //java ||sql||python
     private int id; //Even
     private int cost;//300-200
     private int noOfPages;//500-3000
     private String Other; //james ||Scott||Alean
     public Book()
     {
    	 
     }
     public Book(String tittle,int id,int cost,int noofpages,String Other)
     {
    	 if(validTitle(tittle))
    	 {
    	   this.tittle=tittle;
    	 }
    	 else
    	 {
    		 InvalidTitleException e=new InvalidTitleException();
    		throw e;
    	 }
    	 if(validid(id))
    	 {
    	   this.id=id;
    	 }
    	 else
    	 {
    		 throw new Invalid_Id_Exception();
    	 }
    	 if(validCost(cost))
    	 {
    	    this.cost=cost;
    	 }
    	 else
    	 {
    		 throw new Invalid_Cost_Exception();
    	 }
    	 if(validnofPages(noofpages ))
    	 {
    	   this.noOfPages=noofpages;
    	 }
    	 else
    	 {
    		 throw new ValidatePageN0Exception();
    	 }
    	 if(validOther(Other))
    	 {
    		 this.Other=Other; 
    	 }
    	 else
    	 {
    		 throw new ValidOtherExceptin();
    	 }
    	 
     }
     
     
     public boolean validTitle(String tittle)
     {
    	 if(tittle.equals("java") || tittle.equals("sql")||tittle.equals("python"))
    	 {
    		 return true;
    	 }
    	 else
    	 {
    		 return false;
    	 }
     }
     
     
     public boolean validid(int id)
     {
    	 if(id%2==0)
    	 {
    		 return true;
    	 }
    	 else
    	 {
    		 return false;
    	 }
     }
     
     
     public boolean validCost(int cost)
     {
    	 if(cost<300&&cost>200)
    	 {
    		 return true;
    	 }
    	 else
    	 {
    		 return false;
    	 }
     }
     
     
     public boolean validnofPages(int noOfPages )
     {
    	 if(noOfPages>500&&noOfPages<2000)
    	 {
    		 return true;
    	 }
    	 else
    	 {
    		 return false;
    	 }
     }
     
     public boolean validOther(String Other)
     {
    	if("james".equalsIgnoreCase(Other)||"Scott".equalsIgnoreCase(Other)||"Alean".equalsIgnoreCase(Other))
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
     }
     
     public void settittle(String tittle)
     {
    	 this.tittle=tittle;
     }
     public String gettittle()
     {
    	 return tittle;
     }
     public void setid(int id)
     {
    	 this.id=id;
     }
     public int getid()
     {
    	 return id;
     }
     public void setcost(int cost)
     {
    	 this.cost=cost;
     }
     public int getcost()
     {
    	 return cost;
     }
     public void setnoOfPages(int noOfPages )
     {
    	 this.noOfPages=noOfPages;
     }
     public int getnoOfPages()
     {
    	 return noOfPages;
     }
     public void setOther(String Other)
     {
    	 this.Other=Other;
     }
     public String getOther()
     {
    	 return Other;
     }
     public void display()
     {
    	 System.out.println("Book tittle "+tittle);
    	 System.out.println("Book id "+id);
    	 System.out.println("Book cost "+cost);
    	 System.out.println("Book noOfPages "+noOfPages);
    	 System.out.println("Book Other "+Other);
     }
	@Override
	public String toString() {
		return "Book [tittle=" + tittle + ", id=" + id + ", cost=" + cost + ", noOfPages=" + noOfPages + ", Other="
				+ Other + "]";
	}
     
}
