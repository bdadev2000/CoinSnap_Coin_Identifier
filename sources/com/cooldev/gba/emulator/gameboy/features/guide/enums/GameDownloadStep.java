package com.cooldev.gba.emulator.gameboy.features.guide.enums;

import b1.f0;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GameDownloadStep {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GameDownloadStep[] $VALUES;
    public static final GameDownloadStep PICK_WEBSITE;
    public static final GameDownloadStep SAVE_GAME;
    public static final GameDownloadStep SCAN_GAME;
    public static final GameDownloadStep SELECT_GAME;

    @NotNull
    private final String description;
    private final int image;

    @NotNull
    private final String title;

    private static final /* synthetic */ GameDownloadStep[] $values() {
        return new GameDownloadStep[]{PICK_WEBSITE, SELECT_GAME, SAVE_GAME, SCAN_GAME};
    }

    static {
        MyImages myImages = MyImages.INSTANCE;
        PICK_WEBSITE = new GameDownloadStep("PICK_WEBSITE", 0, "Pick Website to Download Game", "Click on \"Start Download Now\" or “SITE” to access the list of websites where you can download your favorite games!", myImages.getStep1());
        SELECT_GAME = new GameDownloadStep("SELECT_GAME", 1, "Select Your Favorite Game", "Choose your favorite games based on the console, and explore a massive collection of titles from various genres that bring back childhood memories!", myImages.getStep2());
        SAVE_GAME = new GameDownloadStep("SAVE_GAME", 2, "Press 'Save Game'", "Press \"Save Game\" to download your favorite games to your device. You can download multiple games at once and build one of the most enjoyable gaming experiences ever!. You can save the games in any folder on your phone, but it’s best to keep them in one folder for easy management.", myImages.getStep3());
        SCAN_GAME = new GameDownloadStep("SCAN_GAME", 3, "Press 'Scan Game'", "Go back to the app and press \"Scan Game\" to detect and import all your games. You can start enjoying them right away!", myImages.getStep4());
        GameDownloadStep[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private GameDownloadStep(String str, int i2, String str2, String str3, int i3) {
        this.title = str2;
        this.description = str3;
        this.image = i3;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static GameDownloadStep valueOf(String str) {
        return (GameDownloadStep) Enum.valueOf(GameDownloadStep.class, str);
    }

    public static GameDownloadStep[] values() {
        return (GameDownloadStep[]) $VALUES.clone();
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getImage() {
        return this.image;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }
}
