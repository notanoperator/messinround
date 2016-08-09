package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = Rank.SUPER_ADMIN, source = SourceType.BOTH)
@CommandParameters(
        description = "Reload the server files",
        usage = "/<command>",
        aliases = "rl,rel")
public class Command_reload extends FreedomCommand
{
@Override
    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        FUtil.bcastMsg(ChatColor.RED + sender.getName() + " - Reloading the server files.");
        server.reload();
        FUtil.bcastMsg(ChatColor.GREEN + "Reload complete!");
        msg(ChatColor.AQUA + "Reload successfully executed");
        return true;
    }


}
