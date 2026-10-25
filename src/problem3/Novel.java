package problem3;

public class Novel extends Book{
    public double price ;
    public Novel(){}
    public Novel(String title , String author , int nbrPages, double price){
        super(title  , author , nbrPages);
        this.price=price;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nPrice : ");
        sb.append(this.price);
        return sb.toString();
    }
}
