package clasesFigurasGeometricas;

public class Rectangulo {
    //Atributos
    int base, altura;

    //Constructor
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //Métodos
    //Calcular el área
    double calcularArea() {
        return base * altura;
    }

    //Calcular perímetro
    double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}
