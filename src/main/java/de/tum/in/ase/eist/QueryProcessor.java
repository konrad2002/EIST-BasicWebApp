package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "MyTeam";
        } else if (query.contains("plus")) {
                query = query.replaceFirst("what is ", "");
                String s2 = query.substring(0, query.indexOf("plus"));
                String s3 = query.substring(query.indexOf("plus"));
                int i1 = Integer.parseInt(s2);
                int i2 = Integer.parseInt(s3);
                int o3 = i1 + i2;
                return String.valueOf(o3);
        } else if (query.contains("largest")) {
                int n1 = findFirstDigit(query);
                int n2 = findFirstDigit(query.replaceFirst(String.valueOf(n1), ""));
                if (n1 > n2) {
                    return String.valueOf(n1);
                } else return String.valueOf(n2);
        }
        else { // TODO extend the programm here
            return "";
        }
    }

    public int findFirstDigit(String s) {
        boolean is = false;
        StringBuilder in = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isDigit(c)) {
                in.append(c);
                is = true;
            } else {
                if (is) break;
            }
        }
        return Integer.parseInt(in.toString());
    }
}
