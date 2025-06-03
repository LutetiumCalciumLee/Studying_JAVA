// Interface implementation
interface PhoneInterface { // Interface declaration
    final int TIMEOUT = 10000; // Constant field declaration
    void sendCall(); // Abstract method
    void receiveCall(); // Abstract method
    default void printLogo() { // Default method
        System.out.println("** Phone **");
    }
}

class SamsungPhone implements PhoneInterface { // Interface implementation
    // Implements all abstract methods of PhoneInterface
    @Override
    public void sendCall() {
        System.out.println("Ringing...");
    }
    @Override
    public void receiveCall() {
        System.out.println("Incoming call.");
    }
    // Additional method
    public void flash() {
        System.out.println("The phone light is on.");
    }
}

public class ex08 {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}