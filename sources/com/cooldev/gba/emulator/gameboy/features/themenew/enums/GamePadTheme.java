package com.cooldev.gba.emulator.gameboy.features.themenew.enums;

import b1.f0;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class GamePadTheme {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GamePadTheme[] $VALUES;
    public static final GamePadTheme Default;
    public static final GamePadTheme FutureTech;
    public static final GamePadTheme NewStyle;
    public static final GamePadTheme ThreeDStyle;
    private int iconResId;
    private boolean lock;

    @NotNull
    private final String title;

    private static final /* synthetic */ GamePadTheme[] $values() {
        return new GamePadTheme[]{Default, NewStyle, FutureTech, ThreeDStyle};
    }

    static {
        MyImages myImages = MyImages.INSTANCE;
        Default = new GamePadTheme("Default", 0, "Default", myImages.getGamePadDefault(), false);
        NewStyle = new GamePadTheme("NewStyle", 1, "New Style", myImages.getGamePadNewStyle(), true);
        FutureTech = new GamePadTheme("FutureTech", 2, "Future Tech", myImages.getGamePadFutureTech(), true);
        ThreeDStyle = new GamePadTheme("ThreeDStyle", 3, "3D Style", myImages.getGamePad3DStyle(), true);
        GamePadTheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private GamePadTheme(String str, int i2, String str2, int i3, boolean z2) {
        this.title = str2;
        this.iconResId = i3;
        this.lock = z2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static GamePadTheme valueOf(String str) {
        return (GamePadTheme) Enum.valueOf(GamePadTheme.class, str);
    }

    public static GamePadTheme[] values() {
        return (GamePadTheme[]) $VALUES.clone();
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final boolean getLock() {
        return this.lock;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setIconResId(int i2) {
        this.iconResId = i2;
    }

    public final void setLock(boolean z2) {
        this.lock = z2;
    }
}
