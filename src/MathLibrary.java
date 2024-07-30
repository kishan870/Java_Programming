public class MathLibrary {
    public static void main(String args[]) {
        int a = 67;
        System.out.println(Math.sqrt(a));
        System.out.println("Max value: " + Math.max(5, 8));

        int randomNum = (int)(Math.random() * 101); //Random num between 0 to 100
        System.out.println("Random number: " + randomNum);
    }
}
