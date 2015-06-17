package obj_oriented_progs;


class book
{
    private String name;
    private Author author;
   // private int qntinstock;
    private double price;
	private int qtyInStock;
   
    public book (String name, Author author, double price) {
        this.name=name;
        this.author=author;
        this.price = price;
    }
    
    
    
    public book (String name,  Author author , double price,  int qtyInStock) {
         this.name=name;
         this.price = price;
         this.qtyInStock = qtyInStock;
         this.author=author; }
    
         //public methods getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock().
         public String getName()
         {
             return name;
         }
         
        public String getAuthor(){
            return author.getName();
        }
        public double getPrice(){
            return price;
        
        }
        public double  setPrice(double price){
           this.price=price;
        	return price; 
            
        }
        public int getQtyInStock(){
            return qtyInStock;
        }
        public int setQtyInStock( int qtyInStock)
        {
         this.qtyInStock=qtyInStock;
        
         return qtyInStock;
         //return "new price set"+qtyInStock;
        }
        // getAuthorName(), getAuthorEmail(), getAuthorGender() in the Book class to return the name, email and gender of the author of the book. 
        public String getAuthorName(){
            return author.getName();
        }
        public String getAuthorEmail(){
            return author.getEmail();
        }
        public char getAuthorGender(){
            return author.getGender();
        }

		public String toString()
        {
            return name+" by "+author.getName()+" ("+author.getGender()+")"+" at "+author.getEmail();
        }
     }
