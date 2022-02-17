package sk.stuba.fei.uim.oop;

public class AP {
    public static void main(String[] args) {
        int[] pole = new int[10];
        for(int i = 0; i < pole.length; i++){
            pole[i] = i;
        }
        for(int i = 0; i < pole.length; i++){
            AP.vypis(i);
        }
    }
    public static void vypis(int x){
        System.out.println(x);
    }
}
