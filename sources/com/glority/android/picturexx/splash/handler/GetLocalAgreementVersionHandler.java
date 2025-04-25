package com.glority.android.picturexx.splash.handler;

import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.agreement.UrlAgreement;
import com.glority.android.core.utils.data.PersistData;
import com.glority.base.storage.PersistKey;
import com.glority.base.utils.PrivacyPolicyUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.ClientConfig;
import com.glority.component.generatedAPI.kotlinAPI.user.LegalConfig;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetLocalAgreementVersionHandler.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH\u0016¢\u0006\u0002\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/splash/handler/GetLocalAgreementVersionHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "(Lcom/glority/android/core/route/RouteRequest;)Ljava/lang/Integer;", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class GetLocalAgreementVersionHandler implements RouteHandler<Integer> {
    public static final int $stable = 0;

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Integer> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlAgreement.INSTANCE.getURL_GET_LOCAL_AGREEMENT_VERSION();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Integer execute(RouteRequest<Integer> request) {
        LegalConfig legalConfig;
        Intrinsics.checkNotNullParameter(request, "request");
        if (!Intrinsics.areEqual((Object) PrivacyPolicyUtil.INSTANCE.getHasAgreed(), (Object) true)) {
            return null;
        }
        if (AppViewModel.INSTANCE.getInstance().getClientConfig() == null && PersistData.getCompat$default(PersistData.INSTANCE, PersistKey.KEY_PRIVACY_POLICY_VERSION, null, 2, null) != null) {
            return (Integer) PersistData.getCompat$default(PersistData.INSTANCE, PersistKey.KEY_PRIVACY_POLICY_VERSION, null, 2, null);
        }
        ClientConfig clientConfig = AppViewModel.INSTANCE.getInstance().getClientConfig();
        if (clientConfig == null || (legalConfig = clientConfig.getLegalConfig()) == null) {
            return null;
        }
        return Integer.valueOf(legalConfig.getPrivacyPolicyVersion());
    }
}
