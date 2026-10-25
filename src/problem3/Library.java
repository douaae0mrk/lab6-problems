package problem3;
import javax.print.Doc;
import javax.swing.event.DocumentEvent;
import java.util.ArrayList;

public class Library {
    private int capacity ;
    ArrayList<Document> documents;
    public Library(int capacity){
        this.capacity=capacity;
        documents = new ArrayList<>(capacity);
    }
    public int getCapacity() { return capacity; }
    public int size()        { return documents.size(); }
    public void displayDocuments(){
        for(Document document:documents){
            System.out.println(document);
        }
    }

    public boolean  add(Document doc){
        if (doc == null || documents.size() >= capacity) return false;
        if (documents.contains(doc)) return false;
        documents.add(doc);
        return true;
    }
    public boolean  delete(Document doc){
        for(int i = 0 ; i<documents.size(); i++){
            if(documents.get(i)==doc){
                documents.remove(i);
                return true  ;
            }
        }
        return false ;
    }
    public Document document(int numEnrg){
        for(Document document : documents){
            if(document.getNumRec()==numEnrg){
                return document ;
            }
        }
        return null ;
    }
    public void displayAuthors(){
        for(Document document : documents){
            if(document instanceof Book){
                System.out.println(((Book) document).getAuthor());
            }
        }
    }
}
