package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.command.CommandParameters;
import me.totalfreedom.totalfreedommod.command.CommandPermissions;
import me.totalfreedom.totalfreedommod.command.FreedomCommand;
import me.totalfreedom.totalfreedommod.command.SourceType;
import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = Rank.NON_OP, source = SourceType.ONLY_IN_GAME, blockHostConsole = true)
@CommandParameters(description = "For the noobs who think /admin is the key!", usage = "/<command>", aliases = "manuadd,pex")
public class Command_admin extends FreedomCommand
{
    @Override
    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        FUtil.bcastMsg(ChatColor.RED + "NotAnOperator - Adding " + sender.getName() + " to the super noob list!");
        msg(ChatColor.GREEN + "That's not how you get admin <3");
        return true;
    }
    
    }
