package com.glority.android.picturexx.handler;

import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.adjust.SendTrackEventRequest;
import com.glority.android.picturexx.skumanager.SkuConfig;
import com.glority.base.routers.UrlRouter;
import com.glority.base.routers.business.PurchaseSuccessRequest;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchaseSuccessHandler.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/handler/PurchaseSuccessHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class PurchaseSuccessHandler implements RouteHandler<Object> {
    public static final int $stable = 0;
    private final String url = UrlRouter.INSTANCE.getURL_PURCHASE_SUCCESS();

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Object> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return this.url;
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Object execute(RouteRequest<Object> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        PurchaseSuccessRequest purchaseSuccessRequest = request instanceof PurchaseSuccessRequest ? (PurchaseSuccessRequest) request : null;
        String sku = purchaseSuccessRequest != null ? purchaseSuccessRequest.getSku() : null;
        String str = sku;
        if (str != null && str.length() != 0 && (Intrinsics.areEqual(sku, SkuConfig.SUB_YEARLY_1MT) || Intrinsics.areEqual(sku, SkuConfig.SUB_YEARLY_1MT_2))) {
            new SendTrackEventRequest("AJ_discount", null, null, null, 14, null).post();
        }
        return null;
    }
}
