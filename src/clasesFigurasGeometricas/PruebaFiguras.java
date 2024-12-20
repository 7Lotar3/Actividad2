package clasesFigurasGeometricas;

public class PruebaFiguras {
        public static void main(String[] args) {
            //Se crea una figura de cada una, se les dan parámetros y se calculan sus áreas y perímetros
            Circulo figura1 = new Circulo(2);
            Rectangulo figura2 = new Rectangulo(1, 2);
            Cuadrado figura3 = new Cuadrado(3);
            trianguloRectangulo figura4 = new trianguloRectangulo(3, 5);
            Rombo figura5 = new Rombo(5,3,4);
            Trapecio figura6 = new Trapecio(10,6,4,5,7);
            System.out.println("El área del círculo es = " + figura1.calcularArea());
            System.out.println("El perímetro del círculo es = " + figura1
                    .calcularPerimetro());
            System.out.println();

            System.out.println("El área del rectángulo es = " + figura2.calcularArea());
            System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
            System.out.println();

            System.out.println("El área del cuadrado es = " + figura3.calcularArea());
            System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
            System.out.println();

            System.out.println("El área del triángulo rectángulo es = " + figura4.calcularArea());
            System.out.println("El perímetro del triángulo rectángulo es = " + figura4.calcularPerimetro());
            figura4.determinarTipoTriangulo();
            System.out.println();

            System.out.println("El área del rombo es = " + figura5.calcularArea());
            System.out.println("El perímetro del rombo es = " + figura5.calcularPerimetro());
            System.out.println();

            System.out.println("El área del trapecio es = " + figura6.calcularArea());
            System.out.println("El perímetro del trapecio es = " + figura6.calcularPerimetro());
            System.out.println();
        }
}
