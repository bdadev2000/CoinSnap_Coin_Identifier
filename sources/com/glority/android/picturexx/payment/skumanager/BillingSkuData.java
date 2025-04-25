package com.glority.android.picturexx.payment.skumanager;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingSkuData.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, d2 = {"Lcom/glority/android/picturexx/payment/skumanager/BillingSkuData;", "", "skuName", "", "isTrial", "", "trialDays", "", "skuCycle", "skuType", "cycleValue", "<init>", "(Ljava/lang/String;ZIILjava/lang/String;I)V", "getSkuName", "()Ljava/lang/String;", "()Z", "getTrialDays", "()I", "getSkuCycle", "getSkuType", "getCycleValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "Companion", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final /* data */ class BillingSkuData {
    public static final int SKU_CYCLE_MONTH = 1;
    public static final int SKU_CYCLE_NONE = -1;
    public static final int SKU_CYCLE_WEEK = 0;
    public static final int SKU_CYCLE_YEAR = 2;
    private final int cycleValue;
    private final boolean isTrial;
    private final int skuCycle;
    private final String skuName;
    private final String skuType;
    private final int trialDays;

    /* renamed from: component1, reason: from getter */
    public final String getSkuName() {
        return this.skuName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsTrial() {
        return this.isTrial;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTrialDays() {
        return this.trialDays;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSkuCycle() {
        return this.skuCycle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSkuType() {
        return this.skuType;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCycleValue() {
        return this.cycleValue;
    }

    public final BillingSkuData copy(String skuName, boolean isTrial, int trialDays, int skuCycle, String skuType, int cycleValue) {
        Intrinsics.checkNotNullParameter(skuName, "skuName");
        Intrinsics.checkNotNullParameter(skuType, "skuType");
        return new BillingSkuData(skuName, isTrial, trialDays, skuCycle, skuType, cycleValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingSkuData)) {
            return false;
        }
        BillingSkuData billingSkuData = (BillingSkuData) other;
        return Intrinsics.areEqual(this.skuName, billingSkuData.skuName) && this.isTrial == billingSkuData.isTrial && this.trialDays == billingSkuData.trialDays && this.skuCycle == billingSkuData.skuCycle && Intrinsics.areEqual(this.skuType, billingSkuData.skuType) && this.cycleValue == billingSkuData.cycleValue;
    }

    public int hashCode() {
        return (((((((((this.skuName.hashCode() * 31) + Boolean.hashCode(this.isTrial)) * 31) + Integer.hashCode(this.trialDays)) * 31) + Integer.hashCode(this.skuCycle)) * 31) + this.skuType.hashCode()) * 31) + Integer.hashCode(this.cycleValue);
    }

    public String toString() {
        return "BillingSkuData(skuName=" + this.skuName + ", isTrial=" + this.isTrial + ", trialDays=" + this.trialDays + ", skuCycle=" + this.skuCycle + ", skuType=" + this.skuType + ", cycleValue=" + this.cycleValue + ")";
    }

    public BillingSkuData(String skuName, boolean z, int i, int i2, String skuType, int i3) {
        Intrinsics.checkNotNullParameter(skuName, "skuName");
        Intrinsics.checkNotNullParameter(skuType, "skuType");
        this.skuName = skuName;
        this.isTrial = z;
        this.trialDays = i;
        this.skuCycle = i2;
        this.skuType = skuType;
        this.cycleValue = i3;
    }

    public /* synthetic */ BillingSkuData(String str, boolean z, int i, int i2, String str2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, i, i2, str2, (i4 & 32) != 0 ? 1 : i3);
    }

    public static /* synthetic */ BillingSkuData copy$default(BillingSkuData billingSkuData, String str, boolean z, int i, int i2, String str2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = billingSkuData.skuName;
        }
        if ((i4 & 2) != 0) {
            z = billingSkuData.isTrial;
        }
        boolean z2 = z;
        if ((i4 & 4) != 0) {
            i = billingSkuData.trialDays;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = billingSkuData.skuCycle;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            str2 = billingSkuData.skuType;
        }
        String str3 = str2;
        if ((i4 & 32) != 0) {
            i3 = billingSkuData.cycleValue;
        }
        return billingSkuData.copy(str, z2, i5, i6, str3, i3);
    }

    public final int getCycleValue() {
        return this.cycleValue;
    }

    public final int getSkuCycle() {
        return this.skuCycle;
    }

    public final String getSkuName() {
        return this.skuName;
    }

    public final String getSkuType() {
        return this.skuType;
    }

    public final int getTrialDays() {
        return this.trialDays;
    }

    public final boolean isTrial() {
        return this.isTrial;
    }
}
