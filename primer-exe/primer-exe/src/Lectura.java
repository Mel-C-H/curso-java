import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de la película:");
        String peliculaUsuario = teclado.nextLine();
       System.out.println("Escribe la fecha de lanzamiento (Esto si la conoces):");
        int releaseDate = teclado.nextInt();

        double mScore = 0;
        double score;

        for (int i = 0; i < 3; i++) {
            System.out.println("Que nota le das a esta película (entre 0 y 10)");
            score = teclado.nextDouble();
            mScore = mScore + score;
        }

        System.out.println(peliculaUsuario);
        System.out.println(releaseDate);
        System.out.println(mScore / 3);

        teclado.close();
    }
}
