package ex_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {
        int harshal_salary = 15;
        boolean b = !(harshal_salary > 10 || harshal_salary < 5);
        System.out.println(b);

        // Divide and Conquer!

        // A -> balaji_salary > 10 -> 12 > 10 -> true
        // B -> balaji_salary < 5 -> 12 <5 -> false
        // (A || B) -> TRUE
        // !(true) -> False

    }
}
