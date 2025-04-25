package com.glority.abtest.utils;

import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.Router;
import com.glority.android.core.route.abtest.AbtestGetVariableRequest;
import com.glority.android.core.route.abtest.UrlAbtest;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: AbtestGetVariableHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/glority/abtest/utils/AbtestGetVariableHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "(Lcom/glority/android/core/route/RouteRequest;)Ljava/lang/Integer;", "post", "", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class AbtestGetVariableHandler implements RouteHandler<Integer> {
    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlAbtest.INSTANCE.getURL_ABTEST_VARIABLE();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Integer execute(RouteRequest<Integer> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof AbtestGetVariableRequest) {
            AbtestGetVariableRequest abtestGetVariableRequest = (AbtestGetVariableRequest) request;
            if (abtestGetVariableRequest.getTest() != null) {
                return AbtestUtils.getVariableByTest$default(AbtestUtils.INSTANCE, abtestGetVariableRequest.getTest(), false, 2, null);
            }
        }
        return null;
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Integer> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof AbtestGetVariableRequest) {
            if (AbtestUtils.INSTANCE.getHadGetHttp()) {
                AbtestGetVariableRequest abtestGetVariableRequest = (AbtestGetVariableRequest) request;
                if (abtestGetVariableRequest.getTest() != null) {
                    Router.onResponse(request.getId(), AbtestUtils.getVariableByTest$default(AbtestUtils.INSTANCE, abtestGetVariableRequest.getTest(), false, 2, null));
                    return;
                }
            }
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new AbtestGetVariableHandler$post$2(request, null), 2, null);
        }
    }
}
