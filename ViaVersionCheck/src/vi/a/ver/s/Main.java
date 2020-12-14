package vi.a.ver.s;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import vi.a.ver.s.command.VersionCheck;
import vi.a.ver.s.list.CheckVersion;

public class Main extends JavaPlugin{
	
	public static Main instance;
	
	public void onLoad() {
		instance = this;
	}
	
	public void onEnable() {
		saveDefaultConfig();
		System.out.println("Enabled plugin ViaVersionCheck!");
		if (Bukkit.getPluginManager().isPluginEnabled("ViaVersion")) {
			regEvents();
			regCommand();
		} else {
			System.out.println(";/ If you use this plugin install ViaVersion!");
			Bukkit.getPluginManager().disablePlugin(this);
		}
	}
		
		public void regCommand() {
			if (Main.getInstance().getConfig().getBoolean("CommandEnable")) {
			getCommand("versioncheck").setExecutor(new VersionCheck());
			}
		}
		
		public void regEvents() {
			Bukkit.getPluginManager().registerEvents(new CheckVersion(), this);
		}
		
		public static Main getInstance() {
			return instance;
	}

}
