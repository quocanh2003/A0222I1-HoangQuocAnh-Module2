package ss14_exception_handing_debug.Bai_tap;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException() {
    }
    public IllegalTriangleException(String message) {
        super(message);
    }
}
