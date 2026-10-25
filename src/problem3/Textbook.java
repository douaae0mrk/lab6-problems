package problem3;

public class Textbook extends Book{
    public String level ;
    public Textbook(){}
    public Textbook(String title , String author , int nbrPages, String level){
        super(title  , author , nbrPages);
        this.level=level;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nLevel : ");
        sb.append(this.level);
        return sb.toString();
    }
}

