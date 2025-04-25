package com.glority.android.core.route.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;

/* compiled from: GetUserTypeRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/glority/android/core/route/network/GetUserTypeRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "()V", "Companion", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GetUserTypeRequest extends RouteRequest<Integer> {
    public static final int USER_TYPE_FREE = 1;
    public static final int USER_TYPE_TRIAL = 2;
    public static final int USER_TYPE_UNKNOWN = 0;
    public static final int USER_TYPE_VIP = 3;

    public GetUserTypeRequest() {
        super(UrlNetwork.INSTANCE.getURL_GET_USER_TYPE(), null, null, 6, null);
    }
}
