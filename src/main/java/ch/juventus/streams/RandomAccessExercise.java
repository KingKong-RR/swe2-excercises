package ch.juventus.streams;

import java.io.IOException;

public class RandomAccessExercise {

    public static void main(String[] args) throws IOException {
        MyReader reader = new MyReader();
        MyWriter writer = new MyWriter();

        reader.readFromTexFilePosition("src/main/resources/hello.txt", "r", 15);
        writer.writeToTexFilePosition("src/main/resources/new_hello.txt", "rw", 10);
    }
}
