package ch.hslu.prg2.ueb7;

import ch.hslu.prg2.ueb7.Cube;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;

/**
 * Read solid data from file.
 */
public final class SolidFileIO {

    private static LinkedList<Cube> list;
        
    public static Cube[] readSolids(final String fileName) throws IOException {
        list = new LinkedList<>();
        FileReader reader = new FileReader("test.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);        
        
        int number = 1;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] tokens = line.split("[: ]"); //
            switch (tokens[0]) { // is it a Cube, a Sphere or a Cylinder?
                case "C":
                    int s1 = Integer.parseInt(tokens[2]);
                    int s2 = Integer.parseInt(tokens[3]);
                    int s3 = Integer.parseInt(tokens[4]);
                    list.add(new Cube(number, s1, s2, s3));
                    break;
                default:
                    break;
            }
            number++;
        }
        return list.toArray(new Cube[list.size()]);
    }

    /**
     * Privater Konstruktor.
     */
    private SolidFileIO() {
    }
}
