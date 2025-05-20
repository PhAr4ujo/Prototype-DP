package Entities;

public class Report implements Prototype {
    private String title;
    private String author;
    private String generationDate;
    private String content;

    public Report(String title, String author, String generationDate, String content) {
        this.title = title;
        this.author = author;
        this.generationDate = generationDate;
        this.content = content;
    }

    @Override
    public Report clone() {
        return new Report(title, author, generationDate, content);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(String generationDate) {
        this.generationDate = generationDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
