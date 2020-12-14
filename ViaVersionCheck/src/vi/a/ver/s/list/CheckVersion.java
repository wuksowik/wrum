package vi.a.ver.s.list;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import us.myles.ViaVersion.api.Via;
import vi.a.ver.s.Main;

public class CheckVersion implements Listener {
	@SuppressWarnings("unchecked")
	@EventHandler
	public void d(PlayerJoinEvent e) {
		if (Main.getInstance().getConfig().getBoolean("VersionCheckEnabled")) {
		Player x = e.getPlayer();
		for (String msg : Main.getInstance().getConfig().getStringList("VersionCheckOnJoin"))
        x.sendMessage(ChatColor.translateAlternateColorCodes('&', msg.replace("{VERSION}", String.valueOf(Via.getAPI().getPlayerVersion(x)).replace("47", "1.8").replace("107", "1,9").replace("110", "1.9.4").replace("210", "1.10").replace("315", "1.11").replace("316", "1.11.x").replace("335", "1.12").replace("338", "1.12.1").replace("340", "1.12.2").replace("393", "1.13").replace("401", "1.13.1").replace("404", "1.13.2").replace("477", "1.14").replace("480", "1.14.1").replace("485", "1.14.2").replace("490", "1.14.3").replace("498", "1.14.4").replace("573", "1.15").replace("575", "1.15.1").replace("578", "1.15.2").replace("735", "1.16").replace("736", "1.16.1").replace("751", "1.16.2").replace("753", "1.16.3").replace("754", "1.16.4"))));
	}
	}
}
