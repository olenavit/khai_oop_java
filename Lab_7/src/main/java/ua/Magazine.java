package ua;

public class Magazine extends Publication {
    public boolean hasSudoku = false;

    public Magazine() {
    }

    public Magazine(int numPages, String name, String language, boolean hasSudoku) {
        super(numPages, name, language);
        this.hasSudoku = hasSudoku;
    }


    public double cost(){
        return hasSudoku?numPages*4+50:numPages*4;
    }
    @Override
    public String toString() {
        return "Magazine{" +
                "numPages=" + numPages +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", name='" + name + '\'' +
                ", hasSudoku=" + hasSudoku +
                '}';
    }
}
