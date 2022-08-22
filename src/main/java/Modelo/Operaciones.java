package Modelo;

public class Operaciones {
    //atributos de la logica
    private int a;
    private int b;
    //constructor

    public Operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }
    //Metodos genericos

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    //metodos particulares
    public int sumar() {
        return a + b;
    }

    public int restar() {
        return a - b;
    }

    public int Multiplicar() {
        return a * b;
    }

    public int Dividir() {
        return a / b;
    }

}