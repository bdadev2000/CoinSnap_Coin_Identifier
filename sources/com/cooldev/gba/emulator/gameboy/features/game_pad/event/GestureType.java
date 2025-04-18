package com.cooldev.gba.emulator.gameboy.features.game_pad.event;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GestureType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GestureType[] $VALUES;
    public static final GestureType FIRST_TOUCH = new GestureType("FIRST_TOUCH", 0);
    public static final GestureType SINGLE_TAP = new GestureType("SINGLE_TAP", 1);
    public static final GestureType DOUBLE_TAP = new GestureType("DOUBLE_TAP", 2);
    public static final GestureType TRIPLE_TAP = new GestureType("TRIPLE_TAP", 3);

    private static final /* synthetic */ GestureType[] $values() {
        return new GestureType[]{FIRST_TOUCH, SINGLE_TAP, DOUBLE_TAP, TRIPLE_TAP};
    }

    static {
        GestureType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private GestureType(String str, int i2) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static GestureType valueOf(String str) {
        return (GestureType) Enum.valueOf(GestureType.class, str);
    }

    public static GestureType[] values() {
        return (GestureType[]) $VALUES.clone();
    }
}
