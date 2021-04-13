package quotes;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Quotes {
    String author;
    String text;
    ArrayList<String> tags = new ArrayList<>();
    String likes;

    public static String readFromFile(String path) throws Exception
    {
        Gson gson = new Gson();

        BufferedReader file = new BufferedReader(new FileReader(path));
        Quotes[] quotesFromFiles = gson.fromJson(file, Quotes[].class);

        int randomIndex = (int)(Math.random() * quotesFromFiles.length);
        String randomQuote = quotesFromFiles[randomIndex].toString();

        return randomQuote;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                ", tags=" + tags +
                ", likes='" + likes + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}