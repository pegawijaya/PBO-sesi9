public class ContainString {
    public static void main(String[] args) {
        String name = "Welcome to Mangcoding";
        System.out.println("The result is: " + name.contains("Mangcoding"));
        System.out.println("The result is: " + name.contains("to"));
        System.out.println("The result is: " + name.contains("Hello"));
    }
}

//Output:
// The result is: true
// The result is: true
// The result is: false


