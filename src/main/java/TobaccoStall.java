public class TobaccoStall extends Stall implements ITicketed, ISecurity {
    public TobaccoStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowed(Visitor visitor) {
        if (visitor.getAge() < 18) return false;
        return true;
    }

    @Override
    public double defaultPrice() {
        return 6.60;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}
