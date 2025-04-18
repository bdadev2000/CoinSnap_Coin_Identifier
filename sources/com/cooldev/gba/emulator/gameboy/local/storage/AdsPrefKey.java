package com.cooldev.gba.emulator.gameboy.local.storage;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AdsPrefKey {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdsPrefKey[] $VALUES;
    public static final AdsPrefKey CLICK_COUNT = new AdsPrefKey("CLICK_COUNT", 0, "clickCount");
    public static final AdsPrefKey COUNT_SHOW_ADS = new AdsPrefKey("COUNT_SHOW_ADS", 1, "countShowAds");
    public static final AdsPrefKey LAST_AD_TIME = new AdsPrefKey("LAST_AD_TIME", 2, "lastAdTime");

    @NotNull
    private final String key;

    private static final /* synthetic */ AdsPrefKey[] $values() {
        return new AdsPrefKey[]{CLICK_COUNT, COUNT_SHOW_ADS, LAST_AD_TIME};
    }

    static {
        AdsPrefKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private AdsPrefKey(String str, int i2, String str2) {
        this.key = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AdsPrefKey valueOf(String str) {
        return (AdsPrefKey) Enum.valueOf(AdsPrefKey.class, str);
    }

    public static AdsPrefKey[] values() {
        return (AdsPrefKey[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
