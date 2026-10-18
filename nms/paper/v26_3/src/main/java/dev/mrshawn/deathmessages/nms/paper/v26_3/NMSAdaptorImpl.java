package dev.mrshawn.deathmessages.nms.paper.v26_3;

import net.kyori.adventure.text.Component;
import org.bukkit.inventory.ItemStack;

public class NMSAdaptorImpl extends dev.mrshawn.deathmessages.nms.paper.v1_21_4.NMSAdaptorImpl {

    // NOTE: 26.1+ 已移除 Spigot 映射，仅使用 Mojang 官方映射。
    // 此处沿用 v1_21_4 的 API 调用，若 26.3 中 ItemStack#effectiveName 行为变化，
    // 需按 Mojang 映射重新验证/调整。
    @Override
    public Component itemDisplayName(ItemStack i) {
        return i.effectiveName();
    }
}
