public class VolvoSedan implements Sedan {
    @Override
    public void putPassengers(int passengers) {
        if (passengers <= 3) {
            System.out.println("Пассажири расселись на свои места в VolvoSedan");
        } else {
            System.out.println("VolvoSedan рассчитан только на 3 пассажирских места");
        }

    }

    @Override
    public void putCargo(int mass) {
        if (mass <= 100) {
            System.out.println("VolvoSedan загружен");
        } else {
            System.out.println("VolvoSedan перегружен");
        }

    }
}
