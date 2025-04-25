package com.glority.android.core.route.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetTrackingAPIsRequest.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/glority/android/core/route/network/GetTrackingAPIsRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "", "()V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GetTrackingAPIsRequest extends RouteRequest<List<? extends String>> {
    public GetTrackingAPIsRequest() {
        super(UrlNetwork.INSTANCE.getURL_GET_TRACKING_APIS(), null, null, 6, null);
    }
}
