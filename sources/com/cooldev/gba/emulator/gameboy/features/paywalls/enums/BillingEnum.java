package com.cooldev.gba.emulator.gameboy.features.paywalls.enums;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class BillingEnum {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BillingEnum[] $VALUES;
    public static final BillingEnum LIFETIME;
    public static final BillingEnum MONTHLY;
    public static final BillingEnum WEEKLY;
    public static final BillingEnum WEEKLY_NON_TRIAL;
    public static final BillingEnum YEARLY;
    public static final BillingEnum YEARLY_NON_TRIAL;

    @NotNull
    private final String skuId;

    @NotNull
    private final String title;

    @NotNull
    private final TypeBilling type;

    private static final /* synthetic */ BillingEnum[] $values() {
        return new BillingEnum[]{WEEKLY, YEARLY, MONTHLY, LIFETIME, YEARLY_NON_TRIAL, WEEKLY_NON_TRIAL};
    }

    static {
        TypeBilling typeBilling = TypeBilling.SUBSCRIPTION;
        WEEKLY = new BillingEnum("WEEKLY", 0, "weekly", "Weekly", typeBilling);
        YEARLY = new BillingEnum("YEARLY", 1, "yearly", "Yearly", typeBilling);
        MONTHLY = new BillingEnum("MONTHLY", 2, "monthly", "Monthly", typeBilling);
        LIFETIME = new BillingEnum("LIFETIME", 3, "lifetime", "Lifetime", TypeBilling.IN_APP_PURCHASE);
        YEARLY_NON_TRIAL = new BillingEnum("YEARLY_NON_TRIAL", 4, "yearly1", "Yearly", typeBilling);
        WEEKLY_NON_TRIAL = new BillingEnum("WEEKLY_NON_TRIAL", 5, "weeklypremium", "Weekly", typeBilling);
        BillingEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private BillingEnum(String str, int i2, String str2, String str3, TypeBilling typeBilling) {
        this.skuId = str2;
        this.title = str3;
        this.type = typeBilling;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static BillingEnum valueOf(String str) {
        return (BillingEnum) Enum.valueOf(BillingEnum.class, str);
    }

    public static BillingEnum[] values() {
        return (BillingEnum[]) $VALUES.clone();
    }

    @NotNull
    public final String getSkuId() {
        return this.skuId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final TypeBilling getType() {
        return this.type;
    }
}
