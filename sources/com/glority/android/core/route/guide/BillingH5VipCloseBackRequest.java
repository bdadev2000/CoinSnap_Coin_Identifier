package com.glority.android.core.route.guide;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingH5VipCloseBackRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/glority/android/core/route/guide/BillingH5VipCloseBackRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "h5Url", "(Ljava/lang/String;)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class BillingH5VipCloseBackRequest extends RouteRequest<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingH5VipCloseBackRequest(String h5Url) {
        super(UrlGuide.INSTANCE.getURL_BILLING_H5_VIP_CLOSE_BACK(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(h5Url, "h5Url");
    }
}
