package com.glority.android.picturexx.settings.handler;

import android.app.Activity;
import android.content.Context;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.membership.UrlMembership;
import com.glority.base.routers.OpenVipSupportFragmentRequest;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactUsHandler.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/settings/handler/ContactUsHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ContactUsHandler implements RouteHandler<Object> {
    private final String url = UrlMembership.INSTANCE.getURL_CONTACT_US();

    @Override // com.glority.android.core.route.RouteHandler
    public Object execute(RouteRequest<Object> routeRequest) {
        return RouteHandler.DefaultImpls.execute(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return this.url;
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Object> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Context peekContext = AppContext.INSTANCE.peekContext();
        if ((peekContext instanceof Activity ? (Activity) peekContext : null) != null) {
            new OpenVipSupportFragmentRequest().post();
        }
    }
}
