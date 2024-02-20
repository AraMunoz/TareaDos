
package ejerciciocalculadora;

public class Calculadora {
    double valorUno;
    double valorDos;
    
    public Calculadora(double valorUno, double valorDos){
        this.valorUno=valorUno;
        this.valorDos=valorDos;
    }
    /*Sobre carga de metodos, se puede tener mas de un metodo con el mismo nombre 
    mientras los parametros sean distintos*/
    double suma(){
        return this.valorUno+this.valorDos;
    }
    /*double suma(double valorTres){
        return this.valorUno+this.valorDos+valorTres;
    }*/
    double resta(){
        return this.valorUno-this.valorDos;
    }

    double multiplicar(){
        return this.valorUno * this.valorDos;
    }
    double division(){
        return this.valorUno / this.valorDos;
    }
    

    
}
