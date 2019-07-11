public class Mobile{
    private String name;
    private String color;
    private String brand;

    public Mobile(){}

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void makeCall(String message){
        if (message.length() > 20) {
            System.out.println("Message cannot be sent");
        } else {
            System.out.println("Message : " + message);
        }
    }
}