// Step 2. Create new class and implement interface to override their respective methods
public class Airtel implements Sim{

    @Override
    public void calling() {
        System.out.println("Calling through AIRTEL...");
    }

    @Override
    public void data() {
        System.out.println("Welcome to AIRTEL 5G...");
    }
}
