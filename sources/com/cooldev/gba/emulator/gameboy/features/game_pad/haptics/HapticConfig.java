package com.cooldev.gba.emulator.gameboy.features.game_pad.haptics;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HapticConfig {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ HapticConfig[] $VALUES;
    public static final HapticConfig OFF = new HapticConfig("OFF", 0);
    public static final HapticConfig PRESS = new HapticConfig("PRESS", 1);
    public static final HapticConfig PRESS_AND_RELEASE = new HapticConfig("PRESS_AND_RELEASE", 2);

    private static final /* synthetic */ HapticConfig[] $values() {
        return new HapticConfig[]{OFF, PRESS, PRESS_AND_RELEASE};
    }

    static {
        HapticConfig[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private HapticConfig(String str, int i2) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static HapticConfig valueOf(String str) {
        return (HapticConfig) Enum.valueOf(HapticConfig.class, str);
    }

    public static HapticConfig[] values() {
        return (HapticConfig[]) $VALUES.clone();
    }
}
