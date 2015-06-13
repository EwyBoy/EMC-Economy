package com.ewyboy.emceconomy.Commands;

import com.ewyboy.emceconomy.Util.Logger;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

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
        Logger.info("Command " + getCommandName() + " just got used");
        sender.addChatMessage(new ChatComponentText("Payed testPlayer32 1000 EMC"));
    }
}
