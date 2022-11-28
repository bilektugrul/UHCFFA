package io.github.bilektugrul.uhcffa;

import io.github.bilektugrul.uhcffa.game.GameManager;
import org.bukkit.plugin.java.JavaPlugin;

//TODO: LOOP SAVED ARENAS AND CREATE GAME FOR EACH ONE OF 'EM
public class UHCFFA extends JavaPlugin {

    private GameManager gameManager;

    @Override
    public void onEnable() {
        this.gameManager = new GameManager();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}