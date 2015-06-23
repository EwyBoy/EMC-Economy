package com.ewyboy.emceconomy.Commands;

import com.ewyboy.emceconomy.Util.Logger;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EMCCommandBase extends CommandBase {
    private static List<CommandBase> modCommands = new ArrayList();
    private static List<String> commands = new ArrayList();

    public EMCCommandBase() {
    }

    public String getCommandName() {
        return com.ewyboy.emceconomy.StringMaps.Names.Commands.BASE_COMMAND;
    }

    public String getCommandUsage(ICommandSender commandSender) {
        return "";
    }

    public void processCommand(ICommandSender commandSender, String[] args) {
        if(args.length >= 1) {
            Iterator var3 = modCommands.iterator();

            while(var3.hasNext()) {
                CommandBase command = (CommandBase)var3.next();
                if(command.getCommandName().equalsIgnoreCase(args[0]) && command.canCommandSenderUseCommand(commandSender)) {
                    command.processCommand(commandSender, args);
                }
            }
        }

    }

    public List addTabCompletionOptions(ICommandSender commandSender, String[] args) {
        if(args.length == 1) {
            return getListOfStringsFromIterableMatchingLastWord(args, commands);
        } else {
            if(args.length >= 2) {
                Iterator var3 = modCommands.iterator();

                while(var3.hasNext()) {
                    CommandBase command = (CommandBase)var3.next();
                    if(command.getCommandName().equalsIgnoreCase(args[0])) {
                        return command.addTabCompletionOptions(commandSender, args);
                    }
                }
            }

            return null;
        }
    }

    static {
        Logger.info("Loading in commands");
            modCommands.add(new CommandPayPlayer());
            modCommands.add(new CommandCheckBalance());
            modCommands.add(new CommandTransfer());
        Logger.info("Commands loaded");

        Iterator var0 = modCommands.iterator();

        while(var0.hasNext()) {
            CommandBase commandBase = (CommandBase)var0.next();
            commands.add(commandBase.getCommandName());
        }

    }
}
