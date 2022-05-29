package com.example.rpgtest;

/**
 * Création de la classe Enemy
 */
public abstract class Enemy {

    int lifePoints;
    int damage;

    /**
     * Méthode qui affiche les points de vie du héro puis les dégâts de l'enemi
     * Elle permet ensuite de faire la différence des deux
     * Pour enfin afficher les nouveaux points de vie du héro
     * @param enemy
     * @param hero
     */
    public static void attackEnemy(Enemy enemy, Hero hero) {
        System.out.println("Hero hp : " + hero.getLifePoints());
        System.out.println("Enemy Damage : " + enemy.getDamage());
        hero.setLifePoints(hero.getLifePoints() - enemy.getDamage());
        System.out.println("Hero hp : " + hero.getLifePoints());
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
