package problem3;

public class Magazine extends Document{
    private String month ;
    private int year ;
    public Magazine(){
    }
    public Magazine(String title , String month , int year){
        super(title);
        this.month=month;
        this.year=year;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nMonth : ");
        sb.append(this.month);
        sb.append("\nYear : ") ;
        sb.append(this.year);
        return sb.toString();
    }

}
