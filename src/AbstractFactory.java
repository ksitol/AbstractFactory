public class AbstractFactory {
    public static void main(String[] args) {

        CarFactory factory = getFactoryByBrand("Volvo");
        Sedan sedan = factory.getSedan();
        Minivan minivan = factory.getMinivan();
        Hatchback hatchback = factory.getHatchback();

        sedan.putCargo(95);
        minivan.putPassengers(3);
        hatchback.putCargo(120);

    }
    private static CarFactory getFactoryByBrand(String brand) {
        switch (brand) {
            case "Volvo":
                return new VolvoFactory();
            case "Opel":
                return new OpelFactory();
            default:
                throw new RuntimeException("Неподдерживаемый бренд");

        }
    }
}
