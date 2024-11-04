import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner input = new Scanner (System.in);
        System.out.println("MiniWag: Hello and welcome to Sandwich Emperor! What do you want today?");
        while(true){
            String action = input.nextLine();
            clearScreen();
        }
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
