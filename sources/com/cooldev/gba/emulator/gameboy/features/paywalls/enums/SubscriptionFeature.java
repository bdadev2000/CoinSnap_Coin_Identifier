package com.cooldev.gba.emulator.gameboy.features.paywalls.enums;

import b1.f0;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class SubscriptionFeature {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SubscriptionFeature[] $VALUES;
    public static final SubscriptionFeature MULTIFUNCTION_GAMING_SUPPORT;
    public static final SubscriptionFeature PREMIUM_UPDATES_SUPPORT;
    public static final SubscriptionFeature REMOVE_INTERRUPTIVE_ADS;
    public static final SubscriptionFeature UNLIMITED_GAMEPLAY;
    private final int imageRes;

    @NotNull
    private final String title;

    private static final /* synthetic */ SubscriptionFeature[] $values() {
        return new SubscriptionFeature[]{UNLIMITED_GAMEPLAY, PREMIUM_UPDATES_SUPPORT, REMOVE_INTERRUPTIVE_ADS, MULTIFUNCTION_GAMING_SUPPORT};
    }

    static {
        MyImages myImages = MyImages.INSTANCE;
        UNLIMITED_GAMEPLAY = new SubscriptionFeature("UNLIMITED_GAMEPLAY", 0, myImages.getGameplay(), "Unlimited gameplay");
        PREMIUM_UPDATES_SUPPORT = new SubscriptionFeature("PREMIUM_UPDATES_SUPPORT", 1, myImages.getLastUpdate(), "Last Update");
        REMOVE_INTERRUPTIVE_ADS = new SubscriptionFeature("REMOVE_INTERRUPTIVE_ADS", 2, myImages.getNoAd(), "No Ads");
        MULTIFUNCTION_GAMING_SUPPORT = new SubscriptionFeature("MULTIFUNCTION_GAMING_SUPPORT", 3, myImages.getSupport(), "Multi-function support");
        SubscriptionFeature[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private SubscriptionFeature(String str, int i2, int i3, String str2) {
        this.imageRes = i3;
        this.title = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionFeature valueOf(String str) {
        return (SubscriptionFeature) Enum.valueOf(SubscriptionFeature.class, str);
    }

    public static SubscriptionFeature[] values() {
        return (SubscriptionFeature[]) $VALUES.clone();
    }

    public final int getImageRes() {
        return this.imageRes;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }
}
