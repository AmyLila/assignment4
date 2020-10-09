package baker;


public class Hello {

    public void sayHello(String name){
        System.out.println("Hello, my name is "+name+"!");
    }

    public static void main(String[] args){
        Hello hello = new Hello();
        hello.sayHello( "Amy");
        System.out.println("Hello Amy, my name is Megan.");
        System.out.println("Essa é uma mensagem em português, e Wanderson a escreveu.");

    }


}
