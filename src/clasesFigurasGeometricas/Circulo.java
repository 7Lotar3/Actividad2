package clasesFigurasGeometricas;


public class Circulo {
    //Atributos
    int radio;

    //Construcctor
    public Circulo(int radio) {
        this.radio = radio;
    }

    //Métodos
    //Cálculo del área
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    //Cálculo del perímetro
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

