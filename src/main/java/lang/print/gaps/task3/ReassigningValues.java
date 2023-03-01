package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        System.out.println(first + "\n" + second + "\n" + third);
        int linkToFirst;
        int linkToSecond;
        int linkToThird;
        linkToFirst = first;
        linkToSecond = second;
        linkToThird = third;
        linkToFirst = 15;
        linkToSecond = 6;
        linkToThird = 4;
        System.out.println(first + "\n" + second + "\n" + third);
        System.out.println(linkToFirst + "\n" + linkToSecond + "\n" + linkToThird);
    }
}
