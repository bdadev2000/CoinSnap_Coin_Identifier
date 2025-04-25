package com.glority.abtest;

import com.glority.abtest.utils.ABTesting;
import com.glority.abtest.utils.AbtestUtils;
import com.glority.abtesting.generatedAPI.kotlinAPI.config.GetAbtestingDefinitionsMessage;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.abtest.AbtestInitRequest;
import com.glority.android.core.route.abtest.UrlAbtest;
import com.glority.android.core.route.utils.PersistDataReadRequest;
import com.glority.android.core.route.utils.PersistDataWriteRequest;
import com.glority.android.core.utils.device.CorePersistKey;
import com.glority.utils.stability.LogUtils;
import com.google.gson.Gson;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: AbtestInitHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/glority/abtest/AbtestInitHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class AbtestInitHandler implements RouteHandler<Boolean> {
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
        return UrlAbtest.INSTANCE.getURL_ABTEST_INIT();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof AbtestInitRequest) {
            try {
                String result = new PersistDataReadRequest(CorePersistKey.ABTESTING_DEFINITIONS).toResult();
                String str = result;
                if ((str == null || str.length() == 0) && (result = AbtestUtils.INSTANCE.assetFile2Str(AppContext.INSTANCE.peekContext(), ABTesting.ABTESTING_CONFIG_LOCAL)) != null) {
                    new PersistDataWriteRequest(CorePersistKey.ABTESTING_DEFINITIONS, result).post();
                }
                AbtestUtils.INSTANCE.setAbtestingDefinitionsMessage((GetAbtestingDefinitionsMessage) new Gson().fromJson(result, GetAbtestingDefinitionsMessage.class));
            } catch (Exception e) {
                LogUtils.e("read abtest configs err =  " + e);
            }
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new AbtestInitHandler$post$1(null), 2, null);
        }
    }
}
