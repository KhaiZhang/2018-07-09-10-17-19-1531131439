package practice07;

public class Klass {
    private int number;

    public String getDisplayName(){
        return "Class "+number;
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
