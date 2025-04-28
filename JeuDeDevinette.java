package JeuDeDevinette;


import java.util.Random;
import java.util.Scanner;

public class JeuDeDevinette{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenue dans le jeu de devinette !");
        System.out.println("J'ai choisi un nombre entre 1 et 100 .");
        System.out.println("Veuillez le deviner .");

        int nombreADeviner = random.nextInt(100)+1;
        int nombreDevine = 0;
        int nombreEssais = 0;

        while(nombreADeviner!=nombreDevine){
            System.out.println("Entrez la devinette .");
            nombreDevine=scanner.nextInt();
            nombreEssais++;
            if(nombreDevine<nombreADeviner){
                System.out.println("Trop petit ! Essayez encore .");
            }else if(nombreDevine>nombreADeviner){
                System.out.println("Trop grand ! Essayez encore .");
            }else{
                System.out.println("Félicitations ! vous avez devnié le nombre en "+nombreEssais+" essais .");
            }
        }
    }
}