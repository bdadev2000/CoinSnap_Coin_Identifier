package com.glority.android.core.route.guide;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BillingUIIsCanadaRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/android/core/route/guide/BillingUIIsCanadaRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", LogEventArguments.ARG_SKU, "", "context", "Landroid/content/Context;", "(Ljava/lang/String;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getSku", "()Ljava/lang/String;", "setSku", "(Ljava/lang/String;)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class BillingUIIsCanadaRequest extends RouteRequest<Boolean> {
    private final Context context;
    private String sku;

    public BillingUIIsCanadaRequest(String str, Context context) {
        super(UrlGuide.INSTANCE.getURL_IS_CANADA_GOOGLE_ACCOUNT(), context, null, 4, null);
        this.sku = str;
        this.context = context;
        this.sku = BillingSkuDealUtils.INSTANCE.getSku(this.sku);
    }

    public /* synthetic */ BillingUIIsCanadaRequest(String str, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : context);
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getSku() {
        return this.sku;
    }

    public final void setSku(String str) {
        this.sku = str;
    }
}
