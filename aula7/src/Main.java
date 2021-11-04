public class Main {
    public static void main(String[] args) {
        teste.C1 a,b,c;
        Object o1;
        Object o2;
        Object o3;
        a = new teste.C2();
        b = new teste.C2();
        c = new teste.C3();
        o1 = a.cria();
        o1 = a.cria();
        o2 = b.cria();
        o3 = c.cria();
        o3 = c.cria();
        a.mostra();
        b.mostra();
        c.mostra();
        System.out.println(o1 + " - " + o2 + " - " + o3);
    }
}

class teste {
    abstract public class C1 {
        abstract public Object cria();
        public void mostra () {
            System.out.println("Poscomp 2014");
        }
    }

    public static class C2 extends C1 {
        static int i = 0;
        Integer j;
        public Object cria () {
            i++;
            j = i;
            return j;
        }
        public void mostra () {
            System.out.println("j=" + j);
        }
    }

    public class C3 extends C1 {
        double d = 3.14;
        Float f;
        public Object cria () {
            d = d + 1.0;
            f = (float) d;
            return f;
        }
        public void mostra () {
            System.out.println("f=" + f);
        }
    }
}