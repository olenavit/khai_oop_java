package ua;

public class Publication {
    public int numPages;
    public String name;
    public String language;

    public Publication() {
    }

    public Publication(int numPages, String name, String language) {
        this.numPages = numPages;
        this.name = name;
        this.language = language;
    }

    public double cost() {
        return numPages*2.5/100;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "numPages=" + numPages +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
