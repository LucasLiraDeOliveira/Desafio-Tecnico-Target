public class Fibo {
    protected int valor; // número que será checado se é da sequencia de fibonacci


    public Fibo() {}


    public void setValor(int valor) {
        this.valor = valor;
    }

    public  boolean checaFibo(){
        int x = 0, y = 1, aux = 0, numFibo = 0;

        do {
            if (valor == aux){
                numFibo = 1;
                continue;
            }
            if (valor < aux){
                numFibo = 2;
                continue;
            }

            aux = x + y;
            x = y;
            y = aux;
        } while (numFibo == 0);

        if (numFibo == 1)
            return true;
        else
            return false;
    }
}