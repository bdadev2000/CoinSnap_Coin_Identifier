package com.glority.abtest.utils;

import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.Router;
import com.glority.android.core.route.abtest.AbtestGetStringVariableRequest;
import com.glority.android.core.route.abtest.UrlAbtest;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: AbtestGetStringVariableHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/glority/abtest/utils/AbtestGetStringVariableHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "post", "", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class AbtestGetStringVariableHandler implements RouteHandler<String> {
    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlAbtest.INSTANCE.getURL_ABTEST_STRING_VARIABLE();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String execute(RouteRequest<String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(request instanceof AbtestGetStringVariableRequest)) {
            return null;
        }
        AbtestGetStringVariableRequest abtestGetStringVariableRequest = (AbtestGetStringVariableRequest) request;
        if (abtestGetStringVariableRequest.getTest() != null) {
            return AbtestUtils.INSTANCE.getStringVariableByTest(abtestGetStringVariableRequest.getTest());
        }
        return null;
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof AbtestGetStringVariableRequest) {
            if (!AbtestUtils.INSTANCE.getHadGetHttp()) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new AbtestGetStringVariableHandler$post$2(request, null), 2, null);
                return;
            }
            AbtestGetStringVariableRequest abtestGetStringVariableRequest = (AbtestGetStringVariableRequest) request;
            if (abtestGetStringVariableRequest.getTest() != null) {
                Router.onResponse(request.getId(), AbtestUtils.INSTANCE.getStringVariableByTest(abtestGetStringVariableRequest.getTest()));
            }
        }
    }
}
