package technology.infobite.com.yloproject.modal;

public class TwoVariableModel {

    private int image;
    private String name;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TwoVariableModel(int image, String name) {
        this.image = image;
        this.name = name;

    }
}
