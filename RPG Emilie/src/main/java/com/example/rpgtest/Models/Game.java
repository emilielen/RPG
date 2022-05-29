package com.example.rpgtest.Models;

import com.example.rpgtest.Helpers.InputParser;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Création de la classe Game
 */
public class Game extends InputParser {
    Scanner scanner = new Scanner(System.in);

    protected static String[] heroes = new String[1];
    int playerTurn;

    /**
     * Cette méthode lance StratGame
     * Elle fixe les attributs weaponDamage, lifePoints, armor, potion, arrow
     * ELle lance playGame
      * @throws Exception
     */
    public static void main() throws Exception {

        heroes[0] = StartGame();
        Hunter hero1 = new Hunter(1, 5, 1, 2, 3);
        playGame(hero1);
    }

    /**
     * Méthode qui correspond
     * créer un ennemi
     * prend nb aleatoire
     * tant que ennemi vie et hero vie, lance le combat
     * si le hero est en vie: gagné
     * héro plus en vie: perdu
     * @param hero
     */
    public static void playGame(Hero hero) throws IOException {
        while (hero.getLifePoints() > 0) {
            Enemy enemy = generateCombat();
            Random random = new Random();
            int nb = random.nextInt(2);
            while (enemy.getLifePoints() > 0 && hero.getLifePoints() > 0) {
                combat(enemy, hero, nb);
            }
            if (hero.getLifePoints() > 0) {
                winCombat(hero);
            }
        }
        if (hero.getLifePoints() <= 0) {
            System.out.println("Perdu");
        }
    }
   
    public static Enemy generateCombat() throws IOException {

        System.out.println("-------------------");
        System.out.println("Vous entrez en combat !");
        Random random = new Random();
        int nombre1 = random.nextInt(3) + 1;
        int nombre2 = random.nextInt(3) + 1;

        BasicEnemy enemy = new BasicEnemy(nombre1, nombre2);
        System.out.println("L'ennemi a " + nombre1 + " points de vie et " + nombre2 + " dégats");

        return enemy;
    }

    public static void combat(Enemy enemy, Hero hero, int nb) {

        if (nb == 0) {
            CombatChoice(enemy, hero);
            if (enemy.getLifePoints() > 0) {
                Enemy.attackEnemy(enemy, hero);
            }
        } else {
            Enemy.attackEnemy(enemy, hero);
            if (hero.getLifePoints() > 0) {
                CombatChoice(enemy, hero);
            }

        }
    }

    public static void winCombat(Hero hero) {
        System.out.println("Bravo vous avez gagné votre combat !");
        WinChoice(hero);
    }

}

