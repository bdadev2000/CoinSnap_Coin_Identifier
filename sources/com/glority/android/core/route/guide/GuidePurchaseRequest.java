package com.glority.android.core.route.guide;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GuidePurchaseRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001$B'\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB?\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\fBG\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/glority/android/core/route/guide/GuidePurchaseRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", LogEventArguments.ARG_SKU, "context", "Landroid/content/Context;", "type", "", "(Ljava/lang/String;Landroid/content/Context;I)V", "notifyOpened", "", "currentPurchasePageId", "(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Boolean;Ljava/lang/String;I)V", "showDetain", "(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Landroid/content/Context;I)V", "(Ljava/lang/String;Landroid/content/Context;)V", "currentSubPageId", "getCurrentSubPageId", "()Ljava/lang/String;", "setCurrentSubPageId", "(Ljava/lang/String;)V", "getNotifyOpened", "()Ljava/lang/Boolean;", "setNotifyOpened", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getShowDetain", "()Z", "setShowDetain", "(Z)V", "getSku", "setSku", "getType", "()I", "setType", "(I)V", "ProrationMode", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GuidePurchaseRequest extends RouteRequest<String> {
    private String currentSubPageId;
    private Boolean notifyOpened;
    private boolean showDetain;
    private String sku;
    private int type;

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final String getSku() {
        return this.sku;
    }

    public final void setSku(String str) {
        this.sku = str;
    }

    public final Boolean getNotifyOpened() {
        return this.notifyOpened;
    }

    public final void setNotifyOpened(Boolean bool) {
        this.notifyOpened = bool;
    }

    public final String getCurrentSubPageId() {
        return this.currentSubPageId;
    }

    public final void setCurrentSubPageId(String str) {
        this.currentSubPageId = str;
    }

    public final boolean getShowDetain() {
        return this.showDetain;
    }

    public final void setShowDetain(boolean z) {
        this.showDetain = z;
    }

    public /* synthetic */ GuidePurchaseRequest(String str, Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : context, (i2 & 4) != 0 ? ProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE.getValue() : i);
    }

    public GuidePurchaseRequest(String str, Context context, int i) {
        super(UrlGuide.INSTANCE.getURL_PURCHASE(), context, null, 4, null);
        this.type = ProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE.getValue();
        this.showDetain = true;
        this.sku = BillingSkuDealUtils.INSTANCE.getSku(str);
        this.type = i;
    }

    public /* synthetic */ GuidePurchaseRequest(String str, Context context, Boolean bool, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : context, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? ProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE.getValue() : i);
    }

    public GuidePurchaseRequest(String str, Context context, Boolean bool, String str2, int i) {
        super(UrlGuide.INSTANCE.getURL_PURCHASE(), context, null, 4, null);
        this.type = ProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE.getValue();
        this.showDetain = true;
        this.sku = BillingSkuDealUtils.INSTANCE.getSku(str);
        this.type = i;
        this.notifyOpened = bool;
        this.currentSubPageId = str2;
    }

    public /* synthetic */ GuidePurchaseRequest(String str, boolean z, Boolean bool, String str2, Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : context, (i2 & 32) != 0 ? ProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE.getValue() : i);
    }

    public GuidePurchaseRequest(String str, boolean z, Boolean bool, String str2, Context context, int i) {
        super(UrlGuide.INSTANCE.getURL_PURCHASE(), context, null, 4, null);
        this.type = ProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE.getValue();
        this.showDetain = true;
        this.sku = BillingSkuDealUtils.INSTANCE.getSku(str);
        this.type = i;
        this.showDetain = z;
        this.notifyOpened = bool;
        this.currentSubPageId = str2;
    }

    public /* synthetic */ GuidePurchaseRequest(String str, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : context);
    }

    public GuidePurchaseRequest(String str, Context context) {
        super(UrlGuide.INSTANCE.getURL_PURCHASE(), context, null, 4, null);
        this.type = ProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE.getValue();
        this.showDetain = true;
        this.sku = BillingSkuDealUtils.INSTANCE.getSku(str);
    }

    /* compiled from: GuidePurchaseRequest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/core/route/guide/GuidePurchaseRequest$ProrationMode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY", "IMMEDIATE_WITH_TIME_PRORATION", "IMMEDIATE_AND_CHARGE_PRORATED_PRICE", "IMMEDIATE_WITHOUT_PRORATION", "DEFERRED", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public enum ProrationMode {
        UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY(0),
        IMMEDIATE_WITH_TIME_PRORATION(1),
        IMMEDIATE_AND_CHARGE_PRORATED_PRICE(2),
        IMMEDIATE_WITHOUT_PRORATION(3),
        DEFERRED(4);

        private final int value;

        ProrationMode(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }
}
