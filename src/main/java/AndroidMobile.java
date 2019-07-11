public class AndroidMobile extends Mobile {

    public AndroidMobile(String name, String color, String brand) {
        super(name, color, brand);
    }

    public void makeCall(String message) {
        System.out.println("<Andriod>Message : " + message);
    }

    public void printInfo() {
        System.out.println("name: " + getName() + ", color: " + getColor() + ", brand: " + getBrand());
    }
}
