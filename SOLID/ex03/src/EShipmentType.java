public enum EShipmentType implements IShipmentCostCalculator {
    STANDARD {
        @Override
        public double cost(Shipment s) {
            return 50 + 5 * s.weightKg;
        }
    },
    EXPRESS {
        @Override
        public double cost(Shipment s) {
            return 80 + 8 * s.weightKg;
        }
    },
    OVERNIGHT {
        @Override
        public double cost(Shipment s) {
            return 120 + 10 * s.weightKg;
        }
    };
}
