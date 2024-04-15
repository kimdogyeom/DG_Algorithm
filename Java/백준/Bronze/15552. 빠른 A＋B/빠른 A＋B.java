import java.io.*;


public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        

        for(int i=0; i<count; i++){
            String input = br.readLine();

            String splitInput[] = input.split(" ");
            bw.write(Integer.parseInt(splitInput[0]) + Integer.parseInt(splitInput[1])+"\n");
        }
        bw.flush();
    }
}
