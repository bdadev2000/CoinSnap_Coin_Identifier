package com.glority.android.adjust;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustPlayStoreSubscription;
import com.glority.android.core.data.LogEventArguments;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdjustWrapper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b¨\u0006\r"}, d2 = {"Lcom/glority/android/adjust/AdjustWrapper;", "", "()V", "trackPlayStoreSubscription", "", "price", "", FirebaseAnalytics.Param.CURRENCY, "", LogEventArguments.ARG_SKU, "orderId", "signature", "purchaseToken", "base-adjust_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AdjustWrapper {
    public static final AdjustWrapper INSTANCE = new AdjustWrapper();

    private AdjustWrapper() {
    }

    public final void trackPlayStoreSubscription(long price, String currency, String sku, String orderId, String signature, String purchaseToken) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Adjust.trackPlayStoreSubscription(new AdjustPlayStoreSubscription(price, currency, sku, orderId, signature, purchaseToken));
    }
}
