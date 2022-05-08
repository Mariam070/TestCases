public class EvenOdd {
    public String check(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Weight must be >= zero");
        if (n % 2 == 0)
            return "Even";
        else
            return "Odd";
    }
}
