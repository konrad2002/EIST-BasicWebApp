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
                String s2 = query.substring(query.indexOf("what is "), query.indexOf("plus"));
                String s3 = query.substring(query.indexOf("plus"));
                int i1 = Integer.parseInt(s2);
                int i2 = Integer.parseInt(s3);
                int o3 = i1 + i2;
                return String.valueOf(o3);
            }
        else { // TODO extend the programm here
            return "";
        }
    }
}
