package ch.juventus.streams;

import java.io.*;

public class MyWriter {

    public void writeToTextFile(String filePath) throws IOException {
        Writer writer = new BufferedWriter(new FileWriter(filePath));

        StringBuffer outputText = new StringBuffer();
        outputText.append("Hello World!");
        outputText.append(System.lineSeparator());
        outputText.append("I am writing to an output file");

        writer.write(outputText.toString());

        writer.close();
    }

    public void writeToTexFilePosition(String filePath, String accessMode, int position) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, accessMode);

        file.seek(position); // Nach 200 Zeichen

        file.write("-huhu-".getBytes());

        file.close();

        //long position = file.getFilePointer(); // Gibt den aktuellen Index zurück
    }
}