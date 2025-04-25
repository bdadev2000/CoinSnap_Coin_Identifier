package com.glority.android.core.route.guide;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BillingUIGetCurrencyCodeRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/glority/android/core/route/guide/BillingUIGetCurrencyCodeRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", LogEventArguments.ARG_SKU, "context", "Landroid/content/Context;", "(Ljava/lang/String;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getSku", "()Ljava/lang/String;", "setSku", "(Ljava/lang/String;)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class BillingUIGetCurrencyCodeRequest extends RouteRequest<String> {
    private Context context;
    private String sku;

    public BillingUIGetCurrencyCodeRequest(String str, Context context) {
        super(UrlGuide.INSTANCE.getURL_CURRENCY_SYMBOL(), context, null, 4, null);
        this.sku = str;
        this.context = context;
        this.sku = BillingSkuDealUtils.INSTANCE.getSku(this.sku);
    }

    public /* synthetic */ BillingUIGetCurrencyCodeRequest(String str, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : context);
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getSku() {
        return this.sku;
    }

    public final void setContext(Context context) {
        this.context = context;
    }

    public final void setSku(String str) {
        this.sku = str;
    }
}
