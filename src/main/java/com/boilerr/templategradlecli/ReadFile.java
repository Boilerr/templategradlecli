package com.boilerr.templategradlecli;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.apache.commons.lang3.ArrayUtils;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


class ReadFile {

    private Reader reader;

    ReadFile(String pathToFile) {
        this.reader = readFile(pathToFile);
    }


    private Reader readFile(String pathToFile) {
        Reader reader = null;

        try {
            reader = Files.newBufferedReader(Paths.get(pathToFile));

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        return reader;

    }


    double[] getArrayOfDoubles() {
        List<Double> doubleList = new ArrayList<>();

        double[] doubles;

        CSVReader csvReader = new CSVReaderBuilder(reader).build();

        String[] nextLine;

        try {
            while ((nextLine = csvReader.readNext()) != null) {

                for (String e : nextLine) {

                    doubleList.add(Double.parseDouble(e));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);

        }

        doubles = ArrayUtils.toPrimitive(doubleList.toArray(new Double[0]));

        return doubles;
    }

}


































