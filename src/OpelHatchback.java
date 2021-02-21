public class OpelHatchback implements Hatchback {
    @Override
    public void putPassengers(int passengers) {
        if (passengers <= 3) {
            System.out.println("Пассажири расселись на свои места в OpelHatchback");
        } else {
            System.out.println("OpelHatchback рассчитан только на 3 пассажирских места");
        }
    }

    @Override
    public void putCargo(int mass) {
        if (mass <= 150) {
            System.out.println("OpelHatchback загружен");
        } else {
            System.out.println("OpelHatchback перегружен");
        }
    }
}
