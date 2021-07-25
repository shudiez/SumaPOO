package suma;

public class Suma {
    
    //Creamos variables
    private int vUno, vDos, Resultado;

    //Constructores 
    public Suma(int valorUno, int valorDos) {
        this.vUno = valorUno;
        this.vDos = valorDos;
    }
    
    //Metodos
    public void Operacion() {
        Resultado = vUno + vDos;
    }

    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la suma es: " + Resultado);
    }
}
