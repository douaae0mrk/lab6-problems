package problem2;

public class Main {
    public static void main(String[] args){
        Customer c1= new Customer("Amine");
        c1.addTransaction(-123);
        c1.addTransaction(258);
        c1.addTransaction(566);
        Customer c2= new Customer("Aya");
        c2.addTransaction(120);
        c2.addTransaction(-259);
        c2.addTransaction(56);

        Bank b1= new Bank("bpp");
        b1.addCustomer(c1);
        b1.addCustomer(c2);
        b1.addTransaction(c1,423);
        b1.printSummary();

    }
}
