package com.example.rpgtest.Controllers;

import com.example.rpgtest.Models.Game;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class GameController {
    public Label StoryLabel;
    public Button FightButton;
    public Button EatButton;
    public Button PotionButton;
    public Button FleeButton;
    public ProgressBar EnemyHealthBar;
    public ProgressBar HeroHealthBar;


    @FXML
    protected void Fight() throws Exception{
        Game.generateCombat();
        StoryLabel.setText("Let the fight against the Old Necromancer start!");
        double newHealthEnemy = EnemyHealthBar.getProgress() - 0.1F;
        EnemyHealthBar.setProgress(newHealthEnemy);
        Game.main();
    }

    @FXML
    protected void Eat() throws Exception{
        StoryLabel.setText("De la nourriture!");
    }

    @FXML
    protected void UsePotion() throws Exception{
        StoryLabel.setText("You chose to use a potion, wise decision.");
    }

    @FXML
    protected void Flee() throws Exception{
        StoryLabel.setText("What a coward you are...");
    }

}
