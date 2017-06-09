//Java program by Alex Bledsoe, 06/08/2017

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //Create file and data output stream.
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("lab10.txt"));
        //Write strings to the file.
        dos.writeUTF("Boy, ");
        dos.writeUTF("isn't ");
        dos.writeUTF("Java ");
        dos.writeUTF("just ");
        dos.writeUTF("grand?");
        //Open the file and create new data input stream.
        DataInputStream dis = new DataInputStream(new FileInputStream("lab10.txt"));
        //Read each string and assign it to a variable, then close input stream.
        String a = dis.readUTF();
        String b = dis.readUTF();
        String c = dis.readUTF();
        String d = dis.readUTF();
        String e = dis.readUTF();
        dis.close();
        //Write each string to the console.
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);
        System.out.print(e);
    }
}
