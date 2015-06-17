package obj_oriented_progs;

//import java.awt.print.Book;

class TestBook {
    //private static final Author Author = null;


	public static void main(String args[])
    {
      //first an author is there then book comes..... so initiazlize object instacne  for author!
		Author teck = new Author("Janes wolo", "janes@gmail.com", 'm');
	      System.out.println(teck);  // toString()
        book aBook = new book("Java for dummy", teck , 19.95,50);
        
        // Use an anonymous instance of Author
        //book anotherBook = new book("more Java for dummy", "nihoma udibaba", 29.95, 888);  
        //testing methods of class book
        aBook.getAuthor();
        System.out.println("old price is "+aBook.getPrice());
        System.out.println("setting  price  "+aBook.setPrice(50));
        System.out.println("new price of "+aBook.getName()+" is "+aBook.getPrice());
        
        //new instacne of book
        // by directly adding new instance as argument!
        
        book bBook=new book("live and win", new Author("kokanaka","kokanaka@somewhere.com", 'f'),45.0);
       // System.out.println(bBook); // to string of book
        System.out.println("new instance  of book : "+bBook.getName());
        System.out.println(" author name : "+bBook.getAuthorName()+"\t"+"\t"+"author gender : "+bBook.getAuthorGender()+"\t"+" author email : "+bBook.getAuthorEmail());
       
    }
}