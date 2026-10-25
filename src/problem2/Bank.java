package problem2;
import java.util.ArrayList;

public class Bank {
    private String name ;
    private ArrayList<Customer> customers= new ArrayList<Customer>();
    public Bank(String name ){
        this.name = name ;
    }
    public void addCustomer(Customer customer){
        for(Customer c:customers ){
            if (c==customer){
                return ;
            }
        }
        customers.add(customer);
    }
    public void addTransaction(Customer customer , double transaction ){
        for(Customer c:customers ){
            if (c==customer){
                 c.addTransaction(transaction);
                 return ;
            }
        }
    }
    public void printSummary(){
        Customer customer ;
        for(int i = 0 ; i<customers.size(); i++){
            customer= customers.get(i);
            System.out.println(customer);
        }
    }

}
