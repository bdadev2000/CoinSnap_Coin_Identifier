package com.glority.android.picturexx.handler;

import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.network.UrlNetwork;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetTrackingAPIsHandler.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u000bH\u0016R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/handler/GetTrackingAPIsHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "", "<init>", "()V", "url", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class GetTrackingAPIsHandler implements RouteHandler<List<? extends String>> {
    public static final int $stable = 0;

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<List<? extends String>> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlNetwork.INSTANCE.getURL_GET_TRACKING_APIS();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public List<? extends String> execute(RouteRequest<List<? extends String>> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return CollectionsKt.listOf((Object[]) new String[]{"user/initialise", "purchase/verify", "purchase/restore", "recognize/recognize", "config/get_abtesting_definitions"});
    }
}
