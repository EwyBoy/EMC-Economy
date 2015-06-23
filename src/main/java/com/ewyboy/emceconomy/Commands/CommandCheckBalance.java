package com.ewyboy.emceconomy.Commands;

import com.ewyboy.emceconomy.Util.Logger;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class CommandCheckBalance extends CommandBase {

    @Override
    public String getCommandName() {
        return "check-balance";
    }

    public int getRequiredPermissionLevel() {
        return 2;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "checking your balance in your wallet and bank";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] strings) {
        Logger.info("Command " + getCommandName() + " just got used");
        sender.addChatMessage(new ChatComponentText("Wallet balance = 4371 EMC | Bank balance = 17636 EMC"));
    }
}
