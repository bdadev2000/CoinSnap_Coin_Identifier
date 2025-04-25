package com.glority.android.core.route.guide;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GuidePurchaseWithoutDetainRequest.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0012B'\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/glority/android/core/route/guide/GuidePurchaseWithoutDetainRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", LogEventArguments.ARG_SKU, "context", "Landroid/content/Context;", "type", "", "(Ljava/lang/String;Landroid/content/Context;I)V", "(Ljava/lang/String;Landroid/content/Context;)V", "getSku", "()Ljava/lang/String;", "setSku", "(Ljava/lang/String;)V", "getType", "()I", "setType", "(I)V", "ProrationMode", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GuidePurchaseWithoutDetainRequest extends RouteRequest<String> {
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

    public /* synthetic */ GuidePurchaseWithoutDetainRequest(String str, Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : context, (i2 & 4) != 0 ? ProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE.getValue() : i);
    }

    public GuidePurchaseWithoutDetainRequest(String str, Context context, int i) {
        super(UrlGuide.INSTANCE.getURL_PURCHASE_WITHOUT_DETAIN(), context, null, 4, null);
        this.type = ProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE.getValue();
        this.sku = BillingSkuDealUtils.INSTANCE.getSku(str);
        this.type = i;
    }

    public /* synthetic */ GuidePurchaseWithoutDetainRequest(String str, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : context);
    }

    public GuidePurchaseWithoutDetainRequest(String str, Context context) {
        super(UrlGuide.INSTANCE.getURL_PURCHASE_WITHOUT_DETAIN(), context, null, 4, null);
        this.type = ProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE.getValue();
        this.sku = BillingSkuDealUtils.INSTANCE.getSku(str);
    }

    /* compiled from: GuidePurchaseWithoutDetainRequest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/core/route/guide/GuidePurchaseWithoutDetainRequest$ProrationMode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY", "IMMEDIATE_WITH_TIME_PRORATION", "IMMEDIATE_AND_CHARGE_PRORATED_PRICE", "IMMEDIATE_WITHOUT_PRORATION", "DEFERRED", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
