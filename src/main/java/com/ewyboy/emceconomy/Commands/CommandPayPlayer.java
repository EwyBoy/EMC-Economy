package com.ewyboy.emceconomy.Commands;

import com.ewyboy.emceconomy.Util.Logger;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;

public class CommandPayPlayer extends CommandBase {

    @Override
    public String getCommandName() {
        return "pay-player";
    }

    public int getRequiredPermissionLevel() {
        return 2;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "Pays a player a optional amount of EMC";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] strings) {
        if (sender instanceof EntityPlayer) {
            Logger.info("Command " + getCommandName() + " just got used");
                EntityPlayer player = (EntityPlayer) sender;
        } else {
            Logger.warn("This command can only be performed by a player");
        }
    }
}
