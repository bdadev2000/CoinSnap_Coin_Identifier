package com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.enums;

import b1.f0;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class MenuGame {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MenuGame[] $VALUES;
    public static final MenuGame AUTO_SAVE;
    public static final MenuGame FAST_FORWARD;
    public static final MenuGame LOAD;
    public static final MenuGame MUTE;
    public static final MenuGame QUIT;
    public static final MenuGame RESTART;
    public static final MenuGame SAVE;
    private final int resId;

    @NotNull
    private final String title;

    private static final /* synthetic */ MenuGame[] $values() {
        return new MenuGame[]{SAVE, LOAD, RESTART, MUTE, FAST_FORWARD, AUTO_SAVE, QUIT};
    }

    static {
        MyImages myImages = MyImages.INSTANCE;
        SAVE = new MenuGame("SAVE", 0, "Save", myImages.getSave());
        LOAD = new MenuGame("LOAD", 1, "Load", myImages.getResume1());
        RESTART = new MenuGame("RESTART", 2, "Restart", myImages.getRestart1());
        MUTE = new MenuGame("MUTE", 3, "Mute", myImages.getMute());
        FAST_FORWARD = new MenuGame("FAST_FORWARD", 4, "Fast-Forward", myImages.getFast());
        AUTO_SAVE = new MenuGame("AUTO_SAVE", 5, "Auto Save", myImages.getAutoSave());
        QUIT = new MenuGame("QUIT", 6, "Quit", myImages.getQuit());
        MenuGame[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private MenuGame(String str, int i2, String str2, int i3) {
        this.title = str2;
        this.resId = i3;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static MenuGame valueOf(String str) {
        return (MenuGame) Enum.valueOf(MenuGame.class, str);
    }

    public static MenuGame[] values() {
        return (MenuGame[]) $VALUES.clone();
    }

    public final int getResId() {
        return this.resId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }
}
