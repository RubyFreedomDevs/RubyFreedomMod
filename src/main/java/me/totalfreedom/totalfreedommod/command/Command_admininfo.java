package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


@CommandPermissions(level = Rank.OP, source = SourceType.BOTH)
@CommandParameters(description = "Information about how to apply for admin.", usage = "/<command>", aliases = "ai")
public class Command_admininfo extends FreedomCommand
{
    @Override
    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        
        FUtil.bcastMsg(ChatColor.RED + "+ Our forums are located at rubyfreedom.ga/forums");
        FUtil.bcastMsg(ChatColor.RED + "+ From there, follow the application template and post a thread with");
        FUtil.bcastMsg(ChatColor.RED + "" + ChatColor.BOLD + "the answers and the questions.");
        FUtil.bcastMsg(ChatColor.BLUE + "+ Good Luck!");
        return true;
    }
    
    
}
