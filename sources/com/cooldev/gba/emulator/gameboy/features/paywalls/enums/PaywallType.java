package com.cooldev.gba.emulator.gameboy.features.paywalls.enums;

import b1.f0;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class PaywallType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PaywallType[] $VALUES;
    private final int numberCode;

    @NotNull
    private final String routeName;
    public static final PaywallType DEFAULT = new PaywallType("DEFAULT", 0, 0, RouterName.PAYWALL_DEFAULT);
    public static final PaywallType YEARLY_NON_TRIAL = new PaywallType("YEARLY_NON_TRIAL", 1, 1, RouterName.PAYWALL_YEARLY_NON_TRIAL);
    public static final PaywallType LIFETIME = new PaywallType("LIFETIME", 2, 2, RouterName.PAYWALL_LIFETIME);
    public static final PaywallType WEEKLY_NON_TRIAL = new PaywallType("WEEKLY_NON_TRIAL", 3, 3, RouterName.PAYWALL_WEEKLY_NON_TRIAL);

    private static final /* synthetic */ PaywallType[] $values() {
        return new PaywallType[]{DEFAULT, YEARLY_NON_TRIAL, LIFETIME, WEEKLY_NON_TRIAL};
    }

    static {
        PaywallType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private PaywallType(String str, int i2, int i3, String str2) {
        this.numberCode = i3;
        this.routeName = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static PaywallType valueOf(String str) {
        return (PaywallType) Enum.valueOf(PaywallType.class, str);
    }

    public static PaywallType[] values() {
        return (PaywallType[]) $VALUES.clone();
    }

    public final int getNumberCode() {
        return this.numberCode;
    }

    @NotNull
    public final String getRouteName() {
        return this.routeName;
    }
}
