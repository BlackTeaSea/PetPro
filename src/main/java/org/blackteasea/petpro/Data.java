package org.blackteasea.petpro;

public class Data {

    private static Data instance;
    private Petpro plugin;

    private Data() {
    }

    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }

    public void setPlugin(Petpro plugin) {
        this.plugin = plugin;
    }

    public Petpro getPlugin() {
        return plugin;
    }
}
