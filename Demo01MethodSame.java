package cn.sust.day01.demo03;
/*
比较两个数是否相同，方法的使用。
 */
public class Demo01MethodSame {
    public static void main(String[] args) {

        isSame(10,20);
    }

    public static boolean isSame(int a, int b) {
        /*
        plan 1:
        boolean same;
        if(a == b)
            same = turn;
        else same = false;

        plan 2:
        same = a == b ? turn : false;
        plan 3:
        boolean same = a == b;
        return  same;
         */
        return a==b;
    }
}
