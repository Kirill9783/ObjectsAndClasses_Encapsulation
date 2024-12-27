public class Cargo {

    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAdress;
    private final boolean canTurn;
    private final String registrationNumber;
    private final boolean fragile;

    public double getWeight() {
        return weight;
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, deliveryAdress,
                canTurn, registrationNumber, fragile);
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public Cargo setDeliveryAdress(String deliveryAdress) {
        return new Cargo(dimensions, weight, deliveryAdress,
                canTurn, registrationNumber, fragile);
    }

    public boolean isCanTurn() {
        return canTurn;
    }

    public Cargo setCanTurn(boolean canTurn) {
        return new Cargo(dimensions, weight, deliveryAdress,
                canTurn, registrationNumber, fragile);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Cargo setRegistrationNumber(String registrationNumber) {
        return  new Cargo(dimensions, weight, deliveryAdress,
                canTurn, registrationNumber, fragile);
    }

    public boolean isFragile() {
        return fragile;
    }

    public Cargo setFragile(boolean fragile) {
        return new Cargo(dimensions, weight, deliveryAdress,
                canTurn, registrationNumber, fragile);
    }

    public Cargo(Dimensions dimensions, double weight, String deliveryAdress,
                 boolean canTurn, String registrationNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAdress = deliveryAdress;
        this.canTurn = canTurn;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    public String toString() {
        return "Данные груза под номером: " + getRegistrationNumber() + "\n" +
                "Вес груза: " + getWeight() + " кг" + "\n" +
                "Адрес доставки: " + getDeliveryAdress() + "\n" +
                "Возможность переворачивать груз: " + (isCanTurn() ? "да" : "нет") + "\n" +
                "Хрупкость: " + (isFragile() ? "да" : "нет");

    }
}
