public class Demo03 {
    public static void main(String[] args) {
        Shipment shipment = new Shipment(EShipmentType.EXPRESS, 2.0);
        System.out.println(Enum.valueOf(EShipmentType.class, shipment.type.name()).cost(shipment));
    }
}
