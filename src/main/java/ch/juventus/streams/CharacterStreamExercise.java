package ch.juventus.streams;

import java.io.IOException;

public class CharacterStreamExercise {

    public static void main(String[] args) throws IOException {
        MyReader reader = new MyReader();
        MyWriter writer = new MyWriter();

        reader.readFromTextFile("src/main/resources/hello.txt");
        writer.writeToTextFile("src/main/resources/new_hello.txt");
    }

}