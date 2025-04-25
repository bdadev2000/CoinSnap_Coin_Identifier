package com.glority.android.base.agreement.handler;

import android.app.Activity;
import android.content.Context;
import com.glority.android.base.agreement.view.SubscriptionTermsFragment;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.agreement.OpenSubscriptionTermsPageRequest;
import com.glority.android.core.route.agreement.UrlAgreement;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenSubscriptionTermsPageHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/glority/android/base/agreement/handler/OpenSubscriptionTermsPageHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "base-agreement_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class OpenSubscriptionTermsPageHandler implements RouteHandler<Object> {
    @Override // com.glority.android.core.route.RouteHandler
    public Object execute(RouteRequest<Object> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return RouteHandler.DefaultImpls.execute(this, request);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlAgreement.INSTANCE.getURL_OPEN_SUBSCRIPTION_TERMS_PAGE();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Object> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof OpenSubscriptionTermsPageRequest) {
            SubscriptionTermsFragment.Companion companion = SubscriptionTermsFragment.INSTANCE;
            Context peekContext = AppContext.INSTANCE.peekContext();
            if (!(peekContext instanceof Activity)) {
                peekContext = null;
            }
            Activity activity = (Activity) peekContext;
            if (activity != null) {
                String urlPath = ((OpenSubscriptionTermsPageRequest) request).getUrlPath();
                if (urlPath == null) {
                    urlPath = "";
                }
                companion.open(activity, urlPath);
            }
        }
    }
}
