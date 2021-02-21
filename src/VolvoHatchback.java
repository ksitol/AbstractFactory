public class VolvoHatchback implements Hatchback {
    @Override
    public void putPassengers(int passengers) {
        if (passengers <= 3) {
            System.out.println("Пассажири расселись на свои места в VolvoHatchback");
        } else {
            System.out.println("VolvoHatchback рассчитан только на 3 пассажирских места");
        }
    }

    @Override
    public void putCargo(int mass) {
        if (mass <= 150) {
            System.out.println("VolvoHatchback загружен");
        } else {
            System.out.println("VolvoHatchback перегружен");
        }
    }
}
