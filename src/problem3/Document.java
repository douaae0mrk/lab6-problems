package problem3;

public class Document {
    private static int counter = 0;
    protected int numRec=0 ;
    protected  String title ;
    public Document(){
        numRec=0;
    }
    public Document(String title ){
        this.title= title ;
        this.numRec=++counter;
    }
    public int getNumRec(){
        return this.numRec;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Record number: ");
        sb.append(numRec-1);
        sb.append("\nTitle: ");
        sb.append(this.title);
        return sb.toString();
    }
}
