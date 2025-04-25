package com.glority.android.core.route.billing;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetInAppSkuListRequest.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/glority/android/core/route/billing/GetInAppSkuListRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "", "()V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GetInAppSkuListRequest extends RouteRequest<List<? extends String>> {
    public GetInAppSkuListRequest() {
        super(UrlBilling.INSTANCE.getURL_GET_IN_APP_SKU_LIST(), null, null, 6, null);
    }
}
