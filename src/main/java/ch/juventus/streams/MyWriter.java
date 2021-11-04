package ch.juventus.streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyWriter {
    public static void read() throws IOException {
        Writer writer = new FileWriter("src/main/resources/new_hello.txt");
        StringBuffer outputText = new StringBuffer();
        outputText.append("Hello World!");
        outputText.append("\n");
        outputText.append("I am writing to an output file");
        writer.write(outputText.toString());
        writer.close();
    }
}
