import java.util.Scanner;
public class App {
    int mood = 80;
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner input = new Scanner (System.in);
        System.out.println("MiniWag: Hello and welcome to Sandwich Emperor! What do you want today?");
        while(true){
            String action = input.nextLine();
            clearScreen();
            if(action.toLowerCase().equals("quit")){
                break;
            }
            tempDialouge(action);
        }
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    public static void tempDialouge(String action){
        if(action.toLowerCase().indexOf("menu")!=-1){
            System.out.println("Sure! Here is the menu: ");
            System.out.println("Menu go here");
        }
        else{
            randomResponse();
        }
    }
    public static void randomResponse(){
        int num = (int)(Math.random()*3);
        if(num==0){
            System.out.println("Uhh sorry, I didn't understand that");
        }
        else if(num==1){
            System.out.println("Um, do you need help? Maybe ask for the menu?");
        }
        else if(num==2){
            System.out.println("I don't think I can do that, try asking for a menu");
        }
    }
}
