public class BookClass {
   int bookNumber;
   String bookTitle;
   
   public BookClass(int bookNumber, String bookTitle) {
      this.bookNumber = bookNumber;
      this.bookTitle = bookTitle;
   }
   
   @Override
   public String toString() {   //¿Á¡§¿«
      return bookTitle + ":" + bookNumber;
   }

}