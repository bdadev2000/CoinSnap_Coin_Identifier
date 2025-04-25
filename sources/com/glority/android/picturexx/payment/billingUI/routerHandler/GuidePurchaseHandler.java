package com.glority.android.picturexx.payment.billingUI.routerHandler;

import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.core.route.guide.UrlGuide;
import com.glority.android.picturexx.payment.billingUI.BillingGuideUtils;
import com.glority.android.picturexx.payment.skumanager.SkuManager;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GuidePurchaseHandler.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/payment/billingUI/routerHandler/GuidePurchaseHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class GuidePurchaseHandler implements RouteHandler<String> {
    @Override // com.glority.android.core.route.RouteHandler
    public String execute(RouteRequest<String> routeRequest) {
        return (String) RouteHandler.DefaultImpls.execute(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlGuide.INSTANCE.getURL_PURCHASE();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof GuidePurchaseRequest) {
            SkuManager skuManager = SkuManager.INSTANCE;
            GuidePurchaseRequest guidePurchaseRequest = (GuidePurchaseRequest) request;
            String sku = guidePurchaseRequest.getSku();
            if (sku == null) {
                return;
            }
            BillingGuideUtils.startPurchase$default(BillingGuideUtils.INSTANCE, skuManager.getFinalSku(sku), 0, guidePurchaseRequest.getShowDetain(), guidePurchaseRequest.getNotifyOpened(), 2, null);
        }
    }
}
