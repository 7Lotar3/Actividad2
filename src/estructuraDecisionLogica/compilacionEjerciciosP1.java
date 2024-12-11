package estructuraDecisionLogica;

import java.util.Scanner;

public class compilacionEjerciciosP1 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    //PARTE 1
    //Capítulo 3
    System.out.println("-----------Prop N°18-----------");

    int empCod = 17854;
    String empNam = "Carlos Espitaleta";
    float horEmp = 45.6f, valHor = 43.2f, retEmp = 0.28f;

    System.out.println("El código "+ empCod +", asociado al empleado "+ empNam +" cuyo salario bruto es de "+
            horEmp*valHor +"$ y con una retención al salario del "+ retEmp*100 +"%");
    System.out.println();
    System.out.println("-----------Prop N°19-----------");

    System.out.println("Ingrese el lado deseado para su triángulo equilatero");
    double lado = entrada.nextDouble(), areaT, altT, perT;

    perT = lado * 3;
    //para un triángulo equilatero de lado A se tiene que los ángulos de los vértices son iguales a 60°, y la altura del triángulo es A*sena = A * ((3)^1/2)
    altT = lado * Math.sqrt(3) / 2;
    areaT = lado * altT / 2;

    System.out.println("El perímetro del triángulo es "+ perT +"uni, su altura es "+ altT +"uni y su área es "
            + areaT +"uni²");

    System.out.println();
    System.out.println("-----------Prop N°21-----------");

    System.out.println("ingrese los lados deseados para su triángulo de forma secuencial:");
    double lado1, lado2, lado3, perTT, semiper, areaTT;

    System.out.println("Ingrese la longitud del lado 1:");
    lado1 = entrada.nextDouble();
    System.out.println("Ingrese la longitud del lado 2:");
    lado2 = entrada.nextDouble();
    System.out.println("Ingrese la longitud del lado 3:");
    lado3 = entrada.nextDouble();

    perTT = lado1 + lado2 + lado3;
    semiper = perTT / 2;
    areaTT = Math.sqrt(semiper*(semiper-lado1)*(semiper-lado2)*(semiper-lado3));

    System.out.println("El perímetro del triángulo es "+ perTT +"uni, el semiperímetro es "+ semiper +
            "uni y su área es "+ areaTT +"uni²");
    System.out.println();

    //Capítulo 4
    System.out.println("-----------Res N°7-----------");
    int Ax, Bx;

    System.out.println("Ingrese el valor A:");
    Ax = entrada.nextInt();
    System.out.println("Ingrese el valor B:");
    Bx = entrada.nextInt();

    if (Ax > Bx) {
        System.out.println("A es mayor que B");
    } else if (Ax < Bx) {
        System.out.println("A es menor que B");
    } else { System.out.println("A es igual a B");
    }

    System.out.println();
    System.out.println("-----------Res N°10-----------");

    int crip, pat, est;
    float pagoM = 50000f;
    String name;

    System.out.println("Ingrese su número de inscripción:");
    crip = entrada.nextInt();
    System.out.println("Ingrese su nombre:");
    name = entrada.next();
    System.out.println("Ingrese su patrimonio:");
    pat = entrada.nextInt();
    System.out.println("Ingrese su estrato");
    est = entrada.nextInt();

    if (pat > 2000000 && est > 3) {
        pagoM += pat * 0.03f;
    }

    System.out.println("El estudiante con número de inscripción: " + crip + " y nombre: " + name + ", debe pagar: " + pagoM + "$");

    System.out.println();
    System.out.println("-----------Res N°11-----------");
    int x, y, z, may;

    System.out.println("Primer número:");
    x = entrada.nextInt();
    System.out.println("Segundo número:");
    y = entrada.nextInt();
    System.out.println("Tecer número:");
    z = entrada.nextInt();

    if (x > y && x > z) {
        may = x;
    } else if (y > x && y > z) {
        may = y;
    } else {
        may = z;
    }

    System.out.println("El mayor valor entre "+ x +", "+ y +" y "+ z +" es: "+ may);

    System.out.println();
    System.out.println("-----------Res N°12-----------");

    String nomT;
    int horT, valHT, horAd, horEx, pagoT = 0;

    System.out.println("Ingrese el nombre del trabajador:");
    nomT = entrada.next();
    System.out.println("Ingrese el total de horas trabajadas:");
    horT = entrada.nextInt();
    System.out.println("Ingrese el valor de la hora trabajada:");
    valHT = entrada.nextInt();

    if (horT > 40) {
        horAd = horT - 40;
        if (horAd > 8) {
            horEx = horAd - 8;
            pagoT = (40*valHT)+(8*(2*valHT))+(horEx*(3*valHT));
        } else {
            pagoT = (40*valHT)+(horAd*(2*valHT));
        }
    } else {
        pagoT = horT*valHT;
    }

    System.out.println("El trabajador "+ nomT +" devengó "+ pagoT +"$");

    System.out.println();
    System.out.println("-----------Res N°13-----------");

    int valC;
    float desc, valP;
    String colB;

    System.out.println("Valor de la compra:");
    valC = entrada.nextInt();
    System.out.println("Color de la bola:");
    colB = entrada.next();

    if (colB.equals("blanca")) {
        desc = 0f;
    } else if (colB.equals("verde")) {
        desc = 0.1f;
    } else if (colB.equals("amarilla")) {
        desc = 0.25f;
    } else if (colB.equals("azul")) {
        desc = 0.50f;
    } else {
        desc = 1.0f;
    }
    valP = valC - valC*desc;

    System.out.println("El cliente debe pagar: $"+ valP);

    System.out.println("-----------Res N°14-----------");

    int venDep1, venDep2, venDep3, salGen, totVen;
    float salBon1 = 0, salBon2 = 0, salBon3 = 0, porVen;

    System.out.println("Ingrese el salario de los vendedores:");
    salGen = entrada.nextInt();
    System.out.println("Ingrese las ventas del departamento 1:");
    venDep1 = entrada.nextInt();
    System.out.println("Ingrese las ventas del departamento 2:");
    venDep2 = entrada.nextInt();
    System.out.println("Ingrese las ventas del departamento 3:");
    venDep3 = entrada.nextInt();

    totVen = venDep1 + venDep2 + venDep3;
    porVen = 0.33f*totVen;

    if (venDep1 > porVen) {
        salBon1 = salGen + salGen*0.2f;
    } else {
        salBon1 = salGen;
    }
    if (venDep2 > porVen) {
        salBon2 = salGen + salGen*0.2f;
    } else {
        salBon2 = salGen;
    }
    if (venDep3 > porVen) {
        salBon3 = salGen + salGen*0.2f;
    } else {
        salBon3 = salGen;
    }

    System.out.println("Salario vendedores depto 1: $"+ salBon1 +", salario vendedores depto 2: $"+ salBon2 +
            ", salario vendedores depto 3: $"+ salBon3);

    System.out.println();
    System.out.println("-----------Res N°15-----------");

    int A, B, C, D;

    System.out.println("Ingrese el peso de la esfera A:");
    A = entrada.nextInt();
    System.out.println("Ingrese el peso de la esfera B:");
    B = entrada.nextInt();
    System.out.println("Ingrese el peso de la esfera C:");
    C = entrada.nextInt();
    System.out.println("Ingrese el peso de la esfera D:");
    D = entrada.nextInt();

    if(A == B && A == C) {
        System.out.print("la esfera D es la diferente");
        if (D > A){
            System.out.print(" y tiene mayor peso");
        } else {
            System.out.print(" y tiene menor peso");
        }
    } else if (A == B && A == D) {
        System.out.print("la esfera C es la diferente");
        if (C > A) {
            System.out.print(" y tiene mayor peso");
        } else {
            System.out.print(" y tiene menor peso");
        }
    } else if (A == C && A == D) {
        System.out.print("la esfera B es la diferente");
        if (B > A) {
            System.out.print(" y tiene mayor peso");
        } else {
            System.out.print(" y tiene menor peso");
        }
    } else {
        System.out.print("la esfera A es la diferente");
        if (A > B) {
            System.out.print(" y tiene mayor peso");
        } else {
            System.out.print(" y tiene menor peso");
        }
    }

    System.out.println();
    System.out.println("-----------Prop N°22-----------");

    String nomb;
    int salHor, totHor, sala;

    System.out.println("ingrese el nombre del empleado:");
    nomb = entrada.nextLine();
    System.out.println("ingrese el valor pagado por hora de trabajo:");
    salHor = entrada.nextInt();
    System.out.println("ingrese el total de horas trabajadas en el mes:");
    totHor = entrada.nextInt();
    sala = salHor * totHor;

    if (sala > 450000) {
        System.out.print(nomb + " gana $" + sala);
    } else {
        System.out.print(nomb);
    }

    System.out.println("-----------Prop N°23-----------");

    double A1, B1, C1, disc, X1 = 0, X2 = 0;
    System.out.println("Ingrese el valor del parámetro A:");
    A1 = entrada.nextDouble();
    System.out.println("Ingrese el valor del parámetro B:");
    B1 = entrada.nextDouble();
    System.out.println("Ingrese el valor del parámetro C:");
    C1 = entrada.nextDouble();

    disc = Math.pow(B1, 2) - 4 * A1 * C1;
    if (disc < 0) {
        System.out.println("La ecuación no tiene solución Real");
    } else if (disc == 0) {
        X1 = (-1 * B1) / (2 * A1);
        System.out.println("La ecuación tiene solución única y ésta es: " + X1);
    } else {
        X1 = ((-1 * B1) - Math.sqrt(disc)) / (2 * A1);
        X2 = ((-1 * B1) + Math.sqrt(disc)) / (2 * A1);
        System.out.println("La ecuación tiene dos soluciones reales: X1 = " + X1 + " y X2 = " + X2);
    }

    System.out.println();
    System.out.println("-----------Prop N°24-----------");

    int A2, B2, C2;

    System.out.println("Ingrese el peso de la esfera A");
    A2 = entrada.nextInt();
    System.out.println("Ingrese el peso de la esfera B");
    B2 = entrada.nextInt();
    System.out.println("Ingrese el peso de la esfera C");
    C2 = entrada.nextInt();

    if (A2 > B2 && A2 > C2) {
        System.out.println("A es la esfera de mayor peso");
    } else if (B2 > A2 && B2 > C2) {
        System.out.println("B es la esfera de mayor peso");
    } else if (C2 > A2 && C2 > B2) {
        System.out.println("C es la esfera de mayor peso");
    }
    }
}
