package com.cooldev.gba.emulator.gameboy.features.setting.enums;

import b1.f0;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SettingEnum {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SettingEnum[] $VALUES;
    public static final SettingEnum Email;
    public static final SettingEnum Help;
    public static final SettingEnum Policy;
    public static final SettingEnum Review;
    public static final SettingEnum Store;
    public static final SettingEnum Subscription;
    public static final SettingEnum Term;
    private final int resId;

    @NotNull
    private final String title;

    private static final /* synthetic */ SettingEnum[] $values() {
        return new SettingEnum[]{Store, Subscription, Term, Policy, Email, Review, Help};
    }

    static {
        MyImages myImages = MyImages.INSTANCE;
        Store = new SettingEnum("Store", 0, "Store", myImages.getStore());
        Subscription = new SettingEnum("Subscription", 1, "Manage Subscriptions", myImages.getSubs());
        Term = new SettingEnum("Term", 2, "Term and Conditions", myImages.getTerm());
        Policy = new SettingEnum("Policy", 3, "Privacy Policy", myImages.getPolicy());
        Email = new SettingEnum("Email", 4, "Email us", myImages.getEmail());
        Review = new SettingEnum("Review", 5, "Review App", myImages.getReview());
        Help = new SettingEnum("Help", 6, "Help", myImages.getHelp());
        SettingEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private SettingEnum(String str, int i2, String str2, int i3) {
        this.title = str2;
        this.resId = i3;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static SettingEnum valueOf(String str) {
        return (SettingEnum) Enum.valueOf(SettingEnum.class, str);
    }

    public static SettingEnum[] values() {
        return (SettingEnum[]) $VALUES.clone();
    }

    public final int getResId() {
        return this.resId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }
}
