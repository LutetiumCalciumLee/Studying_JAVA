// A case of implementing an interface and inheriting a class at the same time.
interface PhoneInterface { // Interface declaration
    final int TIMEOUT = 10000; // Constant field declaration
    void sendCall(); // Abstract method
    void receiveCall(); // Abstract method
    default void printLogo() { // Default method
        System.out.println("** Phone **");
    }
}

interface MobilePhoneInterface extends PhoneInterface {
    void sendSMS();
    void receiveSMS();
}

interface MP3Interface { // Interface declaration
    public void play();
    public void stop();
}

class PDA { // Class definition
    public int calculate(int x, int y) {
        return x + y;
    }
}

// The SmartPhone class inherits PDA and implements all abstract methods declared in
// MobilePhoneInterface and MP3Interface.
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
    // Implementation of abstract methods from MobilePhoneInterface
    @Override
    public void sendCall() {
        System.out.println("Ring ring~~");
    }
    @Override
    public void receiveCall() {
        System.out.println("You have a call.");
    }
    @Override
    public void sendSMS() {
        System.out.println("Sending a message.");
    }
    @Override
    public void receiveSMS() {
        System.out.println("You received a message.");
    }
    // Implementation of abstract methods from MP3Interface
    @Override
    public void play() {
        System.out.println("Playing music.");
    }
    @Override
    public void stop() {
        System.out.println("Stopping music.");
    }
    // Additional method
    public void schedule() {
        System.out.println("Managing schedule.");
    }
}

public class ex09 {
    public static void main(String [] args) {
        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        phone.sendCall();
        phone.play();
        System.out.println("3 plus 5 is " + phone.calculate(3,5));
        phone.schedule();
    }
}