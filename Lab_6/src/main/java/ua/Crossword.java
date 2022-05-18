package ua;

public class Crossword extends Publication {
    public boolean isHard;
    public boolean hasAnegdot;

    public Crossword() {
    }

    public Crossword(int numPages, String name, String language, boolean isHard, boolean hasAnegdot) {
        super(numPages, name, language);
        this.isHard = isHard;
        this.hasAnegdot = hasAnegdot;
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
