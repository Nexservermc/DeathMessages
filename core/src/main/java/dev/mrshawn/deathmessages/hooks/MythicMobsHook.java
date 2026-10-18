package dev.mrshawn.deathmessages.hooks;

import org.bukkit.entity.Entity;

import java.util.UUID;

/**
 * MythicMobs 钩子暂时禁用（io.lumine:Mythic-Dist 依赖暂不可用）。
 * 保留同名 API 供调用方编译，运行时始终返回 false / null。
 */
public class MythicMobsHook {

    private static final APIHelper INSTANCE = new APIHelper();

    public APIHelper get() {
        return INSTANCE;
    }

    public static final class APIHelper {

        public boolean isMythicMob(UUID uuid) {
            return false;
        }

        public MythicMobInstance getMythicMobInstance(Entity entity) {
            return new MythicMobInstance();
        }
    }

    public static final class MythicMobInstance {

        public String getMobType() {
            return "";
        }
    }
}
