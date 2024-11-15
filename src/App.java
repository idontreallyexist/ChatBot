import java.util.Scanner;
public class App {
    static int mood = 80;
    static double money = 15;
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
        if(ck(action,new String[] {"menu"}, false)){
            if(money>=15){
                Scanner input = new Scanner(System.in);
                while(true){
                    System.out.println("MiniWag: Sure! Here is the menu:");
                    System.out.println("Normal Grilled Cheese Sandwich: $15");
                    System.out.println("The Stunner: $50");
                    System.out.println("Large Mike: $25");
                    System.out.println("0.1133981 Kilogramer: $30");
                    System.out.println("Solid Gold Brick: $18,000");
                    System.out.println("Canada: $2,000,000,000,000,000");
                    System.out.println("Spongebob: $0.62");
                    System.out.println("World Piece: $1.79769323e+308");
                    System.out.println("Spicy Chicken Sandwich: $45");
                    System.out.println("The Whyaburger: $30");
                    String action2 = input.nextLine();
                    clearScreen();
                    if(action.toLowerCase().equals("quit")){
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
        else if(ck(action,new String[] {"money"}, false)){
            clearScreen();
        }
        else{
            randomResponse();
        }
    }
    public static void foodResponse(String action){
        if(ck(action, new String[] {"grilled", "cheese"}, true)){

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
    public static boolean ck(String input, String[] keywords, Boolean andFunction){
        int count = 0;
        for (int i=0;i<keywords.length;i++) {
            if(input.toLowerCase().indexOf(keywords[i])!=-1){
                if(andFunction==false){
                    return true;
                }
                else{
                    count++;
                }
            }
        }
        if (andFunction==false||count<keywords.length){
            return false;
        }
        else{
            return true;
        }
        
    }
}
