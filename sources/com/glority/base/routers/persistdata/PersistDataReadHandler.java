package com.glority.base.routers.persistdata;

import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.utils.PersistDataReadRequest;
import com.glority.android.core.route.utils.UrlUtils;
import com.glority.android.core.utils.data.PersistData;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersistDataReadHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH\u0016R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/glority/base/routers/persistdata/PersistDataReadHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class PersistDataReadHandler implements RouteHandler<String> {
    public static final int $stable = 0;

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<String> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlUtils.INSTANCE.getURL_PERSIST_DATA_READ();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String execute(RouteRequest<String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(request instanceof PersistDataReadRequest)) {
            return "";
        }
        PersistDataReadRequest persistDataReadRequest = (PersistDataReadRequest) request;
        if (persistDataReadRequest.getKey() == null) {
            return "";
        }
        PersistData persistData = PersistData.INSTANCE;
        String key = persistDataReadRequest.getKey();
        Intrinsics.checkNotNull(key);
        String str = (String) persistData.get(key);
        return str == null ? "" : str;
    }
}
