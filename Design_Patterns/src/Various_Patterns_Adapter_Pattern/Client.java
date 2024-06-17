package Various_Patterns_Adapter_Pattern;

public class Client {
    public static void main(String[] args) {
        // Using the Adapter to make OldSystem work with NewSystem
        OldSystem oldSystem = new OldSystem();
        NewSystem adapter = new Adapter(oldSystem);

        // Calling the method on the NewSystem interface
        adapter.doSomethingNew();
    }
}
