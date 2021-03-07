package hu.jnagy.creational;

public final class Computer {
    private final String CPU;
    private final String motherboard;
    private final String GPU;
    private final String HDD;
    private final String operatingSystem;
    private final int powerSupply;
    private final int amountOfRAM;

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", GPU='" + GPU + '\'' +
                ", HDD='" + HDD + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", powerSupply=" + powerSupply +
                ", amountOfRAM=" + amountOfRAM +
                '}';
    }

    private Computer(Computer.Builder builder) {
        this.CPU = builder.CPU;
        this.motherboard = builder.motherboard;
        this.GPU = builder.GPU;
        this.HDD = builder.HDD;
        this.operatingSystem = builder.operatingSystem;
        this.powerSupply = builder.powerSupply;
        this.amountOfRAM = builder.amountOfRAM;
    }

    public static class Builder {
        private String computerCase;
        private String CPU;
        private String motherboard;
        private String GPU;
        private String HDD;
        private String operatingSystem;
        private int powerSupply;
        private int amountOfRAM;

        public Builder withCase(String computerCase) {
            this.computerCase = computerCase;
            return this;
        }

        public Builder withCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder withMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public Builder withGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder withHDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public Builder withOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Builder withPowerSupply(int powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public Builder withAmountOfRam(int amountOfRAM) {
            this.amountOfRAM = amountOfRAM;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
