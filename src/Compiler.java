import java.io.*;
import java.lang.*;
import java.nio.Buffer;


public class Compiler {

    public static void main (String[] args) throws IOException {
        BufferedReader reader = null;

        OutputStream os = new FileOutputStream("Basics.bin");

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
                    os.write((byte)(70));
                    os.write(toBytes(16));
                    os.write((byte)(70));
                    os.write(toBytes(17));
                    os.write((byte)(70));
                    os.write(toBytes(1));
                    os.write((byte)(44));
                    os.write((byte)(0));

                }
                else if(tokens[0].equals("printi")){
                    //do printi stuff
                    //writer.write(toBinaryString(146));
                    os.write((byte)(70));
                    os.write(toBytes(Integer.parseInt(tokens[1])));
                    os.write((byte)(146));
                    //os.write(toBytes(Integer.parseInt(tokens[1])));
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
                    os.write((byte)(132));

                }
                else if(tokens[0].equals("cmplt")){
                    //do cmplt stuff
                    os.write((byte)(136));
                }
                else if(tokens[0].equals("cmpgt")){
                    //do cmpgt stuff
                    os.write((byte)(140));
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
                    os.write((byte)(70));
                    os.write(toBytes(Integer.parseInt(tokens[1])));
                    os.write((byte)(76));
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
                    os.write((byte)(94));
                }
                else if(tokens[0].equals("add")){
                    //do add stuff
                    os.write((byte)(100));
                }
                else if(tokens[0].equals("sub")){
                    //do sub stuff
                    os.write((byte)(104));
                }
                else if(tokens[0].equals("mul")){
                    //do mul stuff
                    os.write((byte)(108));
                }
                else if(tokens[0].equals("div")){
                    //do div stuff
                    os.write((byte)(112));
                }
                else if(tokens[0].equals("ret")){
                    os.write((byte)(70));
                    os.write(toBytes(0));
                    os.write((byte)(77));
                    os.write((byte)(48));
                }
            }
            //writer.close();
        }catch(Exception e) {
            System.out.println("Exception thrown when reading file");
        }
    }

    public static byte[] toBytes(int i) {
        byte[] result = new byte[4];
        result[3] = (byte) (i >> 24);
        result[2] = (byte) (i >> 16);
        result[1] = (byte) (i >> 8);
        result[0] = (byte) (i /*>> 0*/);
        return result;
    }

}
