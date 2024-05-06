package com.tony.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public final class FileManipulator {

    public static String readFile(String filepath) throws Exception {
        StringBuilder contentBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(filepath));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new Exception(e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new Exception(e.getMessage());
                }
            }
        }

        return contentBuilder.toString();
    }

}
