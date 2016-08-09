package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = Rank.SUPER_ADMIN, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "KILL YOURSELF", usage = "/<command> <player>", aliases = "killyourself")
public class Command_kys extends FreedomCommand
{
    
    public static final String KYS_FAG = ChatColor.RED + "YOU CAN'T TELL SOMEONE TO KILL THEMSELF IF THEY'RE NOT ONLINE";
    
    @Override
    protected boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (args.length < 1) { 
            return false; 
        }
        Player player = getPlayer(args[0]);
        if (player == null)
        {
            msg(KYS_FAG);
            return true;
        }
        
        FUtil.bcastMsg(ChatColor.translateAlternateColorCodes('&', "&c" + sender.getName() + " &c- Kill yourself, " + player.getName()));
        try {
    Thread.sleep(3000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        player.chat("No!");
        try {
    Thread.sleep(3000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        FUtil.bcastMsg(ChatColor.translateAlternateColorCodes('&', "&c" + sender.getName() + " &c- Yes! No one likes you, what's the point? " + player.getName()));
        try {
    Thread.sleep(3000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        player.chat("You know what, maybe you're right! :'( Maybe I should kms!");
        try {
    Thread.sleep(2000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        player.chat("Goodbye cruel world! :(");
        player.setHealth(0);
        
        return true;
    }
    
}
