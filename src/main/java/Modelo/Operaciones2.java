package Modelo;

public class Operaciones2 {
    //atributos de la logica
    private int a;
    private int b;
    //constructor

    public Operaciones2(int a, int b) {
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

    public int potencia(){
        int resul = 1;
        if(a> 0 && b==0){
            return resul;
        }
        else if(a == 0 && b>=1){
            return 0;
        }
        else{
            for(int i = 1; i<= b; i++){
                resul = resul*a;
            }
            return resul;
        }
    }
    public double porcentaje() {
        double resul,p ,z;
        p= a;
        z= b  ;
        resul =p * z / 100;
        return resul;
    }
    public double raizcuadrada() {
        double radical,indice;
        radical= a;
        indice = b;
        return  (float) Math.pow(radical, 1/indice);
    }

    public String base2 () {

        return Integer.toString(a, 2);  //Binary;
    }
}