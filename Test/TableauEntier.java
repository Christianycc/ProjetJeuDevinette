package Test;

import java.util.Scanner;

public class TableauEntier{
    public static void main(String[]args){
        System.out.println("Veuillez entrer la taille d'un tableau(N):");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[]tab=new int[N];

        for(int i =0;i<N;i++) {
            System.out.println("Entrer un entier strictement positif :");
            tab[i] = scanner.nextInt();
            if (tab[i] <= 0) {
                System.out.println("Veuillez entrer un enteir strictement positif :");
                tab[i] = scanner.nextInt();
            }
        }
        int MAX=0;
        for(int i=0;i<N;i++){
            if(tab[i]>MAX){
                MAX=tab[i];
            }
        }
        System.out.println("La valeur maximale (MAX) est :"+MAX);

        int p=0;
        for(int i=0;i<N;i++){
            if(tab[i]==MAX){
                p++;
            }
        }
        System.out.println("L'occurence de la valeur maximale (p) est :"+p);

        int[]tabbis=new int [p];
        int index=0;
        for(int i=0;i<N;i++){
            if(tab[i]==MAX){
                tabbis[index]=i;
                index++;
            }
        }

        System.out.println("Les rangs des occurences de la valeur maximale sont : ");
        for(int i =0;i<p;i++) {
            System.out.println(tabbis[i] + " ");
        }
            System.out.println();
            scanner.close();
        }
    }
