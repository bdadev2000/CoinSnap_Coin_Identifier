package com.cooldev.gba.emulator.gameboy.local.storage;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class GamePrefKeys {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GamePrefKeys[] $VALUES;
    public static final GamePrefKeys LIST_GAME = new GamePrefKeys("LIST_GAME", 0, "list_game");

    @NotNull
    private final String key;

    private static final /* synthetic */ GamePrefKeys[] $values() {
        return new GamePrefKeys[]{LIST_GAME};
    }

    static {
        GamePrefKeys[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private GamePrefKeys(String str, int i2, String str2) {
        this.key = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static GamePrefKeys valueOf(String str) {
        return (GamePrefKeys) Enum.valueOf(GamePrefKeys.class, str);
    }

    public static GamePrefKeys[] values() {
        return (GamePrefKeys[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
