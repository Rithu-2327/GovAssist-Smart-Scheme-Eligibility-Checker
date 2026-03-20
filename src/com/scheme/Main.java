package com.scheme;

import java.util.List;
import java.util.Scanner;
import com.scheme.model.Scheme;
import com.scheme.data.SchemeData;
import com.scheme.service.SchemeService;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Income: ");
        double income = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter Category (General/SC/ST): ");
        String category = sc.nextLine();
        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter Occupation: ");
        String occupation = sc.nextLine();

        List<Scheme> eligible = SchemeService.getEligibleSchemes(age, income, category, gender, occupation);

        System.out.println("\nEligible Schemes:");
        for(Scheme s : eligible) {
            System.out.println("→ " + s.name);
            System.out.println("Link: " + s.link + "\n");
        }

        sc.close();
    }
}