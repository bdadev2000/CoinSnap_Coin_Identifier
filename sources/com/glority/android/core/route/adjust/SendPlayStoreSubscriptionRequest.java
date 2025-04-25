package com.glority.android.core.route.adjust;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SendPlayStoreSubscriptionRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0002\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/glority/android/core/route/adjust/SendPlayStoreSubscriptionRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "price", "", FirebaseAnalytics.Param.CURRENCY, "", LogEventArguments.ARG_SKU, "orderId", "signature", "purchaseToken", "purchaseTime", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getOrderId", "setOrderId", "getPrice", "()J", "setPrice", "(J)V", "getPurchaseTime", "setPurchaseTime", "getPurchaseToken", "setPurchaseToken", "getSignature", "setSignature", "getSku", "setSku", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class SendPlayStoreSubscriptionRequest extends RouteRequest<Boolean> {
    private String currency;
    private String orderId;
    private long price;
    private long purchaseTime;
    private String purchaseToken;
    private String signature;
    private String sku;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendPlayStoreSubscriptionRequest(long j, String currency, String sku, String orderId, String signature, String purchaseToken, long j2) {
        super(UrlAdjust.INSTANCE.getURL_ADJUST_SEND_SUBSCRIPTION(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        this.price = j;
        this.currency = currency;
        this.sku = sku;
        this.orderId = orderId;
        this.signature = signature;
        this.purchaseToken = purchaseToken;
        this.purchaseTime = j2;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final long getPrice() {
        return this.price;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getSku() {
        return this.sku;
    }

    public final void setCurrency(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currency = str;
    }

    public final void setOrderId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderId = str;
    }

    public final void setPrice(long j) {
        this.price = j;
    }

    public final void setPurchaseTime(long j) {
        this.purchaseTime = j;
    }

    public final void setPurchaseToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purchaseToken = str;
    }

    public final void setSignature(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.signature = str;
    }

    public final void setSku(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sku = str;
    }
}
