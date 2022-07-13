package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Gusti";



        } else if(query.contains("plus")) {
            int res;
            String[] words = query.split(" ");
            res = Integer.parseInt(words[4]) + Integer.parseInt(words[2]);

            return String.valueOf(res);
        } else if (query.contains("largest")) {

            String queryString = query;
            queryString = queryString.replaceAll(",", "");

            String[] words = queryString.split(" ");

            int res = 0;

            for (int j = 9; j < words.length; j++) {
                res = Math.max(res, Integer.parseInt(words[j]));
            }

            return String.valueOf(res);
        } else {
            return "";
        }
    }
}
