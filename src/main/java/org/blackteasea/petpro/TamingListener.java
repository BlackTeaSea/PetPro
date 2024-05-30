package org.blackteasea.petpro;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityEnterLoveModeEvent;

public class TamingListener implements Listener {


    @EventHandler
    public void onBreed(EntityEnterLoveModeEvent event) {
        Data.getInstance().getPlugin().getLogger().info("Breed event");
        if (event.getEntity().getType() == EntityType.RABBIT) {
            Data.getInstance().getPlugin().getLogger().info("Lmao");
        }
    }
}
