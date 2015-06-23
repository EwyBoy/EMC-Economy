package com.ewyboy.emceconomy.Commands;

import com.ewyboy.emceconomy.Util.Logger;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class CommandTransfer extends CommandBase {

    @Override
    public String getCommandName() {
        return "transfer";
    }

    public int getRequiredPermissionLevel() {
        return 2;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "Transfers EMC from wallet";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] strings) {
        Logger.info("Command " + getCommandName() + " just got used");
        sender.addChatMessage(new ChatComponentText("Transferred EMC"));
    }
}
