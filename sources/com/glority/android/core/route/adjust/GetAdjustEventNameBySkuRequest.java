package com.glority.android.core.route.adjust;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetAdjustEventNameBySkuRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0003\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/glority/android/core/route/adjust/GetAdjustEventNameBySkuRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", LogEventArguments.ARG_SKU, "(Ljava/lang/String;)V", "getSku", "()Ljava/lang/String;", "setSku", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GetAdjustEventNameBySkuRequest extends RouteRequest<String> {
    private String sku;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAdjustEventNameBySkuRequest(String sku) {
        super(UrlAdjust.INSTANCE.getURL_ADJUST_GET_SKU_EVENT_NAME(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.sku = sku;
    }

    public final String getSku() {
        return this.sku;
    }

    public final void setSku(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sku = str;
    }
}
