package exemplo.ws;

public class TestHelloWorld {

    public static void main(String[] args) {
     System.out.println(hello("Luis Gustavo"));
     
    }

    private static String hello(java.lang.String name) {
        exemplo.ws.HelloWorld_Service service = new exemplo.ws.HelloWorld_Service();
        exemplo.ws.HelloWorld port = service.getHelloWorldPort();
        return port.hello(name);
    }            
}
