package clasesFigurasGeometricas;

public class Trapecio {
    //Atributos
    int baseMayor, baseMenor, altura, lado1, lado2;

    //Constructor
    public Trapecio(int baseMayor, int baseMenor, int altura, int lado1, int lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Métodos
    double calcularArea() {
        return ((double)((baseMayor + baseMenor) / 2) * altura);
    }

    double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}
