package com.glority.android.adjust.handler;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.adjust.sdk.Adjust;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.adjust.GetAdjustIdRequest;
import com.glority.android.core.route.adjust.UrlAdjust;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetAdjustIdHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/glority/android/adjust/handler/GetAdjustIdHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "base-adjust_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class GetAdjustIdHandler implements RouteHandler<String> {
    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<String> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlAdjust.INSTANCE.getURL_ADJUST_GET_ADJUST_ID();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String execute(RouteRequest<String> request) {
        String adid;
        Intrinsics.checkNotNullParameter(request, "request");
        return (!(request instanceof GetAdjustIdRequest) || (adid = Adjust.getAdid()) == null) ? "" : adid;
    }
}
