package com.cooldev.gba.emulator.gameboy.local.storage;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class AppAdSettingsKey {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AppAdSettingsKey[] $VALUES;
    public static final AppAdSettingsKey SHOW_APP_OPEN_AD_ON_RESUME = new AppAdSettingsKey("SHOW_APP_OPEN_AD_ON_RESUME", 0, "showAppOpenAdOnResume");

    @NotNull
    private final String key;

    private static final /* synthetic */ AppAdSettingsKey[] $values() {
        return new AppAdSettingsKey[]{SHOW_APP_OPEN_AD_ON_RESUME};
    }

    static {
        AppAdSettingsKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private AppAdSettingsKey(String str, int i2, String str2) {
        this.key = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AppAdSettingsKey valueOf(String str) {
        return (AppAdSettingsKey) Enum.valueOf(AppAdSettingsKey.class, str);
    }

    public static AppAdSettingsKey[] values() {
        return (AppAdSettingsKey[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
