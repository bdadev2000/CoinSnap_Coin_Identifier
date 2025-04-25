package com.glority.base.routers.aws;

import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.aws.UrlAws;
import com.glority.android.core.utils.data.PersistData;
import com.glority.base.storage.PersistKey;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.utils.stability.LogUtils;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetUserIdHandler.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0002\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/base/routers/aws/GetUserIdHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "(Lcom/glority/android/core/route/RouteRequest;)Ljava/lang/Long;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class GetUserIdHandler implements RouteHandler<Long> {
    public static final int $stable = 0;

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Long> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlAws.INSTANCE.getURL_GET_USER_ID();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Long execute(RouteRequest<Long> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        long j = 0;
        try {
            try {
                User value = AppViewModel.INSTANCE.getInstance().getUser().getValue();
                if (value != null) {
                    j = value.getUserId();
                }
            } catch (Exception unused) {
                User user = (User) PersistData.INSTANCE.get(PersistKey.KEY_USER);
                if (user != null) {
                    j = user.getUserId();
                }
            }
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        return Long.valueOf(j);
    }
}
