package com.glority.android.base.agreement.handler;

import android.app.Activity;
import android.content.Context;
import com.glority.android.base.agreement.view.AgreementFragment;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.agreement.OpenAgreementPageRequest;
import com.glority.android.core.route.agreement.UrlAgreement;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenAgreementPageHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH\u0016R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/glority/android/base/agreement/handler/OpenAgreementPageHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "base-agreement_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class OpenAgreementPageHandler implements RouteHandler<String> {
    @Override // com.glority.android.core.route.RouteHandler
    public String execute(RouteRequest<String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (String) RouteHandler.DefaultImpls.execute(this, request);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlAgreement.INSTANCE.getURL_OPEN_AGREEMENT_PAGE();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof OpenAgreementPageRequest) {
            AgreementFragment.Companion companion = AgreementFragment.INSTANCE;
            Context peekContext = AppContext.INSTANCE.peekContext();
            if (!(peekContext instanceof Activity)) {
                peekContext = null;
            }
            Activity activity = (Activity) peekContext;
            if (activity != null) {
                OpenAgreementPageRequest openAgreementPageRequest = (OpenAgreementPageRequest) request;
                companion.open(activity, openAgreementPageRequest.getDisableBack(), openAgreementPageRequest.getRequestCode());
            }
        }
    }
}
