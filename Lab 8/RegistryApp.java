public class RegistryApp {
  public static void main(String[] args) {
    // Create the registry object
    Registry theRegistry = new Registry();

    // Create an interface
    RegistryCLI theRegistryCLI = new RegistryCLI(theRegistry);

    // Display the menu
    theRegistryCLI.doMenu();
  }
}
