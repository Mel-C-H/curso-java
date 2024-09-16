public class Desiciones {
    public static void main(String[] args) {

        double calificacion = 8.2;
        int clasificacion = (int) (calificacion);

        System.out.println("Las más populares en las décadas anteriores:");
        switch (clasificacion / 2) {
            case 1:
                System.out.println("Esta película no la ves ni con unos ojos prestados");
                break;
            case 2:
                System.out.println("Esta película es lamentable");
                break;
            case 3:
                System.out.println("Esto, ni fu ni fa... Te entretiene pero no esperes mucho cine");
                break;
            case 4:
                System.out.println("Ahora estamos hablando de cine de calidad... Con mucho enfasis en CALIDAD");
                break;
            case 5:
                System.out.println("Esto ya se clasifica como OBRA MAGNA del cine");
                break;
            default:
                System.out.println("Seguramente nadie la conoce... Sé el primero en verla");
                break;
        }
    }
}
