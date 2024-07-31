package hello.exception;

import hello.exception.exception.UserException;

public class TestClass {
    public static void main(String[] args) {
        UserException ark = new UserException();
        System.out.println("dld" + ark.getClass());
        System.out.println(TestClass.class);
        throw new UserException();
    }
}
