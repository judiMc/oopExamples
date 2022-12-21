package oointro;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter source folder: ");
        Path source = Paths.get(input.nextLine());

        System.out.println("Enter destination folder: ");
        Path destination = Paths.get(input.nextLine());

        try {
            // Create a list of all the files that are descendants of the chosen source directory
            List<Path> files = Files.walk(source).collect(Collectors.toList());

            // For each file in the list
            for (Path f : files) {
                if (f.toString().endsWith(".png")) {
                    Files.move(f, destination.resolve(f.getFileName()));
                }
            }

        } catch (IOException e) {
            System.out.println("Unable to move .png files, " + e);
        }
    }
}