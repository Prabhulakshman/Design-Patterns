package Various_Patterns_Adapter_Pattern;

//Adapter class implementing the NewSystem interface
class Adapter implements NewSystem {
 private OldSystem oldSystem;

 public Adapter(OldSystem oldSystem) {
     this.oldSystem = oldSystem;
 }

 @Override
 public void doSomethingNew() {
     // Delegating the call to the existing method
     oldSystem.doSomethingOld();
 }
}
