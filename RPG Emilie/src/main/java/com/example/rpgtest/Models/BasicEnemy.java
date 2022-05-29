package com.example.rpgtest.Models;

import com.example.rpgtest.Models.Enemy;

/**
 *classe permettant d'instancier un Basic Enemy
 */
public class BasicEnemy extends Enemy {

    public BasicEnemy(int lifePoints, int damage) {
        this.lifePoints = lifePoints;
        this.damage = damage;
    }

}
