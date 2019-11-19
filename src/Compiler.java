import java.io.*;

public class Compiler {
    public static void main (String[] args){
        System.out.println("Fuck this project this stupid ass project");

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename)); //TODO: change filename
            String line = reader.readLine();
            while (line != null) {
                parseLine(line); //TODO: implement parseLine
                line = reader.readLine();
            }
            }catch(Exception e){
                System.out.println("Exception thrown when reading file");
            }
        }
    }
}
