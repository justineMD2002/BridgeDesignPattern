public class BridgeGuardLatteEnjoyer extends BridgeGuardCoffeeLover{
    public BridgeGuardLatteEnjoyer(PrepCoffee prep) {
        super(prep);
    }

    @Override
    public void ikuzo() {
        getPrep().makeBeastCoffee();
        System.out.println("Bridge Guard Latte Enjoyer.");
    }
}
