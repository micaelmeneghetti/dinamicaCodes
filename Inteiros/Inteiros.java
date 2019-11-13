class Inteiros {

    private int inteiros[]; 
    private int tam;

    public Inteiros(int t) {
        this.inicializa();
        this.tam = t;
        inteiros = new int[t];
    }

    void inicializa() {
        for (int i = 0; i < tam; i++) {
            inteiros[i] = i + 1;
        }
    }

    int maior() {
        int maior = inteiros[0];
        for (int i = 0; i < tam; i++) {
            if(inteiros[i] > maior) maior = inteiros[i];
        } 

        return maior;
    }

    int menor() {
        int menor = inteiros[0];
        for (int i = 0; i < tam; i++) {
            if(inteiros[i] < menor) menor = inteiros[i];
        } 

        return menor;
    }

    /*void add(int n) {
        for (int i = 0; i < tam; i++) {
            if(inteiros[i] == null) inteiros[i] = n;
        }
    }*/

}