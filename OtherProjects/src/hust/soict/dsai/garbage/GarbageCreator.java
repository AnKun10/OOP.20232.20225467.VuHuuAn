package hust.soict.dsai.garbage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public void createGarbage() throws IOException {
        String filename = "test.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        String outputString = "";
//        StringBuilder sb = new StringBuilder();
//        StringBuffer sb = new StringBuffer();
        for (byte b : inputBytes) {
            outputString += (char) b;
//            sb.append((char) b);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
