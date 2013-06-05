/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gadgettvman.github.io.CordsofDeath;

import org.bukkit.plugin.java.JavaPlugin;

public final class CordsOfDeath extends JavaPlugin {
    
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new CoDPlayerDeathListener(this), this);
        this.getLogger().info("is now enabled");
    }
 
    public void onDisable(){
        this.getLogger().info("has been disabled");
    }
}
