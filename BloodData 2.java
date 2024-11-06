import java.util.Scanner;
     public class RunBlooddata {
      public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);

        BloodData bd = new BloodData();

        System.out.print("Enter blood type of patient: ");
        String input1 = wa.nextLine().trim();

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String input2 = wa.nextLine().trim();

        if (!input1.isEmpty()) {
            bd.setBloodType(input1);
        }
        if (!input2.isEmpty()) {
            bd.setRhFactor(input2);
        }

        bd.display();

        wa.close();
    }
}