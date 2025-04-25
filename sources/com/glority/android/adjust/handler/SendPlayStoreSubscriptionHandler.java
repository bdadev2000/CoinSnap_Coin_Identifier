package com.glority.android.adjust.handler;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustPlayStoreSubscription;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.adjust.SendPlayStoreSubscriptionRequest;
import com.glority.android.core.route.adjust.UrlAdjust;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SendPlayStoreSubscriptionHandler.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/glority/android/adjust/handler/SendPlayStoreSubscriptionHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "base-adjust_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SendPlayStoreSubscriptionHandler implements RouteHandler<Boolean> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> routeRequest) {
        return (Boolean) RouteHandler.DefaultImpls.execute(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlAdjust.INSTANCE.getURL_ADJUST_SEND_SUBSCRIPTION();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof SendPlayStoreSubscriptionRequest) {
            SendPlayStoreSubscriptionRequest sendPlayStoreSubscriptionRequest = (SendPlayStoreSubscriptionRequest) request;
            AdjustPlayStoreSubscription adjustPlayStoreSubscription = new AdjustPlayStoreSubscription(sendPlayStoreSubscriptionRequest.getPrice(), sendPlayStoreSubscriptionRequest.getCurrency(), sendPlayStoreSubscriptionRequest.getSku(), sendPlayStoreSubscriptionRequest.getOrderId(), sendPlayStoreSubscriptionRequest.getSignature(), sendPlayStoreSubscriptionRequest.getPurchaseToken());
            adjustPlayStoreSubscription.setPurchaseTime(sendPlayStoreSubscriptionRequest.getPurchaseTime());
            Adjust.trackPlayStoreSubscription(adjustPlayStoreSubscription);
        }
    }
}
