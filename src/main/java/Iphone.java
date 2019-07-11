public class Iphone extends Mobile{

    public Iphone(String name, String color, String brand) {
        super(name, color, brand);
    }

    public void makeCall(String message){
        System.out.println("<iPhone>Message : " + message);
    }

    public void printInfo() {
        System.out.println("name: " + getName() + ", color: " + getColor() + ", brand: " + getBrand());
    }
}
