package Tutorial4.Question1;

public class Letter implements Printable {

    private String letterContent = "";


    public String getLetterContent() {
        return letterContent;
    }

    public void setLetterContent(String letterContent) {
        this.letterContent = letterContent;
    }

    @Override
    public void print() {
        System.out.println(letterContent);
    }
}
