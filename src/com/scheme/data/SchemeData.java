package com.scheme.data;

import java.util.*;
import com.scheme.model.Scheme;
import com.scheme.data.SchemeData;


import java.util.List;
import java.util.Scanner;

public class SchemeData {

    public static List<Scheme> getSchemes() {

        List<Scheme> schemes = new ArrayList<>();

         // Farmers
        schemes.add(new Scheme("PM Kisan Samman Nidhi", "Farmer", "https://pmkisan.gov.in"));
        schemes.add(new Scheme("Pradhan Mantri Fasal Bima Yojana", "Farmer", "https://pmfby.gov.in"));
        schemes.add(new Scheme("Rashtriya Krishi Vikas Yojana", "Farmer", "https://rkvy.nic.in"));

        // Health
        schemes.add(new Scheme("Ayushman Bharat", "Health", "https://pmjay.gov.in"));
        schemes.add(new Scheme("National Health Mission", "Health", "https://nhm.gov.in"));
        schemes.add(new Scheme("Janani Suraksha Yojana", "Health", "https://nhm.gov.in/janani-suraksha-yojana"));

        // Women
        schemes.add(new Scheme("Beti Bachao Beti Padhao", "Women", "https://wcd.nic.in"));
        schemes.add(new Scheme("One Stop Centre Scheme", "Women", "https://wcd.nic.in"));
        schemes.add(new Scheme("Mahila Coir Yojana", "Women", "https://coirboard.gov.in"));

        // Housing
        schemes.add(new Scheme("PM Awas Yojana", "Housing", "https://pmaymis.gov.in"));
        schemes.add(new Scheme("Indira Awas Yojana", "Housing", "https://pmaymis.gov.in"));
        schemes.add(new Scheme("Pradhan Mantri Gramin Awas Yojana", "Housing", "https://pmaymis.gov.in"));

        // Entrepreneurship / Business
        schemes.add(new Scheme("PM Mudra Yojana", "Business", "https://mudra.org.in"));
        schemes.add(new Scheme("Stand Up India", "SC/ST", "https://standupmitra.in"));
        schemes.add(new Scheme("Startup India", "Business", "https://www.startupindia.gov.in"));

        // Skill / Education
        schemes.add(new Scheme("Skill India", "Skill", "https://skillindia.gov.in"));
        schemes.add(new Scheme("National Apprenticeship Scheme", "Skill", "https://www.mhrdnats.gov.in"));
        schemes.add(new Scheme("Samagra Shiksha Abhiyan", "Education", "https://samagra.mhrd.gov.in"));

        // Vendors / Urban
        schemes.add(new Scheme("PM SVANidhi", "Street Vendors", "https://pmsvanidhi.mohua.gov.in"));
        schemes.add(new Scheme("Deendayal Antyodaya Yojana", "Urban Poor", "https://pmayg.nic.in"));
        schemes.add(new Scheme("National Urban Livelihoods Mission", "Urban Poor", "https://nulm.gov.in"));

        // SC/ST Welfare
        schemes.add(new Scheme("Post Matric Scholarship for SC", "SC", "https://scholarships.gov.in"));
        schemes.add(new Scheme("Post Matric Scholarship for ST", "ST", "https://scholarships.gov.in"));
        schemes.add(new Scheme("Vanbandhu Kalyan Yojana", "ST", "https://tribal.nic.in"));

        // Misc / Special
        schemes.add(new Scheme("Pradhan Mantri Kaushal Vikas Yojana", "Skill", "https://pmkvyofficial.org"));
        schemes.add(new Scheme("National Social Assistance Programme", "Senior Citizen", "https://nsap.nic.in"));
        schemes.add(new Scheme("Atal Pension Yojana", "Pension", "https://www.npscra.nsdl.co.in"));

        return schemes;
    }
}