// Step 3. Create another new class and implement interface to override their respective methods
public class Jio implements Sim{

    @Override
    public void calling() {
        System.out.println("Calling through JIO...");
    }

    @Override
    public void data() {
        System.out.println("Welcome to JIO 5G...");
    }
}
