package com.cooldev.gba.emulator.gameboy.features.paywalls.enums;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class TypeBilling {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TypeBilling[] $VALUES;
    public static final TypeBilling SUBSCRIPTION = new TypeBilling("SUBSCRIPTION", 0);
    public static final TypeBilling IN_APP_PURCHASE = new TypeBilling("IN_APP_PURCHASE", 1);

    private static final /* synthetic */ TypeBilling[] $values() {
        return new TypeBilling[]{SUBSCRIPTION, IN_APP_PURCHASE};
    }

    static {
        TypeBilling[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private TypeBilling(String str, int i2) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static TypeBilling valueOf(String str) {
        return (TypeBilling) Enum.valueOf(TypeBilling.class, str);
    }

    public static TypeBilling[] values() {
        return (TypeBilling[]) $VALUES.clone();
    }
}
