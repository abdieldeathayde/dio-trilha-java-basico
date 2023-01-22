public class Main {
    public static void main(String[] args) {

        //Quadrilatero
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f);

        //Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero2.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero2.area(5d, 5d);
        System.out.println("Área do retângulo " + areaRetangulo);

        double areaTrapezio = Quadrilatero2.area(7, 8, 9);
        System.out.println("Área do trapéazio " + areaTrapezio);


        //Quadrilatero2.area(5f, 5f);
    

    }
}
