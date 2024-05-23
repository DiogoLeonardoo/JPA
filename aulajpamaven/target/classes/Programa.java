import object.Pessoa;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pessoa p1 = new Pessoa(1, "João", "diogoleo57@gmail.com");
        Pessoa p2 = new Pessoa(2, "Maria", "diogoleonardo@gmail.com");
        Pessoa p3 = new Pessoa(3, "José", "djkadja@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p3.setEmail("sdfafa@gmail.com");
        System.out.println(p3);
    }
}