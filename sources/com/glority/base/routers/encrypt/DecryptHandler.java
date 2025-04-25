package com.glority.base.routers.encrypt;

import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.encrypt.DecryptRequest;
import com.glority.android.core.route.encrypt.UrlEncrypt;
import com.glority.encrypt.AESCrypt;
import com.glority.utils.UtilsApp;
import io.reactivex.Observable;
import java.net.URL;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DecryptHandler.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/base/routers/encrypt/DecryptHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class DecryptHandler implements RouteHandler<byte[]> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<AESCrypt> aes$delegate = LazyKt.lazy(new Function0<AESCrypt>() { // from class: com.glority.base.routers.encrypt.DecryptHandler$Companion$aes$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final AESCrypt invoke() {
            return new AESCrypt(UtilsApp.getApp());
        }
    });

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<byte[]> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlEncrypt.INSTANCE.getURL_DECRYPT();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public byte[] execute(RouteRequest<byte[]> request) {
        byte[] data;
        Intrinsics.checkNotNullParameter(request, "request");
        boolean z = request instanceof DecryptRequest;
        DecryptRequest decryptRequest = z ? (DecryptRequest) request : null;
        if (decryptRequest == null || (data = decryptRequest.getData()) == null) {
            return null;
        }
        DecryptRequest decryptRequest2 = z ? (DecryptRequest) request : null;
        if (Intrinsics.areEqual(decryptRequest2 != null ? decryptRequest2.getHost() : null, new URL(AppContext.INSTANCE.getConfig("ANALYSIS_HOST")).getHost())) {
            return INSTANCE.getAes().decrypt(data, AppContext.INSTANCE.getConfig("TRACKING_KEY"));
        }
        return INSTANCE.getAes().decrypt(data);
    }

    /* compiled from: DecryptHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/glority/base/routers/encrypt/DecryptHandler$Companion;", "", "<init>", "()V", "aes", "Lcom/glority/encrypt/AESCrypt;", "getAes", "()Lcom/glority/encrypt/AESCrypt;", "aes$delegate", "Lkotlin/Lazy;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AESCrypt getAes() {
            return (AESCrypt) DecryptHandler.aes$delegate.getValue();
        }
    }
}
