package com.cooldev.gba.emulator.gameboy.local.storage;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AppPrefKeys {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AppPrefKeys[] $VALUES;

    @NotNull
    private final String key;
    public static final AppPrefKeys ONBOARDING_VISIBLE = new AppPrefKeys("ONBOARDING_VISIBLE", 0, "onboardingVisible");
    public static final AppPrefKeys HOME_RATING_DIALOG_VISIBLE = new AppPrefKeys("HOME_RATING_DIALOG_VISIBLE", 1, "homeRatingDialogVisible");
    public static final AppPrefKeys FIRST_OPEN = new AppPrefKeys("FIRST_OPEN", 2, "firstOpen");
    public static final AppPrefKeys SHOULD_SHOW_GUIDE = new AppPrefKeys("SHOULD_SHOW_GUIDE", 3, "shouldShowGuide");
    public static final AppPrefKeys SURVEY_DIALOG_SHOWN = new AppPrefKeys("SURVEY_DIALOG_SHOWN", 4, "surveyDialogShown");
    public static final AppPrefKeys HAS_CHECKED_FOR_UPDATE = new AppPrefKeys("HAS_CHECKED_FOR_UPDATE", 5, "hasCheckedForUpdate");
    public static final AppPrefKeys GAME_PAD_THEME = new AppPrefKeys("GAME_PAD_THEME", 6, "gamePadTheme");

    private static final /* synthetic */ AppPrefKeys[] $values() {
        return new AppPrefKeys[]{ONBOARDING_VISIBLE, HOME_RATING_DIALOG_VISIBLE, FIRST_OPEN, SHOULD_SHOW_GUIDE, SURVEY_DIALOG_SHOWN, HAS_CHECKED_FOR_UPDATE, GAME_PAD_THEME};
    }

    static {
        AppPrefKeys[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private AppPrefKeys(String str, int i2, String str2) {
        this.key = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AppPrefKeys valueOf(String str) {
        return (AppPrefKeys) Enum.valueOf(AppPrefKeys.class, str);
    }

    public static AppPrefKeys[] values() {
        return (AppPrefKeys[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
