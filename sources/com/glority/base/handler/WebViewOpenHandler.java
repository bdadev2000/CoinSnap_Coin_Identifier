package com.glority.base.handler;

import android.app.Activity;
import android.content.Context;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.webview.UrlWebView;
import com.glority.android.core.route.webview.WebViewOpenRequest;
import com.glority.base.fragment.WebViewFragment;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebViewOpenHandler.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/glority/base/handler/WebViewOpenHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class WebViewOpenHandler implements RouteHandler<String> {
    public static final int $stable = 0;

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
        return UrlWebView.INSTANCE.getURL_OPEN();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof WebViewOpenRequest) {
            Context peekContext = AppContext.INSTANCE.peekContext();
            Activity activity = peekContext instanceof Activity ? (Activity) peekContext : null;
            if (activity != null) {
                WebViewFragment.Companion companion = WebViewFragment.INSTANCE;
                WebViewOpenRequest webViewOpenRequest = (WebViewOpenRequest) request;
                String webUrl = webViewOpenRequest.getWebUrl();
                String title = webViewOpenRequest.getTitle();
                String logName = webViewOpenRequest.getLogName();
                if (logName == null) {
                    logName = "";
                }
                companion.open(activity, webUrl, title, logName, webViewOpenRequest.getHeaders(), webViewOpenRequest.getCache());
            }
        }
    }
}
