import java.io.*;
public class Main {
    private static Main instance = null;
    private PrintWriter myWriter;

    private Main() {
        try {
            myWriter=new PrintWriter(new FileOutputStream(new File("logger.txt"), true));
        } catch (FileNotFoundException e) {System.out.println(e);}
    }
    public static Main getInstance() {
        if (instance == null) {
            instance = new Main();
        }
        return instance;
    }
    public void print(String message) {
        myWriter.println(message);
        myWriter.flush();
    }

    public static void main(String[] args) {
        Main m = Main.getInstance();
        m.print("This is the 1st message");
        m.print("This is the 2nd message");
        m.print("This is the 3rd message");
    }


        /*
    public void closeWriter() {
        if (myWriter != null)
            myWriter.close();
    }

     */
}



