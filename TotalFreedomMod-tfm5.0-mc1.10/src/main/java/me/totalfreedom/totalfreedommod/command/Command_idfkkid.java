package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.command.CommandParameters;
import me.totalfreedom.totalfreedommod.command.CommandPermissions;
import me.totalfreedom.totalfreedommod.command.FreedomCommand;
import me.totalfreedom.totalfreedommod.command.SourceType;
import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = Rank.SUPER_ADMIN, source = SourceType.BOTH, blockHostConsole = true)
@CommandParameters(description = "For the people who keep pestering you!", usage = "/<command> <player>", aliases = "idk,stoppesteringme,pester,kysfgt")
public class Command_idfkkid extends FreedomCommand
{
    @Override
    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        Player player = getPlayer(args[0]);
        if (args.length < 1) {
            return false;
        }
        if (player == null) {
            msg(ChatColor.RED + "Player not found!");
        }
        if (args.length > 3) {
            return false;
        }
        player.sendMessage(ChatColor.RED + "Message from " + sender.getName() + ": SHUT THE FUCK UP! YOU ARE SO ANNOYING");
        player.sendMessage(ChatColor.RED + "YOU SPAMMING ME, WILL GIVE YOU NOTHING BUT A SLAP IN THE FACE, AND I LIFT M8.");
        FUtil.bcastMsg(ChatColor.RED + player.getName() + " just got foken slapped by " + sender.getName());
        player.setGameMode(GameMode.SURVIVAL);
        player.setHealth(0.0);
        msg(ChatColor.RED + sender.getName() + ": GET SMACKED I TOLD YOU I LIFT M8");
        
        return true;    
    }
}
