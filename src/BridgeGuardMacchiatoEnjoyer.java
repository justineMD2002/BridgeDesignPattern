public class BridgeGuardMacchiatoEnjoyer extends BridgeGuardCoffeeLover{
    public BridgeGuardMacchiatoEnjoyer(PrepCoffee prep) {
        super(prep);
    }

    @Override
    public void ikuzo() {
        getPrep().makeBeastCoffee();
        System.out.println("Bridge Guard Macchiato Enjoyer.");
    }
}
