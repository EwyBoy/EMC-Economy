package com.ewyboy.emceconomy.StringMaps;

import com.ewyboy.emceconomy.Core.EMCEconomy;

public class Names {

    public static final class Commands {
        public static final String BASE_COMMAND;
        public static final String PAY_PLAYER = "pay-player";

        public Commands() {
        }

        static {
            BASE_COMMAND = EMCEconomy.ModID.toLowerCase();
        }
    }
}
