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

                if(tokens[0].equals("decl")) {
                    //do decl stuff
                }
                else if(tokens[0].equals("lab")){
                    //do lab stuff
                }
                else if(tokens[0].equals("subr")){
                    //do subr stuff
                }
                else if(tokens[0].equals("printi")){
                    //do printi stuff
                }
                else if(tokens[0].equals("jmp")){
                    //do jmp stuff
                }
                else if(tokens[0].equals("jmpc")){
                    //do jmpc stuff
                } else if (tokens[0].equals("cmpe")) {
                    //do cmpe stuff
                }
                else if(tokens[0].equals("cmplt")){
                    //do cmplt stuff
                }
                else if(tokens[0].equals("cmpgt")){
                    //do cmpgt stuff
                }
                else if(tokens[0].equals("pushi")){
                    //do pushi stuff
                }
                else if(tokens[0].equals("popm")){
                    //do popm stuff
                }
                else if(tokens[0].equals("popv")){
                    //do popv stuff
                }
                else if(tokens[0].equals("peek")){
                    //do peek stuff
                }
                else if(tokens[0].equals("poke")){
                    //do poke stuff
                }
                else if(tokens[0].equals("swp")){
                    //do swp stuff
                }
                else if(tokens[0].equals("add")){
                    //do add stuff
                }
                else if(tokens[0].equals("sub")){
                    //do sub stuff
                }
                else if(tokens[0].equals("mul")){
                    //do mul stuff
                }
                else if(tokens[0].equals("div")){
                    //do div stuff
                }
            }
        }catch(Exception e){
            System.out.println("Exception thrown when reading file");
        }
    }
}
