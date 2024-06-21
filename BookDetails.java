package demoproject;

public class BookDetails {
		    String title;
		    String author;
		    int year_published;
		    double price;
		    
		    public BookDetails(String title, String author, int year_published,double price) {
		        this.title = title ;
		        this.author = author;
		        this.year_published = year_published;
		        this.price = price;  
		}


		    public void displayDetails() {
		        System.out.println("Book Details:");
		        System.out.println("Title : " + title);
		        System.out.println("Author : " + author);
		        System.out.println("Year_published : " + year_published);     
		        System.out.println("Price : " + price);
		        System.out.println("*****************************************************************");
		        
		        
		    }
		    
		    public static void main(String[] args) {
		        
		    	BookDetails book = new BookDetails(" Romeo Juliet ", " William Shakesphere ", 1597,285.75);

		        book.displayDetails();
		    
	}

}
