package clasesFigurasGeometricas;
public class Cuadrado {
    //Atributo
    int lado;

    //Constructor
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    //Métodos
    double calcularArea() {
        return lado * lado;
    }

    double calcularPerimetro() {
        return (4 * lado);
    }
}
