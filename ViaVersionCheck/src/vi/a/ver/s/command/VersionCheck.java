package vi.a.ver.s.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import us.myles.ViaVersion.api.Via;
import vi.a.ver.s.Main;

public class VersionCheck implements CommandExecutor{

	@SuppressWarnings("unchecked")
	@Override
	public boolean onCommand(CommandSender executor, Command cmd, String arg, String[] args) {
		if (!(executor instanceof Player)) {
			executor.sendMessage("§cYou play on version Console!");
		   return false;
	}
		executor.sendMessage(ChatColor.translateAlternateColorCodes('&', (Main.getInstance().getConfig().getString("CommandVersionCheck").replace("{VERSION}", String.valueOf(Via.getAPI().getPlayerVersion(executor)).replace("47", "1.8").replace("107", "1,9").replace("110", "1.9.4").replace("210", "1.10").replace("315", "1.11").replace("316", "1.11.x").replace("335", "1.12").replace("338", "1.12.1").replace("340", "1.12.2").replace("393", "1.13").replace("401", "1.13.1").replace("404", "1.13.2").replace("477", "1.14").replace("480", "1.14.1").replace("485", "1.14.2").replace("490", "1.14.3").replace("498", "1.14.4").replace("573", "1.15").replace("575", "1.15.1").replace("578", "1.15.2").replace("735", "1.16").replace("736", "1.16.1").replace("751", "1.16.2").replace("753", "1.16.3").replace("754", "1.16.4")))));
		return false;

}}