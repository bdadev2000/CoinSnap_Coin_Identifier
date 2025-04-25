package com.glority.android.picturexx.splash.handler;

import android.text.format.DateUtils;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.base.routers.UrlRouter;
import com.glority.base.utils.BillingActivityUtils;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomePurchasePageShouldShowHandler.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0002\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/splash/handler/HomePurchasePageShouldShowHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "(Lcom/glority/android/core/route/RouteRequest;)Ljava/lang/Boolean;", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class HomePurchasePageShouldShowHandler implements RouteHandler<Boolean> {
    public static final int $stable = 0;

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlRouter.INSTANCE.getURL_HOME_PURCHASE_SHOULD_SHOW();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        int i = 0;
        if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("disableConversionPageInSplash"), "true")) {
            return false;
        }
        long lastBillingOpeningTime = BillingActivityUtils.INSTANCE.getLastBillingOpeningTime();
        int billingOpenedTimesToday = BillingActivityUtils.INSTANCE.getBillingOpenedTimesToday();
        if (!DateUtils.isToday(lastBillingOpeningTime)) {
            BillingActivityUtils.INSTANCE.setBillingOpenedTimesToday(0);
        } else {
            if (billingOpenedTimesToday >= 2) {
                return false;
            }
            i = billingOpenedTimesToday;
        }
        BillingActivityUtils.INSTANCE.setLatestBillingOpeningTime(System.currentTimeMillis());
        BillingActivityUtils.INSTANCE.setBillingOpenedTimesToday(i + 1);
        return true;
    }
}
