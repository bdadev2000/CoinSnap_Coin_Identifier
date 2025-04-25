package com.glority.android.guide.route;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.guide.utils.BasePurchaseUrlRouter;
import kotlin.Metadata;

/* compiled from: GetDeviceLevelRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/glority/android/guide/route/GetDeviceLevelRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "()V", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GetDeviceLevelRequest extends RouteRequest<Integer> {
    public GetDeviceLevelRequest() {
        super(BasePurchaseUrlRouter.INSTANCE.getURL_GET_DEVICE_LEVEL(), null, null, 6, null);
    }
}
