public class AndroidMobile extends Mobile {

    public AndroidMobile(String name, String color, String brand) {
        super(name, color, brand);
    }

    public void makeCall(String message) {
        if (message.length() > 40) {
            System.out.println("<Android>Message cannot be sent");
        } else {
            System.out.println("<Android>Message : " + message);
        }
    }

    public void printInfo() {
        System.out.println("name: " + getName() + ", color: " + getColor() + ", brand: " + getBrand());
    }
}
