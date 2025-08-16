public class MainApplication {
    public static void main(String[] args) {

        System.out.println("This is a simple application for setting up Spring core project");

        //Step 4. Call SIM interface methods using Airtel class object
        Airtel air = new Airtel();
        air.calling();
        air.data();

        // Step 5. Call Jio methods using JIO class object
        Jio jio = new Jio();
        jio.calling();
        jio.data();

        // Step 6. To prevent calling each class object, we can use interface reference here
        System.out.println("************CALLING USING INTERFACE REFERENCE *******************");
        Sim sim1 = new Airtel();
        sim1.calling();
        sim1.data();
        Sim sim2 = new Jio();
        sim2.calling();
        sim2.data();
    }
}
