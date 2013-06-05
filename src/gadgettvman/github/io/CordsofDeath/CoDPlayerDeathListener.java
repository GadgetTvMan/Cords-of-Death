/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gadgettvman.github.io.CordsofDeath;

import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.entity.*;
import java.util.Locale;
import java.util.logging.Logger;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.CommandSender;
import org.bukkit.Location;

public class CoDPlayerDeathListener implements Listener {
    private final CordsOfDeath plugin;

    CoDPlayerDeathListener(CordsOfDeath instance) {
        this.plugin = instance;
    }
    
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event){
        Player player = event.getEntity();
        Location placeOfDeath = null;
        int playerDeathX = player.getLocation().getBlockX();
        int playerDeathY = player.getLocation().getBlockY();
        int playerDeathZ = player.getLocation().getBlockZ();
        String deathLocation = "X:" + playerDeathX + " Y:" + playerDeathY + " Z:" + playerDeathZ;
        if (player.hasPermission("CordsOfDeath.sendCordsOnDeath")) {
            player.sendMessage("You died at:" + " " + deathLocation);
            this.plugin.getLogger().info(player.getDisplayName() + " " + "died at:" + " " + deathLocation);
        }
    }
}
