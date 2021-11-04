public class Main {

    public static void main(String[] args) {
        int[] v = new int[5];
        for (int i = 0; i < 5; i++) {
            v[i] = i + i;
            System.out.println(v[i]);
        }
        Teste.inverte(v);
    }
}

class Teste {
    public static void inverte(int[] v){
        int[] w = new int[v.length];
        for(int i = 0; i < v.length; i++) w[v.length-i-1] = v[i];
        v = w;

        for (int i = 0; i < 5; i++) {
            System.out.println(v[i] + " - " + w[i]);
        }
    }
}