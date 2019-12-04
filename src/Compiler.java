import java.io.*;
import java.lang.*;
import java.nio.Buffer;


public class Compiler {

    public static void main (String[] args) throws IOException {
        BufferedReader reader = null;

        OutputStream os = new FileOutputStream("output.smp");

        // Starts writing the bytes in it


        byte[] result = toBytes(70);

        try {
            reader = new BufferedReader(new FileReader("basics.txt"));
            String line = reader.readLine();

            while (line != null) {
                String[ ] tokens = line.split(" ");
                System.out.println(tokens[0]);
                line = reader.readLine();

                if(tokens[0].equals("decl")) {
                    //do decl stuff
                    //writer.write("hi");

                }
                else if(tokens[0].equals("lab")){
                    //do lab stuff
                }
                else if(tokens[0].equals("subr")){
                    //do subr stuff
                    ///writer.write("hi");
                    os.write(toBytes(70));
                    os.write(toBytes(16));
                    os.write(toBytes(70));
                    os.write(toBytes(17));
                    os.write(toBytes(70));
                    os.write(toBytes(1));

                }
                else if(tokens[0].equals("printi")){
                    //do printi stuff
                    //writer.write(toBinaryString(146));
                }
                else if(tokens[0].equals("printv")){
                    //do printv stuff
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
                    //writer.write("70 " + tokens[1] + " 146");
                }
                else if(tokens[0].equals("pushv")){
                    //do pushv stuff

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
                    //writer.write("100"); //I think this is right but IDK
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
            //writer.close();
        }catch(Exception e) {
            System.out.println("Exception thrown when reading file");
        }
    }

    public static byte[] toBytes(int i) {
        byte[] result = new byte[4];
        result[0] = (byte) (i >> 24);
        result[1] = (byte) (i >> 16);
        result[2] = (byte) (i >> 8);
        result[3] = (byte) (i /*>> 0*/);
        return result;
    }

}
