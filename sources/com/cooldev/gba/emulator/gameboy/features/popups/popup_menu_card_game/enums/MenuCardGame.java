package com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.enums;

import b1.f0;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class MenuCardGame {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MenuCardGame[] $VALUES;
    public static final MenuCardGame AddToFavorites;
    public static final MenuCardGame Remove;
    public static final MenuCardGame RemoveFromFavorites;
    public static final MenuCardGame Restart;
    public static final MenuCardGame Resume;
    private final int resId;

    @NotNull
    private final String title;

    private static final /* synthetic */ MenuCardGame[] $values() {
        return new MenuCardGame[]{Resume, Restart, AddToFavorites, RemoveFromFavorites, Remove};
    }

    static {
        MyImages myImages = MyImages.INSTANCE;
        Resume = new MenuCardGame("Resume", 0, "Resume", myImages.getResume());
        Restart = new MenuCardGame("Restart", 1, "Restart", myImages.getRestart());
        AddToFavorites = new MenuCardGame("AddToFavorites", 2, "Add to favorites", myImages.getAddFavorite());
        RemoveFromFavorites = new MenuCardGame("RemoveFromFavorites", 3, "Remove from favorites", myImages.getRemoveFavorite());
        Remove = new MenuCardGame("Remove", 4, "Remove", myImages.getRemove());
        MenuCardGame[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private MenuCardGame(String str, int i2, String str2, int i3) {
        this.title = str2;
        this.resId = i3;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static MenuCardGame valueOf(String str) {
        return (MenuCardGame) Enum.valueOf(MenuCardGame.class, str);
    }

    public static MenuCardGame[] values() {
        return (MenuCardGame[]) $VALUES.clone();
    }

    public final int getResId() {
        return this.resId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }
}
