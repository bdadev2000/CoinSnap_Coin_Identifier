package com.cooldev.gba.emulator.gameboy.local.storage;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GamePlayCounterKey {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GamePlayCounterKey[] $VALUES;

    @NotNull
    private final String key;
    public static final GamePlayCounterKey GAME_PLAY_COUNTER = new GamePlayCounterKey("GAME_PLAY_COUNTER", 0, "gamePlayCounter");
    public static final GamePlayCounterKey FREE_PLAY_COUNTER = new GamePlayCounterKey("FREE_PLAY_COUNTER", 1, "freePlayCounter");

    private static final /* synthetic */ GamePlayCounterKey[] $values() {
        return new GamePlayCounterKey[]{GAME_PLAY_COUNTER, FREE_PLAY_COUNTER};
    }

    static {
        GamePlayCounterKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private GamePlayCounterKey(String str, int i2, String str2) {
        this.key = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static GamePlayCounterKey valueOf(String str) {
        return (GamePlayCounterKey) Enum.valueOf(GamePlayCounterKey.class, str);
    }

    public static GamePlayCounterKey[] values() {
        return (GamePlayCounterKey[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
