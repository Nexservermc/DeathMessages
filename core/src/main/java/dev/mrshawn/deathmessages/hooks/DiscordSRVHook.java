package dev.mrshawn.deathmessages.hooks;

import dev.mrshawn.deathmessages.api.PlayerCtx;
import dev.mrshawn.deathmessages.enums.MessageType;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.entity.Entity;

/**
 * DiscordSRV 钩子暂时禁用（com.discordsrv:discordsrv 依赖暂不可用）。
 * 保留同名 API 供调用方编译，运行时不做任何事。
 */
public class DiscordSRVHook {

    public void sendDiscordMessage(TextComponent[] components, MessageType messageType, PlayerCtx playerCtx) {
        // no-op
    }

    public void sendEntityDiscordMessage(TextComponent[] components, MessageType messageType, PlayerCtx playerCtx,
                                         Entity entity, boolean hasOwner) {
        // no-op
    }
}
