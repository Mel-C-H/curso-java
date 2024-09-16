public class PrimeraClase {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido(a) a Screen Match!");
        System.out.println("Película: Prisoners");


        int fechaDeLanzamiento = 2013;
        double calificacion = 8.2;
        int clasificacion = (int) (calificacion / 2);


        String sinopsis = """
                How far would you go to protect your family? Keller Dover is facing every parent's worst nightmare.\s
                His six-year-old daughter, Anna, is missing, together with her young friend, Joy, and as minutes turn to hours, panic sets in.\s
                The only lead is a dilapidated RV that had earlier been parked on their street. Heading the investigation,\s
                Detective Loki arrests its driver, Alex Jones, but a lack of evidence forces his release.\s
                As the police pursue multiple leads and pressure mounts,\s
                knowing his child's life is at stake the frantic Dover decides he has no choice but to take matters into his own hands.\s
                But just how far will this desperate father go to protect his family? - Dennis Villenueve.
               \s""";
        System.out.println(sinopsis);

        String datosDeLaPelicula = """
                Release date: %d
                Score: %d""".formatted(fechaDeLanzamiento, clasificacion);
        System.out.println(datosDeLaPelicula);

    }
}
