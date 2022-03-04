package Cuenta;

import java.util.Scanner;

public class Cuenta {

    private int numeroCuenta;
    private int DNI;
    private double saldoActual;
    private double interes;
    private double dinero;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int DNI, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        dinero = 0;
        this.dinero = dinero;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        saldoActual = 0;
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public Cuenta crearCuenta() {
        Cuenta C1 = new Cuenta();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su numero de cuenta");
        numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su numero de DNI ");
        DNI = leer.nextInt();
        return C1;
    }

    public void ingresar(double dinero) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto dinero desea ingresar??");
        dinero = leer.nextDouble();
        double saldo = 0;
        saldoActual = saldo + dinero;
        System.out.println("Su saldo Actual es de: $ " + saldoActual);

    }

    public void retirar(double dinero) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto dinero desea retirar??");
        dinero = leer.nextDouble();
        saldoActual = saldoActual - dinero;
        if (saldoActual <= 0) {
            saldoActual = 0;
            System.out.println("La cuenta no tiene dinero sufiente para extraer. El saldoActual es: $ " + saldoActual);
        } else {
            System.out.println("Su saldo Actual es de: $ " + saldoActual);
        }
    }

    public void extraccionRapida(double dinero) {
        if (saldoActual <= (dinero * 20 / 100)) {
            System.out.println("La extracción rapida ha sido exitosa");
        } else {
            System.out.println("No es posible hacer extracción rapida.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Su saldo disponible en la cuenta es de: $ " + saldoActual);
    }

    public void consultarDatos() {
        System.out.print("INFORMACION DE LA CUENTA---> "
                + "Numero de Cuenta:" + numeroCuenta
                + " DNI:" + DNI
                + " Saldo Actual $ " + saldoActual);
    }

}
