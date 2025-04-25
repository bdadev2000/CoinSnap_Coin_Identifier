package com.glority.billing.utils;

import com.android.billingclient.api.Purchase;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentUtils.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/glority/billing/utils/PaddingData;", "", FirebaseAnalytics.Event.PURCHASE, "Lcom/android/billingclient/api/Purchase;", "isInApp", "", "<init>", "(Lcom/android/billingclient/api/Purchase;Z)V", "getPurchase", "()Lcom/android/billingclient/api/Purchase;", "setPurchase", "(Lcom/android/billingclient/api/Purchase;)V", "()Z", "setInApp", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class PaddingData {
    private boolean isInApp;
    private Purchase purchase;

    /* renamed from: component1, reason: from getter */
    public final Purchase getPurchase() {
        return this.purchase;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsInApp() {
        return this.isInApp;
    }

    public final PaddingData copy(Purchase purchase, boolean isInApp) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        return new PaddingData(purchase, isInApp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingData)) {
            return false;
        }
        PaddingData paddingData = (PaddingData) other;
        return Intrinsics.areEqual(this.purchase, paddingData.purchase) && this.isInApp == paddingData.isInApp;
    }

    public int hashCode() {
        return (this.purchase.hashCode() * 31) + Boolean.hashCode(this.isInApp);
    }

    public String toString() {
        return "PaddingData(purchase=" + this.purchase + ", isInApp=" + this.isInApp + ")";
    }

    public PaddingData(Purchase purchase, boolean z) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        this.purchase = purchase;
        this.isInApp = z;
    }

    public /* synthetic */ PaddingData(Purchase purchase, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(purchase, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ PaddingData copy$default(PaddingData paddingData, Purchase purchase, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            purchase = paddingData.purchase;
        }
        if ((i & 2) != 0) {
            z = paddingData.isInApp;
        }
        return paddingData.copy(purchase, z);
    }

    public final Purchase getPurchase() {
        return this.purchase;
    }

    public final boolean isInApp() {
        return this.isInApp;
    }

    public final void setInApp(boolean z) {
        this.isInApp = z;
    }

    public final void setPurchase(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "<set-?>");
        this.purchase = purchase;
    }
}
