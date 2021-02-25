package com.discord.bots;

import com.discord.bots.commands.Ping;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main
{
    public static final String Prefix = ";";

    public static void main(String[] args)
    {
        DiscordApi bot = new DiscordApiBuilder().setToken(System.getenv().get("TOKEN")).login().join();

        bot.addListener(new Ping());

        System.out.println("The bot is online!");
    }
}
