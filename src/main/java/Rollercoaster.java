public class Rollercoaster extends Attraction implements ISecurity, ITicketed {
    public Rollercoaster(String name) {
        super(name);
    }

    @Override
    public boolean isAllowed(Visitor visitor) {
        if (visitor.getAge() < 12 || visitor.getHeight() < 145 ) return false;
        return true;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200) return defaultPrice()*2;
        return defaultPrice();
    }
}
