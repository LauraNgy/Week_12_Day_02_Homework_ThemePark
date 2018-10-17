public class IceCreamStall extends Stall implements ITicketed{
    public IceCreamStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public double defaultPrice() {
        return 2.80;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}
