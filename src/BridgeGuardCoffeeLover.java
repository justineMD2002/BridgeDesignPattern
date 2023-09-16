public abstract class BridgeGuardCoffeeLover {
    private PrepCoffee prep;

    public BridgeGuardCoffeeLover(PrepCoffee prep) {
        this.prep = prep;
    }

    public PrepCoffee getPrep() {
        return prep;
    }

    public void setPrep(PrepCoffee prep) {
        this.prep = prep;
    }

    public abstract void ikuzo();
}
