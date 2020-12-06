package rizvanov.mk.lab8;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter file = new FileWriter("/Users/graiw/Programming/Lab8/src/rizvanov/mk/lab8/note.txt",false);
            String text = "Что разум человека может постигнуть и во что он может поверить, того он способен достичь";
            String author = "Наполеон Хилл, журналист и писатель ";
            file.write(text);
            file.append('\n');
            file.append(author);
            file.flush();


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try{
            FileReader reader = new FileReader("/Users/graiw/Programming/Lab8/src/rizvanov/mk/lab8/note.txt");
            int c;

            while((c=reader.read())!=-1){
                System.out.print((char)c);

            }
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}