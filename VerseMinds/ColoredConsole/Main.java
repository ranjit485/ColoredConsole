package VerseMinds.ColoredConsole;
public class Main {
 
    public static String RESET ="\u001B[0m";
    public static String  BLACK  = "\u001B[30m";
    public static String  RED    = "\u001B[31m";
    public static String  GREEN  = "\u001B[32m";
    public static String  YELLOW = "\u001B[33m";
    public static String  BLUE   = "\u001B[34m";
    public static String  PURPLE = "\u001B[35m";
    public static String  CYAN   = "\u001B[36m";
    public static String  WHITE  = "\u001B[37m";

    public static String  BRIGHT_BLACK  = "\u001B[90m";
    public static String  BRIGHT_RED    = "\u001B[91m";
    public static String  BRIGHT_GREEN  = "\u001B[92m";
    public static String  BRIGHT_YELLOW = "\u001B[93m";
    public static String  BRIGHT_BLUE   = "\u001B[94m";
    public static String  BRIGHT_PURPLE = "\u001B[95m";
    public static String  BRIGHT_CYAN   = "\u001B[96m";
    public static String  BRIGHT_WHITE  = "\u001B[97m";

    public static String  BG_BLACK  = "\u001B[40m";
    public static String  BG_RED    = "\u001B[41m";
    public static String  BG_GREEN  = "\u001B[42m";
    public static String  BG_YELLOW = "\u001B[43m";
    public static String  BG_BLUE   = "\u001B[44m";
    public static String  BG_PURPLE = "\u001B[45m";
    public static String  BG_CYAN   = "\u001B[46m";
    public static String  BG_WHITE  = "\u001B[47m";

    public static String  BRIGHT_BG_BLACK  = "\u001B[100m";
    public static String  BRIGHT_BG_RED    = "\u001B[101m";
    public static String  BRIGHT_BG_GREEN  = "\u001B[102m";
    public static String  BRIGHT_BG_YELLOW = "\u001B[103m";
    public static String  BRIGHT_BG_BLUE   = "\u001B[104m";
    public static String  BRIGHT_BG_PURPLE = "\u001B[105m";
    public static String  BRIGHT_BG_CYAN   = "\u001B[106m";
    public static String  BRIGHT_BG_WHITE  = "\u001B[107m";


    // Methods for print output without new line
   
    public static void print(String output){
        System.out.print(output);
    }
    
    // function for print colored text without new line
    public static void print(String output,String text){
        System.out.print(text+output+RESET);
    }
    // function for print output without new line
    public static void print(String output,String text,String backgroud){
        System.out.print(text+backgroud+output+RESET);
    }


    // function for print output with new line
   
    public static void println(String output){
        System.out.println(output);
    }
    
    // function for print colored text with new line

    public static void println(String output,String text){
        System.out.println(text+output+RESET);
    }

    // function for print output with new line

    public static void println(String output,String text,String backgroud){
        System.out.println(text+backgroud+output+RESET);
    }
    


    public static void main(String[] args) {
        // print("Hello World");
        print("Hello World",RED);

        // print("Hello World",RED,BG_WHITE);
        // print("Hello World",BLACK,BG_YELLOW);
        // print("Hello World",BLUE,BG_CYAN);
        
        // println("Hello World",RED);
        // println("Hello World",BLUE);

        // println("Hello World",RED,BG_WHITE);
        // println("Hello World",BLACK,BG_YELLOW);
        // println("Hello World",BLUE,BG_CYAN);

        
    }
}
