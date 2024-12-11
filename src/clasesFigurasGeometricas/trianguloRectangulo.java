package clasesFigurasGeometricas;

public class trianguloRectangulo {
    //Atributos
    int base, altura;

    //Construcctor
    public trianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //Métodos
    //Calcular el área
    double calcularArea() {
        return ((double)base * altura / 2);
    }

    //Calcular el perímetro
    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }

    //Calcular la hipotenusa
    double calcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5d);
    }

    void determinarTipoTriangulo() {
        if (base == altura && base == calcularHipotenusa() && altura == calcularHipotenusa()) {
            System.out.println("Es un triángulo equilatero");
        } else if (base != altura && base != calcularHipotenusa() && altura != calcularHipotenusa()) {
            System.out.println("Es un triángulo escaleno");
        } else {
            System.out.println("Es un triangulo isósceles");
        }
    }
}
