package ua;

public class Crossword extends Publication {
    public boolean isHard;

    public Crossword() {
    }

    public Crossword(int numPages, String name, String language, boolean isHard) {
        super(numPages, name, language);
        this.isHard = isHard;
    }

    public boolean hasAnegdot(){
        return super.cost()>200;
    }

    @Override
    public String toString() {
        return "Crossword{" +
                "numPages=" + numPages +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", numPages=" + numPages +
                ", isHard=" + isHard +
                '}';
    }
}
