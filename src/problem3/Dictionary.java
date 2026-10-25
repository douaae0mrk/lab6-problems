package problem3;

public class Dictionary extends Document{
    private String language ;
    public Dictionary(){
    }
    public Dictionary(String title , String language ){
        super(title);
        this.language=language;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nLanguage : ");
        sb.append(this.language);
        return sb.toString();
    }
}
