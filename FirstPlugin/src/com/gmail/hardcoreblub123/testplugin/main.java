package com.gmail.hardcoreblub123.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	public void onEnable(){
		System.out.println("The Plugin has been enabled");
		getCommand("test").setExecutor(new Commands());
	}
	public void onDisable(){
		System.out.println("The Plugin has been disabled");
}
}


