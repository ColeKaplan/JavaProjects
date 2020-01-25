import java.io.*;
public class createNewFile
{
    public static void main(String args[]) throws IOException
    {
        File file = new File("CodedByCode.java");
        boolean b1 = file.createNewFile();
        
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("public class CodedByCode {");
        bw.write("public static void main(String[] args) {");
        bw.write("System.out.print(\"Hi\");");
        bw.write("}}");
        bw.close();
        

    }
}