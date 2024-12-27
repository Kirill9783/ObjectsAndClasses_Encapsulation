public class MainCargo {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(3, 1.5, 2);
        Cargo cargo = new Cargo(dimensions, 20, "Пушкина 63", true, "12345-ттн-54321", true);
        Cargo copy1 = cargo.setDeliveryAdress("Ильича 73");
        Dimensions copy = dimensions.setLength(10.0);
        System.out.println(dimensions);
        System.out.println(copy);
        System.out.println(copy1);
        System.out.println(cargo);
    }
}
