package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.player.FPlayer;
import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = Rank.SUPER_ADMIN, source = SourceType.BOTH)
@CommandParameters(
        description = "Succ on others",
        usage = "/<command> <player>",
        aliases = "succsucc")
public class Command_succ extends FreedomCommand
{
    @Override
    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        Player player = (Player) sender;
        if (args.length < 2) {
         sender.sendMessage(ChatColor.GREEN + "You're a fucking retard, Correct Usage:");
         sender.sendMessage(ChatColor.RED + "/succ <player>");
        }
        if (args.length == 1) {
            return false;
        }
        if (player == null) {
            sender.sendMessage("Player not found!");
        }
        player.sendMessage(ChatColor.RED + sender.getName() + " says " + ChatColor.GREEN + "succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ succ ");
        return true;   
    }
    }
