package Poem;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class Poem {
    public static StringBuilder poems(String path) throws IOException {
        ArrayList<String> strList = new ArrayList<>();
        String content;
        try(Reader reader = new FileReader(path)) {
            int n;
            StringBuilder sb = new StringBuilder();
            while ((n = reader.read()) != -1) {
                sb.append((char) n);
            }
            content = sb.toString();
        }
        String str;
        int index = 0;
        for (int i = 0; i < content.length(); i++) {
            if (i % 14 == 0) {
                str = content.substring(index, i);
                strList.add(str);
                index = i;
            }
        }
        StringBuilder poem = new StringBuilder();
        for (int i = 1; i < strList.size(); i++) {
            String s = strList.get(i);
            for (int j = 0; j < s.length(); j++) {
                if (j == 7) {
                    s = s.substring(0, j) + "£¬" + s.substring(j, s.length()) + "¡£";
                }
            }
            poem.append(s + "\n");
        }
        return poem;
    }
}

