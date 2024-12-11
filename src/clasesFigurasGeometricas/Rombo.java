package clasesFigurasGeometricas;

public class Rombo {
    //Atributos
    int diagonalMayor, diagonalMenor, lado;

    //Constructor
    public Rombo(int diagonalMayor, int diagonalMenor, int lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    //Métodos
    double calcularArea() {
        return (diagonalMayor * diagonalMenor / 2);
    }

    double calcularPerimetro() {
        return (4 * lado);
    }
}