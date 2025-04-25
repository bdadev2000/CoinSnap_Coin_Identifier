package com.glority.abtest.utils;

import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.abtest.AbtestGetLoginUiMemoRequest;
import com.glority.android.core.route.abtest.UrlAbtest;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbtestGetLoginUiMemoHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH\u0016¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/glority/abtest/utils/AbtestGetLoginUiMemoHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "(Lcom/glority/android/core/route/RouteRequest;)Ljava/lang/Integer;", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class AbtestGetLoginUiMemoHandler implements RouteHandler<Integer> {
    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Integer> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        RouteHandler.DefaultImpls.post(this, request);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlAbtest.INSTANCE.getURL_ABTEST_LOGIN_UI_MEMO();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Integer execute(RouteRequest<Integer> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof AbtestGetLoginUiMemoRequest) {
            return AbtestUtils.INSTANCE.getLoginUiMemo(((AbtestGetLoginUiMemoRequest) request).getPageType());
        }
        return null;
    }
}
