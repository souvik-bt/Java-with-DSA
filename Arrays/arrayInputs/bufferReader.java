import java.io.*;

public class bufferReader {
    public static void main(String[] args) throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        
        // string input
        //String str = br.readLine();
        //System.out.print(str);

        // integer input
        int num1 = Integer.parseInt(br.readLine());
        System.out.print(num1);

        //double input
        double num2 = Double.parseDouble(br.readLine());
        System.out.print(num2);

    }
}
