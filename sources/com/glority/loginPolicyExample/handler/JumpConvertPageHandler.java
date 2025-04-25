package com.glority.loginPolicyExample.handler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.loginUi.JumpConvertPageRequest;
import com.glority.android.core.route.loginUi.UrlLoginUi;
import com.glority.android.picturexx.splash.MainActivity;
import com.glority.android.picturexx.splash.logevents.SplashLogEvents;
import com.glority.base.presenter.ILogEvent;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JumpConvertPageHandler.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/glority/loginPolicyExample/handler/JumpConvertPageHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "Lcom/glority/base/presenter/ILogEvent;", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class JumpConvertPageHandler implements RouteHandler<Boolean>, ILogEvent {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> routeRequest) {
        return (Boolean) RouteHandler.DefaultImpls.execute(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.base.presenter.ILogEvent
    public void logEvent(String str, Bundle bundle) {
        ILogEvent.DefaultImpls.logEvent(this, str, bundle);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlLoginUi.INSTANCE.getURL_JUMP_CONVERT();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof JumpConvertPageRequest) {
            ILogEvent.DefaultImpls.logEvent$default(this, SplashLogEvents.LOGIN_POLICY_PAGE_CLOSE, null, 2, null);
            Context peekContext = AppContext.INSTANCE.peekContext();
            Intent intent = new Intent(peekContext, (Class<?>) MainActivity.class);
            intent.putExtra(MainActivity.EXTRA_FROM_LOGIN_POLICY, true);
            peekContext.startActivity(intent);
            if (peekContext instanceof Activity) {
                ((Activity) peekContext).finish();
            }
        }
    }
}
