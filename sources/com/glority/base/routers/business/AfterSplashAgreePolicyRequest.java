package com.glority.base.routers.business;

import android.content.Context;
import com.glority.android.core.route.RouteRequest;
import com.glority.base.routers.UrlRouter;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AfterSplashAgreePolicyRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/base/routers/business/AfterSplashAgreePolicyRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.METHOD, "Lkotlin/Function0;", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "getContext", "()Landroid/content/Context;", "getMethod", "()Lkotlin/jvm/functions/Function0;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class AfterSplashAgreePolicyRequest extends RouteRequest<Object> {
    public static final int $stable = 8;
    private final Context context;
    private final Function0<Unit> method;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterSplashAgreePolicyRequest(Context context, Function0<Unit> method) {
        super(UrlRouter.INSTANCE.getURL_AFTER_SPLASH_AGREE_POLICY(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(method, "method");
        this.context = context;
        this.method = method;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Function0<Unit> getMethod() {
        return this.method;
    }
}
