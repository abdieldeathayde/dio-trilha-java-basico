public class Quadrilatero2 {
    public static double area(double lado){
        //System.out.println("Área do quadrado: " + lado * lado);
        return lado * lado;
    }

    public static void area(double lado1, double lado2){
        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static double area(float diagonal1, float diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }
    
}
