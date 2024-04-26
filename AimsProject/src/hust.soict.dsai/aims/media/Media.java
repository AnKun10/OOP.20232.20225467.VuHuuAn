package hust.soict.dsai.aims.media;

public abstract class Media {
    protected static int nbMedias = 0;
    protected int id;
    protected String title;
    protected String category;

    protected float cost;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media(String title) {
        this.title = title;
        nbMedias++;
        this.id = nbMedias;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = nbMedias;
    }

    public boolean isMatch(String title) {
        return this.title == title;
    }
}
