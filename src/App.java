import java.util.Scanner;

public class App {
    static int mood = 80;
    static double money = 15;
    static Food[] menu = { new Food(7.0, "grilled cheese",
            new String[] { "MiniWag: So you want to know about the", "Normal Grilled Cheese Sandwich?",
                    "Unlike Lunchables, we use real cheese.", "Look, drip, versus stick.",
                    "In the words of the wise philosopher Logan Paul,", "I like my grilled cheese drippy bruh." }),
            new Food(40.0, "stunner",
                    new String[] { "Note to any lawyers,", "This is not in any way equal to a Whopper.",
                            "Neither is this plagiarism.", "Any resemblance to other burgers,",
                            "Fictional or living,", "Is entirely a coincidence." }),
            new Food(15.0, "mike",
                    new String[] { "I’m going to be completely honest,", "We don’t even make these.",
                            "If you order this we’ll just send one of", "Our delivery guys to pick it up from",
                            "MikeDonalds and repackage it in or wrapping.", "If you notice a bite, that’s because",
                            "Sometimes they get a little hungry on the way" }),
            new Food(25.0, "kilogramer",
                    new String[] { "Convert that to pounds.", "Literally.", "All Americans do is eat.",
                            "The metric system is the best.", "Europe is the best." }),
            new Food(18000.0, "gold brick",
                    new String[] { "Pros:", "- Retains Value", "- Shiny", "- Can be made into various objects",
                            "Cons:", "- Heavy", "- Will get you robbed", "- Tastes like metal" }),
            new Food(2 * Math.pow(10, 15), "canada",
                    new String[] { "Wikipedia can probably", "Explain it better than I can." }),
            new Food(0.62, "spongebob", new String[] { "This may be the best or worst", "Purchase of your life.",
                    "I’m just saying,", "If you play clarinet and are a squid,", "I would avoid the purchase." }),
            new Food(Math.pow(2, 1023) * 1.99999999, "world peace",
                    new String[] { "I’m pretty sure you can’t get that much money.",
                            "Like it literally hits the integer limit and you’d",
                            "Be stuck washing dishes for eternity.",
                            "Not that I would sell it to you,", "Even if you had enough." }),
            new Food(10.0, "chicken",
                    new String[] { "This is actually different", "From the slop they serve at Amador",
                            "For one, we use actual chicken,", "Not monkey knees grinded",
                            "With (2R,3S,4R,5R)-2,3,4,5,6-Pentahydroxyhexanal.", "(Also known as Glucose)" }),
            new Food(18.0, "whyaburger", new String[] { "Why should you buy this?", "Why not?" }) };
    static int[] order = new int[10];

    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner input = new Scanner(System.in);
        System.out
                .println("MiniWag: Hello and welcome to Sandwich Emperor! What do you want today? Do you need a menu?");
        System.out.println("Type 'quit' to exit the conversation");
        while (true) {
            String action = input.nextLine();
            clearScreen();
            if (action.toLowerCase().equals("quit")) {
                break;
            }
            menuDialogue(action);
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void menuDialogue(String action) {
        if (ck(action, new String[] { "menu" })) {
            if (money >= 10) {
                System.out.println("MiniWag: Sure! Here is the menu:");
                Scanner input = new Scanner(System.in);
                while (true) {
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
                    if (action2.toLowerCase().equals("quit")) {
                        break;
                    }
                    foodResponse(action2);
                }
            } else {
                System.out.println("MiniWag: Wait hold on, you don't have any money!");
                System.out.println("MiniWag: Ask for money and do a minigame to get some");
            }

        } else if (ck(action, new String[] { "money" })) {
            clearScreen();
        } else {
            randomResponse();
        }
    }

    public static void foodResponse(String action) {
        Scanner input = new Scanner(System.in);
        if (ck(action, new String[] { "what" }) && ck(action, new String[] { "grilled" })
                && ck(action, new String[] { "cheese" })) {
            menu[0].printDesc();
        } 
        else if (ck(action, new String[] { "what" }) && ck(action, new String[] { "stunner" })) {
            menu[1].printDesc();
        } 
        else if (ck(action, new String[] { "what" }) && ck(action, new String[] { "large" })
                && ck(action, new String[] { "mike" })) {
            menu[2].printDesc();
        } 
        else if (ck(action, new String[] { "what" }) && ck(action, new String[] { "kilogramer" })) {
            menu[3].printDesc();
        } 
        else if (ck(action, new String[] { "what" }) && (ck(action, new String[] { "gold" })
                || ck(action, new String[] { "brick" }))) {
            menu[4].printDesc();
        } 
        else if (ck(action, new String[] { "what" }) && ck(action, new String[] { "canada" })) {
            menu[5].printDesc();
        } 
        else if (ck(action, new String[] { "what" }) && ck(action, new String[] { "spongebob" })) {
            menu[6].printDesc();
        } 
        else if (ck(action, new String[] { "what" }) && ck(action, new String[] { "world" })
                && ck(action, new String[] { "peace" })) {
            menu[7].printDesc();
        } 
        else if (ck(action, new String[] { "what" }) && ck(action, new String[] { "chicken" })
                && ck(action, new String[] { "sandwich" })) {
            menu[8].printDesc();
        } 
        else if (ck(action, new String[] { "what" }) && ck(action, new String[] { "whyaburger" })) {
            menu[9].printDesc();
        } 
        else if (ck(action, new String[] { "buy", "take", "have", "grab" })) {
            System.out.println("MiniWag: Oh yeah, I don't take orders for more than one of anything");
            System.out.println("MiniWag: Im not here to give yall obesity");
            System.out.println("MiniWag: Anyways, let me get this straight, you want");
            for (int i = 0; i < menu.length; i++) {
                if (ck(action, new String[] { menu[i].getName() })) {
                    order[i]++;
                    System.out.println("a " + menu[i].getName());
                }
            }
            System.out.println("Correct?");
            String action2 = input.nextLine();
            clearScreen();
        } 
        else {
            randomResponse2();
        }
        if(ck(action,new String[] {"what"})){
            System.out.println("Type anything else to continue");
            String action2 = input.nextLine();
            purchaseResponse(action2);
            clearScreen();
        }
    }

    public static void purchaseResponse(String action){
        if(ck(action, new String[] {"no","not"})){
            
        }
        else if(ck(action, new String[] {"yes","correct"})){

        }
    }

    public static void randomResponse() {
        int num = (int) (Math.random() * 4);
        if (num == 0) {
            System.out.println("MiniWag: Uhh sorry, I didn't understand that");
        } else if (num == 1) {
            System.out.println("MiniWag: Um, do you need help? Maybe ask for the menu?");
        } else if (num == 2) {
            System.out.println("MiniWag: I don't think understand that, try asking for a menu");
        } else if (num == 3) {
            System.out.println("MiniWag: Not sure what you're trying to say, do you want a menu?");
        }
    }

    public static void randomResponse2() {
        int num = (int) (Math.random() * 3);
        if (num == 0) {
            System.out.println("I don't know what you are saying");
            System.out.println("If you need to know anything about the menu, then just ask about it");
        } 
        else if (num == 1) {
            System.out.println("I don't think i understand, if you want some info about any item on the menu,");
            System.out.println("Just ask about it, or maybe you want to buy something?");
        } 
        else if(num==2) {
            System.out.println("Uhh sorry, but I didn't get that, do you want to buy something?");
        }
    }

    public static boolean ck(String input, String[] keywords) {
        for (int i = 0; i < keywords.length; i++) {
            if (input.toLowerCase().indexOf(keywords[i]) != -1) {
                return true;
            }
        }
        return false;
    }
}

class Food {
    private double cost;
    private String name;
    private String[] decription;

    Food(double c, String n, String[] d) {
        cost = c;
        name = n;
        decription = d;
    }

    double getCost() {
        return cost;
    }

    String getName() {
        return name;
    }

    void printDesc() {
        for (String i : decription) {
            System.out.println(i);
        }
    }
}