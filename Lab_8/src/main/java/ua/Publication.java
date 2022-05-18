package ua;


public abstract class Publication {
    public int numPages;
    public String name;
    public String language;

    public Publication(int numPages, String name, String language) {
        this.numPages = numPages;
        this.name = name;
        this.language = language;
    }

    public Publication() {

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
}
