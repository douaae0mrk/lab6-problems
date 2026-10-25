package problem2;
import java.util.ArrayList;

public class Customer {
    private String name ;
    private ArrayList<Double> transactions= new ArrayList<Double>();
    public Customer(String name ){
        this.name = name ;
    }
    public void addTransaction(double transaction){
        transactions.add(transaction);
    }
    public String toString(){
        StringBuilder sb=new  StringBuilder();
        sb.append("Name : ") ;
        sb.append(this.name);
        sb.append("\nTransactions: ");
        for (double t : transactions){
            sb.append(t);
            sb.append("; ");
        }
        return sb.toString() ;
    }

}
