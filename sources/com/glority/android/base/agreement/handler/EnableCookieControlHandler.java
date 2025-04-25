package com.glority.android.base.agreement.handler;

import com.glority.android.base.agreement.util.AgreementPersistKey;
import com.glority.android.core.init.InitGrade;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.adjust.EnableAdjustDataCollectionRequest;
import com.glority.android.core.route.agreement.EnableCookieControlRequest;
import com.glority.android.core.route.agreement.UrlAgreement;
import com.glority.android.core.route.analysis.EnableAppDataCollectionRequest;
import com.glority.android.core.route.analysis.EnableFirebaseDataCollectionRequest;
import com.glority.android.core.route.network.GetUserIdRequest;
import com.glority.android.core.utils.data.PersistData;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnableCookieControlHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/glority/android/base/agreement/handler/EnableCookieControlHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "base-agreement_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class EnableCookieControlHandler implements RouteHandler<Boolean> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (Boolean) RouteHandler.DefaultImpls.execute(this, request);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlAgreement.INSTANCE.getURL_ENABLE_COOKIE_CONTROL();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof EnableCookieControlRequest) {
            boolean enable = ((EnableCookieControlRequest) request).getEnable();
            PersistData.INSTANCE.set(AgreementPersistKey.AGREEMENT_COOKIE_CONTROL_ENABLED, Boolean.valueOf(enable));
            InitGrade.INSTANCE.isPrivacyAgreed().postValue(true);
            Long result = new GetUserIdRequest().toResult();
            new EnableFirebaseDataCollectionRequest(enable, result != null ? String.valueOf(result.longValue()) : null).post();
            new EnableAdjustDataCollectionRequest(enable).post();
            new EnableAppDataCollectionRequest(enable).post();
        }
    }
}
