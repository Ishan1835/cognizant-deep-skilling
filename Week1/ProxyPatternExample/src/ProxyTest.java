public class ProxyTest {

    public static void main(String[] args) {
        Image image = new ProxyImage("vacation_photo.jpg");

        System.out.println("First call to display():");
        image.display();

        System.out.println();
        System.out.println("Second call to display() (should use cache, not reload):");
        image.display();
    }
}
