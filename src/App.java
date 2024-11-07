import java.util.Scanner;
public class App {
    int mood = 80;
    int money = 150;
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner input = new Scanner(System.in);
        System.out.println("MiniWag: Hello and welcome to Sandwich Emperor! What do you want today?");
        System.out.println("Type 'quit' to exit the conversation");
        while(true){
            String action = input.nextLine();
            clearScreen();
            if(action.toLowerCase().equals("quit")){
                break;
            }
            menuDialouge(action);
        }
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    public static void menuDialouge(String action){
        if(action.toLowerCase().indexOf("menu")!=-1){
            System.out.println("MiniWag: Sure! Here is the menu: ");
            System.out.println("Menu go here");
        }
        else{
            randomResponse();
        }
    }
    public static void randomResponse(){
        int num = (int)(Math.random()*4);
        if(num==0){
            System.out.println("MiniWag: Uhh sorry, I didn't understand that");
        }
        else if(num==1){
            System.out.println("MiniWag: Um, do you need help? Maybe ask for the menu?");
        }
        else if(num==2){
            System.out.println("MiniWag: I don't think understand that, try asking for a menu");
        }
        else if(num==3){
            System.out.println("MiniWag: Not sure what you're trying to say, do you want a menu?");
        }
    }
}
