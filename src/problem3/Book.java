package problem3;

public class Book extends Document{
    protected String author ;
    protected int nbrPages ;
    public Book(){
    }
    public Book(String title , String author , int nbrPages){
        super(title);
        this.author=author;
        this.nbrPages=nbrPages;
    }

    public String getAuthor() {
        return author;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nAuthor : ");
        sb.append(this.author);
        sb.append("\nNumber of pages : ") ;
        sb.append(this.nbrPages);
        return sb.toString();
    }
}
