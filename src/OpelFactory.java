public class OpelFactory implements CarFactory {
    @Override
    public Sedan getSedan() {
        return new OpelSedan();
    }

    @Override
    public Minivan getMinivan() {
        return new OpelMinivan();
    }

    @Override
    public Hatchback getHatchback() {
        return new OpelHatchback();
    }
}
