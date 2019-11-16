import javax.swing.*;
import java.io.*;

public class StupidShit {
    private PrintStream out = System.out;
    public StupidShit(){
        out.print(add(200,400));
    }

    public static long add(int a, int b){ return (long)(a+b);}

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StupidShit();
            }
        });
    }
}
