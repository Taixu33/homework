public class HelloWorld {
    public void greet(String[] greetingString)
    {
        for (String s: greetingString) {
            System.out.print(s + " "); 
        }
        System.out.println();
    }
    
    public static void main (String args[])
    {
        HelloWorld helloworld;
        helloworld = new HelloWorld ();
        helloworld.greet (args) ;
    } 
}