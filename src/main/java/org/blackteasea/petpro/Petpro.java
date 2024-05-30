package org.blackteasea.petpro;

import org.bukkit.plugin.java.JavaPlugin;

public final class Petpro extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Data.getInstance().setPlugin(this);
        getServer().getPluginManager().registerEvents(new TamingListener(), this);
        getLogger().info("Petpro enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Petpro disabled");
    }
}
