public class VolvoFactory implements CarFactory {
    @Override
    public Sedan getSedan() {
        return new VolvoSedan();
    }

    @Override
    public Minivan getMinivan() {
        return new VolvoMinivan();
    }

    @Override
    public Hatchback getHatchback() {
        return new VolvoHatchback();
    }
}
