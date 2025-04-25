package com.glority.base.handler;

import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.agreement.UrlAgreement;
import com.glority.base.utils.PrivacyPolicyUtil;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsAgreedAgreementHandler.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH\u0016¢\u0006\u0002\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/base/handler/IsAgreedAgreementHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "(Lcom/glority/android/core/route/RouteRequest;)Ljava/lang/Boolean;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class IsAgreedAgreementHandler implements RouteHandler<Boolean> {
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
        return UrlAgreement.INSTANCE.getURL_IS_AGREED_AGREEMENT();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Boolean hasAgreed = PrivacyPolicyUtil.INSTANCE.getHasAgreed();
        return Boolean.valueOf(hasAgreed != null ? hasAgreed.booleanValue() : false);
    }
}
