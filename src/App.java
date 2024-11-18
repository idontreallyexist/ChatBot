import java.util.Scanner;
public class App {
    static int mood = 80;
    static double money = 15;
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner input = new Scanner(System.in);
        System.out.println("MiniWag: Hello and welcome to Sandwich Emperor! What do you want today? Do you need a menu?");
        System.out.println("Type 'quit' to exit the conversation");
        while(true){
            String action = input.nextLine();
            clearScreen();
            if(action.toLowerCase().equals("quit")){
                break;
            }
            menuDialogue(action);
        }
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    public static void menuDialogue(String action){
        if(ck(action,new String[] {"menu"})){
            if(money>=10){
                Scanner input = new Scanner(System.in);
                while(true){
                    System.out.println("MiniWag: Sure! Here is the menu:");
                    System.out.println("Normal Grilled Cheese Sandwich: $7");
                    System.out.println("The Stunner: $40");
                    System.out.println("Large Mike: $15");
                    System.out.println("0.1133981 Kilogramer: $25");
                    System.out.println("Solid Gold Brick: $18,000");
                    System.out.println("Canada: $2,000,000,000,000,000");
                    System.out.println("Spongebob: $0.62");
                    System.out.println("World Peace: $1.79769314e+308");
                    System.out.println("Spicy Chicken Sandwich: $10");
                    System.out.println("The Whyaburger: $18");
                    String action2 = input.nextLine();
                    clearScreen();
                    if(action2.toLowerCase().equals("quit")){
                        break;
                    }
                    foodResponse(action);
                }
            }
            else{
                System.out.println("MiniWag: Wait hold on, you don't have any money!");
                System.out.println("MiniWag: Ask for money and do a minigame to get some");
            }
            
        }
        else if(ck(action,new String[] {"money"})){
            clearScreen();
        }
        else{
            randomResponse();
        }
    }
    public static void foodResponse(String action){
        if(ck(action, new String[] {"what"})&&ck(action,new String[] {"grilled"})&&ck(action, new String[] {"cheese"})){
            System.out.println("MiniWag: Test Dialogue");
        }
        else{
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
    public static void randomResponse2(){
        int num = (int)(Math.random()*3);
        if(num==0){
            System.out.println("I don't know what you are saying");
            System.out.println("If you need to know anything about the menu, then just ask about it");
        }
        else if(num==1){
            System.out.println("I don't think i understand, if you want some info about any item on the menu,");
            System.out.println("Just ask about it, or maybe you want to buy something?");
        }
        else{
            System.out.println("Uhh sorry, but I didn't get that, do you want to buy something?");
        }
    }
    public static boolean ck(String input, String[] keywords){
        for (int i=0;i<keywords.length;i++) {
            if(input.toLowerCase().indexOf(keywords[i])!=-1){
                return true;
            }
        }
        return false;
    }
}
