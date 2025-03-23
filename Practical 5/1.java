
class CPU {

    double price;

    class Processor {

        double cores;
        String manufacturer;

        Processor(double cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        double getCache() {
            return 4.0; // Default cache value for demonstration
        }

        void displayProcessorDetail() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
            System.out.println("Processor Cache: " + getCache() + " MB");
        }
    }

    public class RAM { // Changed from protected to public for external access

        double memory;
        String manufacturer;

        RAM(double memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        double getClockSpeed() {
            return 2.4; // Default clock speed value for demonstration
        }

        void displayRAMDetail() {
            System.out.println("RAM Memory: " + memory + " GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
            System.out.println("RAM Clock Speed: " + getClockSpeed() + " GHz");
        }
    }

    CPU(double price) {
        this.price = price;
    }
}

public class Main {

    public static void main(String[] args) {
        CPU cpu = new CPU(500.0);
        CPU.Processor processor = cpu.new Processor(4, "Intel"); // Correct way to instantiate inner class
        CPU.RAM ram = cpu.new RAM(8, "Kingston"); // Corrected instantiation

        System.out.println("CPU Price: $" + cpu.price);
        System.out.println("Processor Details:");
        processor.displayProcessorDetail();
        System.out.println("\nRAM Details:");
        ram.displayRAMDetail();
    }
}
