public class Person {
    private Mobile mobile;
    private String name;

    public Person(Mobile mobile, String name) {
        this.mobile = mobile;
        this.name = name;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message){
        mobile.makeCall(message);
    }

    public void changePhone(Mobile mobile){
        this.mobile= mobile;
    }
}
