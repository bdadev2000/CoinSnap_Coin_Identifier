package com.glority.base.routers.encrypt;

import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.network.GetMd5EncryptKeyRequest;
import com.glority.android.core.route.network.UrlNetwork;
import com.glority.utils.data.EncryptUtils;
import io.reactivex.Observable;
import java.net.URL;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetMd5EncryptKeyHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH\u0016R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/glority/base/routers/encrypt/GetMd5EncryptKeyHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class GetMd5EncryptKeyHandler implements RouteHandler<String> {
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
        return UrlNetwork.INSTANCE.getURL_GET_MD5_ENCRYPT_KEY();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String execute(RouteRequest<String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(request instanceof GetMd5EncryptKeyRequest) || !Intrinsics.areEqual(((GetMd5EncryptKeyRequest) request).getHost(), new URL(AppContext.INSTANCE.getConfig("ANALYSIS_HOST")).getHost())) {
            return null;
        }
        String md5 = EncryptUtils.md5(AppContext.INSTANCE.getConfig("TRACKING_KEY"));
        Intrinsics.checkNotNullExpressionValue(md5, "md5(...)");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = md5.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
