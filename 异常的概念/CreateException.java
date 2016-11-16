package myException;

import java.util.Scanner;

class MyException extends Throwable {
    String string;

    public MyException(String string) {
        this.string = string;
    }

    public void print() {
        System.out.println(string);
    }
}

public class CreateException {
    public void myThrow(int number) throws MyException {
        if (number > 100) {
            throw new MyException("����̫��Ӧ��[0,100]֮�䣡");
        }
        if (number < 0) {
            throw new MyException("����̫С��Ӧ��[0,100]֮�䣡");
        }
    }

    public static void main(String[] args) {
        CreateException exception = new CreateException();
        Scanner in = new Scanner(System.in);
        try {
            int[] a = new int[5];
            for (int i = 0; i < 5; i++) {
                a[i] = in.nextInt();
                exception.myThrow(a[i]);
            }
        } catch (MyException e) {
            e.print();
        }
    }
}
