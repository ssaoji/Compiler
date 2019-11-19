import java.io.*;

public class Compiler {
    public static void main (String[] args){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("basics.txt"));
            String line = reader.readLine();

            while (line != null) {
                String[ ] tokens = line.split(" ");
                System.out.println(tokens[0]);
                line = reader.readLine();
            }
        }catch(Exception e){
            System.out.println("Exception thrown when reading file");
        }
    }
}
