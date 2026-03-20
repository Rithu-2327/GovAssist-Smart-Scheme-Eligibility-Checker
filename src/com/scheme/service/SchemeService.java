package com.scheme.service;

import java.util.*;
import com.scheme.model.Scheme;
import com.scheme.data.SchemeData;

public class SchemeService {

    public static List<Scheme> getEligibleSchemes(int age, double income, String category, String gender, String occupation) {
        List<Scheme> eligible = new ArrayList<>();
        List<Scheme> allSchemes = SchemeData.getSchemes();

        for(Scheme s : allSchemes) {
            // Example logic: simple filtering
            if(category.equalsIgnoreCase("General") && s.category.equalsIgnoreCase("Farmer") && income < 100000) {
                eligible.add(s);
            }
            else if(category.equalsIgnoreCase("SC") && s.category.equalsIgnoreCase("SC")) {
                eligible.add(s);
            }
            // Add more rules for each scheme here
        }

        return eligible;
    }
}