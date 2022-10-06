package com.gokhankaplan.hangiburcsun;

import java.util.Scanner;

public class Hangiburcsun {
    public static void main(String[] args){
        int day;
        String month;
        String burcunuz = "ocak";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Doğum ayınızı giriniz: ");
        month = input.next();
        System.out.println("Doğum gününüzü giriniz: ");
        day = input.nextInt();

        if (month.equals("ocak")) {
            if (day>=1 && day<=28) {
            if (day<22) {
                burcunuz = "oglak";
            }
                else if (day>=22){
                    burcunuz = "kova";
                }
            }
            else {
                isError = true;
            }
        }
        if (month.equals("subat")) {
            if (day>=1 && day<=30) {

                    if (day<20) {
                        burcunuz = "kova";
                    }
                    else if (day>=20 ){
                        burcunuz = "balık";
                    }
            }
            else {
                isError= true;
            }
        }
        if (month.equals("mart")) {
            if (day>=1 && day<=31) {

                if (day<21) {
                    burcunuz = "balık";
                }
                else if (day>=21 ){
                    burcunuz = "koç";
                }
            }
            else {
                isError= true;
            }
        }
        if (month.equals("Nisan")) {
            if (day>=1 && day<=30) {

                if (day<21) {
                    burcunuz = "balık";
                }
                else if (day>=21 ){
                    burcunuz = "boğa";
                }
            }
            else {
                isError= true;
            }
        }
        if (month.equals("mayıs")) {
            if (day>=1 && day<=31) {

                if (day<22) {
                    burcunuz = "boğa";
                }
                else if (day>=22 ){
                    burcunuz = "ikizler";
                }
            }
            else {
                isError= true;
            }
        }
        if (month.equals("haziran")) {
            if (day>=1 && day<=30) {

                if (day<23) {
                    burcunuz = "ikizler";
                }
                else if (day>=23 ){
                    burcunuz = "yengeç";
                }
            }
            else {
                isError= true;
            }
        }
        if (month.equals("temmuz")) {
            if (day>=1 && day<=31) {

                if (day<23) {
                    burcunuz = "yengeç";
                }
                else if (day>=23 ){
                    burcunuz = "aslan";
                }
            }
            else {
                isError= true;
            }
        }
        if (month.equals("ağustos")) {
            if (day>=1 && day<=31) {

                if (day<23) {
                    burcunuz = "aslan";
                }
                else if (day>=23 ){
                    burcunuz = "başak";
                }
            }
            else {
                isError= true;
            }
        }
        if (month.equals("eylül")) {
            if (day>=1 && day<=31) {

                if (day<23) {
                    burcunuz = "başak";
                }
                else if (day>=23 ){
                    burcunuz = "terazi";
                }
            }
            else {
                isError= true;
            }
        }
        if (month.equals("ekim")) {
            if (day>=1 && day<=31) {

                if (day<23) {
                    burcunuz = "terazi";
                }
                else if (day>=23 ){
                    burcunuz = "akrep";
                }
            }
            else {
                isError= true;
            }
        }
        if (month.equals("kasım")) {
            if (day>=1 && day<=30) {

                if (day<22) {
                    burcunuz = "akrep";
                }
                else if (day>=22 ){
                    burcunuz = "yay";
                }
            }
            else {
                isError= true;
            }
        }
        if (month.equals("aralık")) {
            if (day>=1 && day<=31) {

                if (day<22) {
                    burcunuz = "yay";
                }
                else if (day>=22 ){
                    burcunuz = "oğlak";
                }
            }
            else {
                isError= true;
            }
        }
        if(isError) {
            System.out.println("Hatalı numara girdiniz!");
        }
            else {
            System.out.println("Burcunuz:" + burcunuz);
        }
    }
}

