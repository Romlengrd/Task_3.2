package com.company;


import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {

        String[] rusQuestions = {"1-Как дела?", "2-Что ты имел ввиду?", "3-Ты кто?"};
        String[] engQuestions = {"1-How are you?", "2-What do you mean?", "3-Who are you?"};

        System.out.println("Выберите язык 1 - Русский, 2 - English ");
        int q = 2; // sc.scanner();
        if (q==1) {
            for (int i=0; i<rusQuestions.length; i++) {
                System.out.println(rusQuestions[i]);
            }
            System.out.println("Выберите номер вопроса - ");
            int c=1; //sc.scanner();
            int k=c-1;

            if (k==0) {

                Locale rusloc = new Locale("ru");
                ResourceBundle bundle;
                bundle = ResourceBundle.getBundle("com.company.Rus", rusloc);
                String key = "а";
                System.out.println(bundle.getString(key));
            }
            if (k==1) {

                Locale rusloc = new Locale("ru");
                ResourceBundle bundle;
                bundle = ResourceBundle.getBundle("com.company.Rus", rusloc);
                String key = "б";
                System.out.println(bundle.getString(key));
            }
            if (k==2) {

                Locale rusloc = new Locale("ru");
                ResourceBundle bundle;
                bundle = ResourceBundle.getBundle("com.company.Rus", rusloc);
                String key = "в";
                System.out.println(bundle.getString(key));
            }

        }
        if (q==2) {
            for (int i=0; i<engQuestions.length; i++) {
                System.out.println(engQuestions[i]);
            }
            System.out.println("Choose question number - ");
            int c=2; //sc.scanner();
            int k=c-1;

            if (k==0) {
                Locale engloc = new Locale("en");
                ResourceBundle bundle1;
                bundle1 = ResourceBundle.getBundle("com.company.Eng", engloc);
                String key1 = "a";
                System.out.println(bundle1.getString(key1));
            }
            if (k==1) {
                Locale engloc = new Locale("en");
                ResourceBundle bundle1;
                bundle1 = ResourceBundle.getBundle("com.company.Eng", engloc);
                String key1 = "b";
                System.out.println(bundle1.getString(key1));
            }
            if (k==2) {
                Locale engloc = new Locale("en");
                ResourceBundle bundle1;
                bundle1 = ResourceBundle.getBundle("com.company.Eng", engloc);
                String key1 = "c";
                System.out.println(bundle1.getString(key1));
            }




        }


    }
}


