import java.util.Scanner;
public class TextAdventure {
    public int beingType;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goal = 20;
        int encounterTimer = 10;
        int health = 100;
        int mentalStress = 0;
        int type = typeChoice();
        int[] stats = getStats(type);
        String typeName = getTypeName(type);
        String userName = getUserName();
        System.out.println("\nYou are " + userName + " the " + typeName + " being. Your goal is to escape the facility alive.\n");
        System.out.println("Your stats:\n" +
                "STRENGTH:     " + stats[0] +
                "\nDEXTERITY:    " + stats[1] +
                "\nWILLPOWER:    " + stats[2] +
                "\nAWARENESS:    " + stats[3] +
                "\nINTELLIGENCE: " + stats[4]);
        System.out.println("\nTo see a list of commands type \"help\".");

        do{
            //case everything
            System.out.println("What will you do?\n");
            //help
            //inv
            //examine
            //progress
            encounterTimer--;
            if(encounterTimer <= 0) {
                //battle
                encounterTimer = (int)Math.ceil(Math.random() * 20);
            }
            goal--;
        } while(goal > 0);
    }

    public static String input(String question) {
        Scanner sc = new Scanner(System.in);
        System.out.println(question);
        return sc.next();
    }

    public static boolean contPrompt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you sure? (y/n)");
        String input = sc.next();
        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"))
            return true;
        else return false;
    }

    public static String getUserName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What will you call yourself?");
        String userName = sc.nextLine();
        if(userName.length() > 30) {
            System.out.println("That name is too long!");
            return getUserName();
        }
        System.out.print("So, you will be called " + userName + "? ");
        if (!contPrompt()) return getUserName();
        return userName.trim();
    }

    public static int typeChoice() {
        String answer = input("You just escaped from your containment cell.\n" +
                "You're not sure how, everything's hazy and you can't remember much.\n" +
                "What type of being are you?\n\n" +
                "1. Memetic\n" +
                "2. Physically Strong\n" +
                "3. Resistive\n");

        switch (answer) {
            case "1":
                System.out.println(
                        "\nYou are a memetic being, you can influence others' minds and twist their thinking to your needs.\n" +
                                "Beware however, there are some who are immune to trickery of the senses.\n");
                if(!contPrompt())
                    typeChoice();
                return 1;

            case "2":
                System.out.println(
                        "\nYou are a very powerful beast; a force to be reckoned with. You can force your way out of situations or\n" +
                                "into them if you please. Beware of Memetic foes, as they will take advantage of your simple mind.\n");
                if(!contPrompt())
                    typeChoice();
                return 2;

            case "3":
                System.out.println(
                        "\nYou are an extremely resistive being. You hardly waver in both mind and body.\n" +
                                "Beware however, you are not of above or below average intelligence. You simply can ignore most things.\n");
                if(!contPrompt())
                    typeChoice();
                return 3;

            default:
                typeChoice();
                break;
        }
        return 1;
    }

    public static String getTypeName(int typeID) {
        switch (typeID) {
            case 1: return "memetic";
            case 2: return "physically strong";
            case 3: return "resistive";
            default: return null;
        }
    }

    public static int[] getStats(int typeID) {

        //strength, dexterity, willpower, awareness, intelligence
        int[] stats = {0, 0, 0, 0, 0};
        switch (typeID) {
            case 1:
                stats[0] = 2;
                stats[1] = 2;
                stats[2] = 4;
                stats[3] = 7;
                stats[4] = 5;
            break;
            case 2:
                stats[0] = 6;
                stats[1] = 3;
                stats[2] = 5;
                stats[3] = 4;
                stats[4] = 2;
            break;
            case 3:
                stats[0] = 4;
                stats[1] = 2;
                stats[2] = 8;
                stats[3] = 2;
                stats[4] = 4;
            break;
            default: break;
        }
        return stats;
    }
}
