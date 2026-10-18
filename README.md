# DeathMessages (26.3 Fork)

![GitHub License](https://img.shields.io/badge/license-GPL--3.0-blue?style=for-the-badge)
![Minecraft](https://img.shields.io/badge/Minecraft-1.12.2%20~%2026.3-green?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-%3E%3D%2025-orange?style=for-the-badge)

> 本项目是 [Winds-Studio/DeathMessages](https://github.com/Winds-Studio/DeathMessages) 的**分支（Fork）**，
> 在原版基础上跟进 **Minecraft 26.3** 支持。原项目版权归其原作者所有，本分支同样以 **GPL-3.0** 协议开源。

## 这个分支做了什么

- ✅ 跟进 **Minecraft 26.3**（Paper API `26.3.build.200-stable`）
- ✅ 新增 NMS 模块 `nms/paper/v26_3`，运行时按版本自动路由
- ✅ `plugin.yml` 的 `api-version` 更新为 `26.3`
- ✅ Java 工具链升级到 **25**（26.3 运行时要求）
- ⚠️ 暂时禁用 **CombatLogX / DiscordSRV / MythicMobs** 三个可选钩子
  （其依赖仓库/下载源当前不可用），**不影响核心功能**

## 功能特性

- 修复原版 DeathMessages 的若干错误与问题
- 高度优化的死亡消息处理
- 持续维护

## 兼容性

| 项目 | 支持范围 |
|---|---|
| Java 版本 | `>= 25` |
| Minecraft 版本 | 1.12.2 ~ 26.3 |
| 服务端 | Spigot / Paper / 各类 Fork |
| Folia | 支持 |
| 多插件联动 | 支持（PlaceholderAPI、WorldGuard、eco、EcoEnchants 等） |

> Forge / Bukkit 混合端兼容性有限，如有问题请反馈。

## 安装

1. 确保服务器使用 **Java 25** 及以上版本
2. 将 `DeathMessages-26.3fork.jar` 放入 `plugins/` 目录
3. 启动服务器，按需编辑 `plugins/DeathMessages/` 下的配置文件

## 构建

```bash
# 需要 JDK 25（Gradle 会通过 toolchain 自动获取）
./gradlew clean build
```

产物位于 `core/build/libs/DeathMessages-26.3fork.jar`。

## 开源协议

本项目遵循 **GNU General Public License v3.0（GPL-3.0）**，详见 [LICENSE](LICENSE)。

由于基于 GPL-3.0 项目分支，任何分发（包括修改后分发）都必须：
- 保留原始版权声明与许可证
- 公开完整源代码
- 同样以 GPL-3.0 授权

## 致谢

- 原项目：[Winds-Studio/DeathMessages](https://github.com/Winds-Studio/DeathMessages)
- 原作者及所有贡献者
- 上游继承的致谢对象（剑客云等）见原项目 README
