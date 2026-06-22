public class BuilderTest {

    public static void main(String[] args) {
        Computer officeComputer = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("8GB")
                .setStorage("512GB SSD")
                .build();

        Computer gamingComputer = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setStorage("2TB NVMe SSD")
                .setGpu("NVIDIA RTX 4090")
                .build();

        System.out.println("Office PC: " + officeComputer);
        System.out.println("Gaming PC: " + gamingComputer);
    }
}
