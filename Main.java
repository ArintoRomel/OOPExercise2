public class Main {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();
        computers.add(new LaptopComputer("Intel Core i7", 16, 512));
        computers.add(new DesktopComputer("AMD Ryzen 9", 32, 2048));
        for (Computer computer : computers) {
            System.out.println("This computer is portable: " + computer.portable());
        }
    }
}
