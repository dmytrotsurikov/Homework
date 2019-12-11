package home.tsurikov.grep;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {
    public void matching (String path, String regularExpression){
        try {
            // построчное считывание файла
            //создаем LineNumberReader с существующего FileReader для построчного считывания
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(path));
            //   Pattern pattern = Pattern.compile(expression);
            Pattern pattern = Pattern.compile(String.format("^.*(%s).*$", regularExpression));

            String line;
            int lineNumber;
            boolean equal;

            while ((line = lineNumberReader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                equal = matcher.find();
                if (equal) {
                    lineNumber = lineNumberReader.getLineNumber();
                    System.out.println(lineNumber + " " + line);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Выражение не найдено");
        }
    }
}

