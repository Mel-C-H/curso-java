import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double score = 0;
        double mScore = 0;
        double tScore = 0;

        while (score != -1) {
            System.out.println("Que nota le pones a esta película (entre 0 - 10)");
            score = teclado.nextDouble();

            if (score != -1) {
                mScore += score;
                tScore++;
            }
        }
        System.out.println(mScore / tScore);
    }
}
