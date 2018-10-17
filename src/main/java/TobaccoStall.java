public class TobaccoStall extends Stall implements ITicketed, ISecurity {
    public TobaccoStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowed(Visitor visitor) {
        return false;
    }

    @Override
    public double defaultPrice() {
        return 0;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 0;
    }
}
