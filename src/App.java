import java.util.Random;
import java.util.Scanner;

public class App {
    static int mood = 80;
    static double money = 0;
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
            new Food(13170.0, "gold brick",
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
            new Food(10.0, "chicken sandwich",
                    new String[] { "This is actually different", "From the slop they serve at Amador",
                            "For one, we use actual chicken,", "Not monkey knees grinded",
                            "With (2R,3S,4R,5R)-2,3,4,5,6-Pentahydroxyhexanal.", "(Also known as Glucose)" }),
            new Food(18.0, "whyaburger", new String[] { "Why should you buy this?", "Why not?" }) };
    static int[] order = new int[menu.length];
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        clearScreen();
        boolean flag=false;
        while (true) {
            if(!flag){
                System.out.println("MiniWag: Hello and welcome to Sandwich Emperor! What do you want today? Do you need a menu?");
                System.out.println("Type 'quit' to exit the conversation");
            }
            String action = input.nextLine();
            clearScreen();
            if (action.toLowerCase().equals("quit")) {
                break;
            }
            flag=menuDialogue(action);
            if(flag){
                break;
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void wait(int ms){
        try{
            Thread.sleep(ms);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }

    public static boolean menuDialogue(String action) {
        if (ck(action, new String[] { "menu" })) {
            if (money >= 10) {
                System.out.println("You have $"+money+"\n");
                System.out.println("MiniWag: Sure! Here is the menu:");
                System.out.println("MiniWag: If you need info about any item on the menu, just ask");
                System.out.println("MiniWag: I'll take your order when you are ready \n");
                System.out.println("Normal Grilled Cheese Sandwich: $7");
                System.out.println("The Stunner: $40");
                System.out.println("Large Mike: $15");
                System.out.println("0.1133981 Kilogramer: $25");
                System.out.println("Solid Gold Brick: $13,170");
                System.out.println("Canada: $2,000,000,000,000,000");
                System.out.println("Spongebob: $0.62");
                System.out.println("World Peace: $1.79769314e+308");
                System.out.println("Spicy Chicken Sandwich: $10");
                System.out.println("The Whyaburger: $18");
                boolean flag=false;
                String action2 = input.nextLine();
                flag=foodResponse(action2);
                while(!flag){
                    clearScreen();
                    menuDialogue("menu");
                }
                if (action2.toLowerCase().equals("quit")) {
                    return true;
                }
                return flag;
            } 
            else {
                System.out.println("MiniWag: Wait hold on, you don't have any money!");
                System.out.println("MiniWag: Ask for money and do a minigame to get some");
            }

        } 
        else if (ck(action, new String[] { "money" })) {
            clearScreen();
            money+=dishwasher();
            clearScreen();
            return false;
        } 
        else {
            randomResponse();
        }
        return false;
    }

    public static double dishwasher() {
        String[] words = {
            "absolutely", "amplified", "adventure", "beautiful", "brilliant", "courageous", "confident", "dangerous",
            "difficult", "delighted", "education", "expensive", "fascinate", "fortunate", "frequent", "generosity",
            "important", "incredible", "inspiration", "involvement", "involuntary", "nervously", "optimistic",
            "perspective", "profoundly", "successful", "significant", "terrifying", "understand", "wonderfully",
            "volunteer", "affection", "basketball", "chemistry", "culturally", "dangerous", "discovery", "enrollment",
            "exquisite", "facilitate", "flattering", "harmonious", "incredible", "intelligent", "mysterious",
            "satisfaction", "scientific", "scholarship", "surprising", "strengthen", "technique", "thoughtful",
            "thrilling", "transform", "tolerantly", "tremendous", "uncovered", "willingly", "amplifies",
            "consequence", "delighted", "explanation", "financially", "generously", "inspiration", "involvement",
            "introduction", "magnificent", "notorious", "perception", "philosophy", "reputation", "sociology",
            "substantial", "systematic", "theoretical", "unbelievable", "underestimate", "unpredictable", "unreliable",
            "profound", "accomplish", "particular", "expectation", "emotional", "efficiency", "educational",
            "difficulties", "expression", "connection", "accelerate", "backpacked", "believable", "celebration",
            "conventional", "dynamically", "enthusiast", "extraordinary", "humorously", "historical", "originally",
            "unraveling", "vocabulary", "voluntary", "exaggerate", "frequently", "favorable", "involves",
            "intensive", "loyalty", "mechanisms", "situation", "strategy", "variation", "vocational", "sensitive",
            "remembers", "politically", "sympathetic", "creativity", "economical", "involved", "foundation", "artificial",
            "conclusion", "colleague", "celebration", "generation", "lifestyles", "motivating", "congratulate",
            "mechanical", "projection", "provocative", "reliable", "sympathetically", "invisible", "renowned",
            "adaptation", "transformation", "corruption", "separation", "attraction", "modification", "regulation",
            "appreciated", "generations", "calculation", "initiation", "detonation", "legislation", "dedicated",
            "recollection", "departure", "discovery", "negotiation", "subsequent", "reception", "interference",
            "combination", "apprehension", "declaration", "fabrication", "proclamation", "introduction", "obligation",
            "assistance", "clarification", "reservation", "satisfaction", "meditation", "survival", "explanation",
            "adjustment", "examination", "acceleration", "entertainment", "representation", "clarification",
            "destination", "consideration", "distraction", "tolerance", "contradiction", "legislation", "implementation",
            "realization", "philosophical", "condensation", "situation", "adjustments", "frustration", "contribution",
            "documentation", "comprehension", "contemplation", "misunderstanding", "introspection", "reflection",
            "defensive", "clarity", "subordination", "dissatisfaction", "influence", "involvement", "questionnaire",
            "disruption", "contradictory", "attraction", "librarian", "toleration", "restoration", "legislation",
            "translation", "indifference", "excavation", "supplement", "proportion", "rationalization", "manifestation",
            "production", "proposition", "illustration", "concentration", "clarifying", "celebration", "subtraction",
            "classification", "consequences", "reorganization", "simplification", "destination", "transmission",
            "accomplishment", "standardization", "appreciation", "ascertain", "nourishment", "concentration", "proficiency"
        };
       
        double mg = 0.0;
       
        System.out.println("To get money, 'clean' the following words.");
        System.out.println("");
        System.out.println("Words will be given with two typos.");
        System.out.println("");
        System.out.println("Retype the word (case insensitive) with");
        System.out.println("the typos fixed.");
        System.out.println("");
        System.out.println("If you get a word wrong, that word will be skipped");
        System.out.println("and you will earn no money for that word.");
        System.out.println("");
        System.out.println("Type 'q' to quit.");
       
        String guess = "";
       
        int streak = 0;
       
        while (!guess.equals("q")) {
           
            int cwi = dice(0, words.length-1);
            String cw = words[cwi].toLowerCase();
            int dwi1 = dice(0,cw.length()-1);
            int dwi2 = dwi1;
            while (dwi2==dwi1) {
                dwi2 = dice(0,cw.length()-1);
            }
            if (dwi1>dwi2) {
                int swap = dwi1;
                dwi1 = dwi2;
                dwi2 = swap;
            }
            String dw = cw.substring(0,dwi1)+"#"+cw.substring(dwi1+1,dwi2)+"#"+cw.substring(dwi2+1);
           
            System.out.println("Current streak: "+streak+" ("+totwo(Math.pow(1.5,streak))+"x multiplier)");
            System.out.println("Total money gained: $"+mg);
            System.out.println(dw);
            guess = input.nextLine();
            if ((guess.toLowerCase()).equals(words[cwi].toLowerCase())){
                streak++;
                mg+=totwo(2*Math.pow(1.5,streak));
                System.out.println("");
                System.out.println("Success! You gained $"+totwo(2*Math.pow(1.5,streak))+".");
            } else if (!guess.equals("q")) {
                streak=0;
                System.out.println("");
                System.out.println("Incorrect. Your streak of "+streak+" has been reset.");
            }
        }
       
        return mg;
    }
   
    public static int dice(int a, int b) {
        Random random = new Random();
        return random.nextInt((b-a)+1)+a;
    }
   
    public static double totwo(double d) {
        d = Math.floor(d*100)/100.0;
        return d;
    }

    public static boolean foodResponse(String action) {
        clearScreen();
        if (ck(action, new String[] { "what","?" }) && ck(action, new String[] { "grilled" })
                && ck(action, new String[] { "cheese" })) {
            menu[0].printDesc();
        } 
        else if (ck(action, new String[] { "what","?" }) && ck(action, new String[] { "stunner" })) {
            menu[1].printDesc();
        } 
        else if (ck(action, new String[] { "what","?" }) && ck(action, new String[] { "large" })
                && ck(action, new String[] { "mike" })) {
            menu[2].printDesc();
        } 
        else if (ck(action, new String[] { "what","?" }) && ck(action, new String[] { "kilogramer" })) {
            menu[3].printDesc();
        } 
        else if (ck(action, new String[] { "what","?" }) && ck(action, new String[] { "gold","brick" })) {
            menu[4].printDesc();
        } 
        else if (ck(action, new String[] { "what","?" }) && ck(action, new String[] { "canada" })) {
            menu[5].printDesc();
        } 
        else if (ck(action, new String[] { "what","?" }) && ck(action, new String[] { "spongebob" })) {
            menu[6].printDesc();
        } 
        else if (ck(action, new String[] { "what","?" }) && ck(action, new String[] { "world" })
                && ck(action, new String[] { "peace" })) {
            menu[7].printDesc();
        } 
        else if (ck(action, new String[] { "what","?" }) && ck(action, new String[] { "chicken" })
                && ck(action, new String[] { "sandwich" })) {
            menu[8].printDesc();
        } 
        else if (ck(action, new String[] { "what","?" }) && ck(action, new String[] { "whyaburger" })) {
            menu[9].printDesc();
        } 
        else if (ck(action, new String[] { "buy", "take", "have", "grab", "want"})) {
            System.out.println("MiniWag: Oh yeah, I don't take orders for more than one of any item");
            System.out.println("MiniWag: Im not here to give yall obesity");
            System.out.println("MiniWag: Anyways, let me get this straight, you want");
            for (int i = 0; i < menu.length; i++) {
                if (ck(action, new String[] { menu[i].getName() })) {
                    order[i]++;
                    System.out.println("A " + menu[i].getName());
                }
            }
            System.out.println("Correct?");
            String action2 = input.nextLine();
            int flag = purchaseResponse(action2,action);
            if (flag==2){
                clearScreen();
                System.out.println("MiniWag: Oh, sorry then, mind repeating your order? \n");
            }
            else if(flag==3){
                clearScreen();
                System.out.println("You ended with $"+money);
                System.out.println("You bought");
                for(int i=0; i<order.length; i++){
                    if(order[i]==1){
                        System.out.println("A " + menu[i].getName());
                    }
                }
                return true;
            }
        } 
        else {
            randomResponse2();
        }
        if(ck(action,new String[] {"what"})){
            System.out.println("Type anything else to continue");
            String action2 = input.nextLine();
            clearScreen();
        }
        return false;
    }

    public static int purchaseResponse(String action, String pastAction){
        int flag=0;
        while(flag==0){
            if(ck(action, new String[] {"no","not"})){
                flag=2;
            }
            else if(ck(action, new String[] {"yes","correct"})){
                double priceSum=0.0;
                for(int i=0; i<order.length; i++){
                    priceSum+=order[i]*menu[i].getCost();
                }
                System.out.println("MiniWag: Alright, that will be $"+priceSum);
                if(priceSum>money){
                    System.out.println("MiniWag: Wait! You don't even have the money!");
                    System.out.println("MiniWag: Buy something thats within your budget buddy");
                    flag=1;
                }
                else{
                    System.out.println("MiniWag: Alright, its done! Come again soon, or don't");
                    money-=priceSum;
                    flag=3;
                }
            }
            else{
                clearScreen();
                randomResponse3();
                foodResponse(pastAction);
            }
        }
        return flag;
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
        System.out.println("Hit any key to continue");
        String action=input.next();
    }

    public static void randomResponse2() {
        int num = (int) (Math.random() * 3);
        if (num == 0) {
            System.out.println("MiniWag: I don't know what you are saying");
            System.out.println("MiniWag: If you need to know anything about the menu, then just ask about it \n");
        } 
        else if (num == 1) {
            System.out.println("MiniWag: I don't think i understand, if you want some info about any item on the menu,");
            System.out.println("MiniWag: Just ask about it, or maybe you want to buy something?");
            System.out.println("MiniWag: Make sure to clarify what you're trying to do, im not that smart \n");
        } 
        else if(num==2) {
            System.out.println("MiniWag: Uhh sorry, but I didn't get that, do you want to buy something?");
            System.out.println("MiniWag: If so, make sure to clarify that you are buying something");
            System.out.println("MiniWag: And not just saying the name of an item \n");
        }
        System.out.println("Hit any key to continue");
        String action=input.next();
    }
    
    public static void randomResponse3(){
        int num = (int) (Math.random() * 3);
        if(num==0){
            System.out.println("MiniWag: Buddy, its a yes or no question, answer it properly");
        }
        else if(num==1){
            System.out.println("MiniWag: Hey, uhh answer my question properly");
        }
        else if(num==2){
            System.out.println("MiniWag: How hard is it for you to say yes or no?");
        }
        System.out.println("Hit any key to continue");
        String action=input.next();
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