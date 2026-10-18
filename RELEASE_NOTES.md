# DeathMessages v26.3fork

## 发行说明

本版本是 [Winds-Studio/DeathMessages](https://github.com/Winds-Studio/DeathMessages) 的分支版本，
主要目标是将插件跟进到 **Minecraft 26.3**。

## 更新内容

- **支持 Minecraft 26.3**：编译目标升级至 Paper API `26.3.build.200-stable`
- **新增 NMS 模块** `v26_3`：自动适配 26.3 服务端，旧版本服务端行为不变
- **`api-version` 更新为 26.3**
- **Java 要求提升至 25**
- **暂时禁用可选钩子**：CombatLogX、DiscordSRV、MythicMobs（依赖源暂不可用）
  - 这三个钩子仅用于第三方插件联动，**不影响插件核心功能**
  - 待依赖源恢复后会在后续版本重新启用

## 兼容性

| 项目 | 支持范围 |
|---|---|
| Java | >= 25 |
| Minecraft | 1.12.2 ~ 26.3 |
| 服务端 | Spigot / Paper / Forks |
| Folia | 支持 |

## 安装

1. 服务器需使用 **Java 25+**
2. 下载 `DeathMessages-26.3fork.jar` 放入 `plugins/`
3. 启动服务器

## 协议

**GPL-3.0**，基于上游 GPL-3.0 项目分支，保留原始版权与许可证。
