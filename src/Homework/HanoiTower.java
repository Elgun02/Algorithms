package Homework;


public class HanoiTower {
    public static void main(String[] args) {
        int nDisks = 3;
        doTowers(nDisks, 'A', 'B', 'C');
    }
    public static void doTowers(int disk, char A, char B, char C) {
        if (disk == 1) {
            System.out.println("Диск 1 от " + A + " до " + C);
        } else {
            doTowers(disk - 1, A, C, B);
            System.out.println("Диск " + disk + " от " + A + " до " + C);
            doTowers(disk - 1, B, A, C);
        }
    }
}

// итеративно не смог
