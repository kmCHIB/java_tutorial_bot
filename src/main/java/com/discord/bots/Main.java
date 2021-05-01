package com.discord.bots;

import com.discord.bots.commands.help.Botinfo;
import com.discord.bots.commands.help.help;
import com.discord.bots.commands.system.Ping;
import com.discord.bots.commands.system.SendEmbed;
import de.btobastian.sdcf4j.CommandHandler;
import de.btobastian.sdcf4j.handler.JavacordHandler;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main
{
    public static final String Prefix = "t;";

    public static void main(String[] args)
    {
        DiscordApi bot = new DiscordApiBuilder().setToken(System.getenv().get("TOKEN")).login().join();
        CommandHandler handler = new JavacordHandler(bot);
        handler.setDefaultPrefix(Prefix);

        handler.registerCommand(new Ping());
        handler.registerCommand(new SendEmbed());
        handler.registerCommand(new Botinfo());
        handler.registerCommand(new help(handler));

        System.out.println("The bot is online!");
    }
}
