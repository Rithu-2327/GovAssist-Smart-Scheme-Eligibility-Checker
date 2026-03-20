# GovAssist: Smart Scheme Eligibility Checker

**GovAssist** is a professional terminal-based Java application designed to help citizens, students, and farmers **quickly determine their eligibility** for Indian government schemes. By entering basic personal information such as age, income, category, gender, and occupation, users receive a curated list of schemes they qualify for, along with official links.  

This tool empowers users to **access government benefits efficiently**, reducing time spent navigating multiple government portals.

---

## Table of Contents

1. [Project Overview](#project-overview)  
2. [Key Features](#key-features)  
3. [Input Details](#input-details)  
4. [Example Output](#example-output)  
5. [How to Run](#how-to-run)  
6. [Impact Statement](#impact-statement)  
7. [License](#license)  

---

## Project Overview

| Feature | Description |
|---------|-------------|
| Language | Java |
| Platform | Terminal / Command Line |
| Target Users | Citizens, Farmers, Students, Low-income households |
| Input | Age, Income, Category (General/SC/ST), Gender, Occupation |
| Output | Personalized list of eligible government schemes with official links |
| Design | Modular, object-oriented architecture using `model`, `data`, and `service` layers |
| Impact | Helps users quickly identify government benefits they qualify for |

---

## Key Features

| Feature | Benefit |
|---------|---------|
| Personalized Eligibility | Filters schemes based on user profile |
| Real Government Links | Provides official scheme websites for direct access |
| Modular Design | Organized code structure for maintainability and scalability |
| Easy to Use | Terminal-based interface with clear, step-by-step prompts |
| Extensible | New schemes and rules can be added easily without code overhaul |
| Internship Ready | Clean, professional, and fully demonstrable for applications and interviews |

---

## Input Details

| Field | Example Input |
|-------|---------------|
| Age | 30 |
| Income | 50000 |
| Category | General |
| Gender | Male |
| Occupation | Farmer |

---

## Example Output

| Scheme Name | Official Link |
|-------------|---------------|
| PM Kisan Samman Nidhi | [https://pmkisan.gov.in](https://pmkisan.gov.in) |
| Pradhan Mantri Fasal Bima Yojana | [https://pmfby.gov.in](https://pmfby.gov.in) |
| Rashtriya Krishi Vikas Yojana | [https://rkvy.nic.in](https://rkvy.nic.in) |

> Users get a clear and actionable list of schemes they are eligible for, making it easy to apply and access benefits.

---

## How to Run

1. Open terminal in the project root:


cd D:\Alpha\Scheme-Eligibilty-checker

2. Compile all files:


javac -d out src\com\scheme\model\*.java src\com\scheme\data\*.java src\com\scheme\service\*.java src\com\scheme\Main.java

3. Run the program:


java -cp out com.scheme.Main

4. Enter your details as prompted to receive eligible schemes with official links.

----
Impact Statement

GovAssist empowers citizens to discover government benefits they are entitled to, making public welfare programs more accessible. It is particularly useful for students, farmers, and low-income households seeking financial, health, and educational support.

-----

License

MIT License

This project is licensed under the **MIT License**. 
