package ua;

public class Crossword extends Publication {
    private boolean isHard;
    private boolean hasAnegdot;

    public Crossword() {
    }

    public Crossword(int numPages, String name, String language, boolean isHard) {
        super(numPages, name, language);
        this.isHard = isHard;
    }

    @Override
    public String toString() {
        return "Crossword{" +
                "numPages=" + getNumPages() +
                ", name='" + getName() + '\'' +
                ", language='" + getLanguage() + '\'' +
                ", numPages=" + getNumPages() +
                ", isHard=" + isHard +
                '}';
    }


}
