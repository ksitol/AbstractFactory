public class VolvoMinivan implements Minivan {
    @Override
    public void putPassengers(int passengers) {
        if (passengers <= 4) {
            System.out.println("Пассажири расселись на свои места в VolvoMinivan");
        } else {
            System.out.println("VolvoMinivan рассчитан только на 4 пассажирских места");
        }

    }

    @Override
    public void putCargo(int mass) {
        if (mass <= 200) {
            System.out.println("VolvoMinivan загружен");
        } else {
            System.out.println("VolvoMinivan перегружен");
        }
    }
}
