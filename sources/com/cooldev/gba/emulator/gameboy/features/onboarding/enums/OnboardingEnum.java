package com.cooldev.gba.emulator.gameboy.features.onboarding.enums;

import b1.f0;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class OnboardingEnum {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OnboardingEnum[] $VALUES;
    public static final OnboardingEnum First;
    public static final OnboardingEnum Second;
    public static final OnboardingEnum Third;
    private final int resId;

    @NotNull
    private final String title;

    private static final /* synthetic */ OnboardingEnum[] $values() {
        return new OnboardingEnum[]{First, Second, Third};
    }

    static {
        MyImages myImages = MyImages.INSTANCE;
        First = new OnboardingEnum("First", 0, "Immerse\nyourself in\nchildhood games", myImages.getOnboarding1());
        Second = new OnboardingEnum("Second", 1, "High\nperformance\ngame emulator", myImages.getOnboarding2());
        Third = new OnboardingEnum("Third", 2, "Explore \nthe very huge\ngame store", myImages.getOnboarding3());
        OnboardingEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private OnboardingEnum(String str, int i2, String str2, int i3) {
        this.title = str2;
        this.resId = i3;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static OnboardingEnum valueOf(String str) {
        return (OnboardingEnum) Enum.valueOf(OnboardingEnum.class, str);
    }

    public static OnboardingEnum[] values() {
        return (OnboardingEnum[]) $VALUES.clone();
    }

    public final int getResId() {
        return this.resId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }
}
