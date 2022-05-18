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
        return hasSudoku?getNumPages()*4+50:getNumPages()*4;
    }
    @Override
    public String toString() {
        return "Magazine{" +
                "numPages=" + getNumPages() +
                ", name='" + getName() + '\'' +
                ", language='" + getLanguage() + '\'' +
                ", name='" + getName() + '\'' +
                ", hasSudoku=" + hasSudoku +
                '}';
    }
}
