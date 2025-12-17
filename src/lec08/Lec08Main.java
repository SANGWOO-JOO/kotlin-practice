package lec08;

public class Lec08Main {

    public static void main(String[] args) {

    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void printAll(String... strings){
        for (String string : strings) {
            System.out.println(string);
        }
    }
}


