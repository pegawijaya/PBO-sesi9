public class ReplaceString {
    public static void main(String[] args) {
        String string1 = "Hello How Are You";
        String changeChar = string1.replace("H", "T");
        String changeSentence = string1.replace("Hello", "Good Morning");
        System.out.println("To replace character: " + changeChar);
        System.out.println("To replace sentence: " + changeSentence);
    }   
}

// Output:
// To replace character: Tello Tow Are You
// To replace sentence: Good Morning How Are You


