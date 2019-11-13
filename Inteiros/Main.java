class Main {
    public static void main(String args[]) {
        Inteiros nums = new Inteiros(54);

        nums.inicializa();

        System.out.println("Menor: " + nums.menor());
        System.out.println("Maior: " + nums.maior());
    }
}