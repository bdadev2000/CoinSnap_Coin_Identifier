package com.glority.abtest.utils;

import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.abtest.AbtestGetVariableDataRequest;
import com.glority.android.core.route.abtest.UrlAbtest;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbtestGetVariableDataHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/glority/abtest/utils/AbtestGetVariableDataHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class AbtestGetVariableDataHandler implements RouteHandler<String> {
    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        RouteHandler.DefaultImpls.post(this, request);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlAbtest.INSTANCE.getURL_ABTEST_VARIABLE_DATA();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String execute(RouteRequest<String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(request instanceof AbtestGetVariableDataRequest)) {
            return "";
        }
        AbtestGetVariableDataRequest abtestGetVariableDataRequest = (AbtestGetVariableDataRequest) request;
        String variableData = AbtestUtils.INSTANCE.getVariableData(abtestGetVariableDataRequest.getTest(), abtestGetVariableDataRequest.getVariable());
        return variableData != null ? variableData : "";
    }
}
