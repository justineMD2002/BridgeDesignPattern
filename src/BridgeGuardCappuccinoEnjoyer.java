public class BridgeGuardCappuccinoEnjoyer extends BridgeGuardCoffeeLover{
    public BridgeGuardCappuccinoEnjoyer(PrepCoffee prep) {
        super(prep);
    }

    @Override
    public void ikuzo() {
        getPrep().makeBeastCoffee();
        System.out.println("Bridge Guard Cappuccino Enjoyer.");

    }
}
