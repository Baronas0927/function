public class Main {
    public static void main(String[] args) {
        System.out.println("======= 1 funkcija =======");
        get(1, 50);
        get(16, 26);
        System.out.println("======= 2 funkcija =======");
        pisQ();
        System.out.println("======= 3 funkcija =======");
        multiplication(3, 5);
        System.out.println("======= 4 funkcija =======");
        int[] arr = {5, 8, 10};
        printArr(arr);
        System.out.println("======= 5 funkcija =======");
        random(4, 6);
        System.out.println("======= 6 funkcija =======");
        int[] newArr = arr(15, 20, 30);
        printArr(newArr);
        System.out.println("======= 7 funkcija =======");
        System.out.println(sumArr(newArr));
        System.out.println(avgArr(newArr));
        System.out.println("======= 9 funkcija =======");
        printStar(5, 6);
        System.out.println("======= 10 funkcija =======");
        CountLettersAndSpaces("sveiki gyvi");
        System.out.println("======= 11 funkcija =======");
        System.out.println();
        encryption("trys");


    }

    public static void get(int a, int b) {
        //======= 1 funkcija =======
        int sum = a + b;
        System.out.println(sum);
    }

    public static double pisQ() {
        //======= 2 funkcija =======
        return 9.8596;
    }

    public static int multiplication(int num, int num1) {
        //======= 3 funkcija =======
        return num * num1;
    }

    public static void printArr(int[] arr) {
        //======= 4 funkcija =======

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void random(int sk, int sk1) {
        //======= 5 funkcija =======
        if (sk <= sk1) {
            System.out.println("Pirmas skaičius mažesnis už " + sk1);
        }
        if (sk >= sk1) {
            System.out.println("Antras skaičius didesnis už " + sk);
        }
    }

    public static int[] arr(int min, int max, int length) {
        //======= 6 funkcija =======
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min + (int) Math.round(Math.random() * (max - min));
        }
        return arr;
    }

    public static int sumArr(int[] arr) {
        //======= 7 funkcija =======
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void ddouble() {

    }
    //======= 8 funkcija =======
public static double avgArr(int [] arr){
        return sumArr(arr) / (double) arr.length;
}
    //======= 9 funkcija =======
    public static void printStar(String text) {
        System.out.println("Tarpu yra " + (text.length() - text.replace(" ", "").length() + ", simboliu "+ text.replace(" ","")));
    }

    //======= 10 funkcija =======
    public static String CountLettersAndSpaces(String sentence) {
        int lettersCount = 0;
        int spacesCount = 0;
        for (char character : sentence.toCharArray()) {
            if (Character.isLetter(character)) lettersCount++;
        }
        for (char character : sentence.toCharArray()) {
            if (Character.isWhitespace(character)) {
                spacesCount++;
            }
        }

        System.out.print("Sakinyje - " + sentence);
        System.out.print(" yra " + lettersCount + " raidžių ");
        System.out.println("ir " + spacesCount + " tarpų");
    }

    //======= 11 funkcija =======
    //gemini
    public static String encryption(String sentence1) {
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = sentence1.length() - 1; i >= 0; i--) {
            reversedSentence.append(sentence1.charAt(i));
        }
        return reversedSentence.toString();
    }


}
