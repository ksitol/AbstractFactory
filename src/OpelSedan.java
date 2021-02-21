public class OpelSedan implements Sedan {
    @Override
    public void putPassengers(int passengers) {
        if (passengers <= 3) {
            System.out.println("Пассажири расселись на свои места в OpelSedan");
        } else {
            System.out.println("OpelSedan рассчитан только на 3 пассажирских места");
        }

    }

    @Override
    public void putCargo(int mass) {
        if (mass <= 100) {
            System.out.println("OpelSedan загружен");
        } else {
            System.out.println("OpelSedan перегружен");
        }

    }
}
