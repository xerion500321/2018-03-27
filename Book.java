public class Book {
    private String category,isbn,publisher,author;
    private int price;
    public Book(String category1,String isbn1,String publisher1,String author1,int price1 ){
        category = category1;
        isbn = isbn1;
        publisher = publisher1;
        author = author1;
        price = price1;
    }
    public void setCategory(String category1){
        category = category1;
    }
    public void setIsbn(String isbn1){
        isbn = isbn1;
    }
    public void setPublisher(String publisher1){
        publisher = publisher1;
    }
    public void setAuthor(String author1){
        author = author1;
    }
    public void setPrice(int price1){
        price = price1;
    }
    public String getCategory(){
        return category;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getPublisher(){
        return publisher;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }
    public void showAll(){
        System.out.println(category);
        System.out.println(isbn);
        System.out.println(publisher);
        System.out.println(author);
        System.out.println(price);
    }
}
