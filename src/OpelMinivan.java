public class OpelMinivan implements Minivan {
    @Override
    public void putPassengers(int passengers) {
        if (passengers <= 4) {
            System.out.println("Пассажири расселись на свои места в OpelMinivan");
        } else {
            System.out.println("OpelMinivan рассчитан только на 4 пассажирских места");
        }

    }

    @Override
    public void putCargo(int mass) {
        if (mass <= 200) {
            System.out.println("OpelMinivan загружен");
        } else {
            System.out.println("OpelMinivan перегружен");
        }
    }
}
