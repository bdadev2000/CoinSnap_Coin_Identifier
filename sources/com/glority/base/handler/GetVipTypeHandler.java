package com.glority.base.handler;

import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.utils.GetVipTypeRequest;
import com.glority.android.core.route.utils.UrlUtils;
import com.glority.android.core.utils.data.PersistData;
import com.glority.base.storage.PersistKey;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetVipTypeHandler.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/glority/base/handler/GetVipTypeHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class GetVipTypeHandler implements RouteHandler<String> {
    public static final int $stable = 0;
    public static final String FREE = "free";
    public static final String TRIAL = "trial";
    public static final String VIP = "vip";

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
        return UrlUtils.INSTANCE.getURL_GET_VIP_TYPE();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String execute(RouteRequest<String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof GetVipTypeRequest) {
            if (AppViewModel.INSTANCE.isVip()) {
                VipInfo vipInfo = (VipInfo) PersistData.INSTANCE.get(PersistKey.KEY_VIP_INFO);
                if (vipInfo != null && vipInfo.getIsVip() && !vipInfo.getIsTrial()) {
                    return "vip";
                }
                return TRIAL;
            }
            return FREE;
        }
        return "";
    }
}
