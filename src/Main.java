public class Main {
    public static void main(String[] args) {
        System.out.println("======= 1 funkcija =======");
        priimti();
        System.out.println("======= 2 funkcija =======");
        pisQ();
        System.out.println("======= 3 funkcija =======");
        sandauga();
        System.out.println("======= 4 funkcija =======");
        ciklas();
        System.out.println("======= 5 funkcija =======");
        random();
        System.out.println("======= 6 funkcija =======");


    }

    public static void priimti() {
        int sk = 1;
        int sk1 = 2;
        int sum = sk + sk1;
        System.out.println(sum);
    }

    public static void pisQ() {
        double d = 9.8596;
        System.out.println(d);
    }

    public static void sandauga() {
        int num = 3;
        int num1 = 4;
        int x = num * num1;
        System.out.println(x);
    }
    public static void ciklas(){
        int O = 0;
        for (; O < 10; O++) {
            System.out.print(O + ",");
        }
        System.out.println();
    }
    public static void random(){
        double numb = Math.random()*10;
        double numb1 = Math.random()*10;
        System.out.println("Pirmas skaičius yra: " + numb);
        System.out.println("Antras skaičius yra: " + numb1);
        if (numb <=numb1){
            System.out.println("Pirmas skaičius mažesnis už " + numb1);
        }
        if (numb >=numb1){
            System.out.println("Antras skaičius didesnis už " + numb);
        }
    }



























    }
