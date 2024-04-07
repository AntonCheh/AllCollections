package HashMap;

public class Initial {
    private String name;

    public Initial(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "name:" + name;
    }


}
