package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.e3;
import com.vungle.ads.l3;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c1 {
    public static /* synthetic */ String a(Lazy lazy) {
        return m18getAvailableBidTokens$lambda3(lazy);
    }

    /* renamed from: getAvailableBidTokens$lambda-0 */
    private static final com.vungle.ads.internal.util.k m15getAvailableBidTokens$lambda0(Lazy<com.vungle.ads.internal.util.k> lazy) {
        return lazy.getValue();
    }

    /* renamed from: getAvailableBidTokens$lambda-1 */
    private static final com.vungle.ads.internal.executor.f m16getAvailableBidTokens$lambda1(Lazy<com.vungle.ads.internal.executor.f> lazy) {
        return lazy.getValue();
    }

    /* renamed from: getAvailableBidTokens$lambda-2 */
    private static final com.vungle.ads.internal.bidding.e m17getAvailableBidTokens$lambda2(Lazy<com.vungle.ads.internal.bidding.e> lazy) {
        return lazy.getValue();
    }

    /* renamed from: getAvailableBidTokens$lambda-3 */
    public static final String m18getAvailableBidTokens$lambda3(Lazy bidTokenEncoder$delegate) {
        Intrinsics.checkNotNullParameter(bidTokenEncoder$delegate, "$bidTokenEncoder$delegate");
        return m17getAvailableBidTokens$lambda2(bidTokenEncoder$delegate).encode();
    }

    public final String getAvailableBidTokens(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!l3.Companion.isInitialized()) {
            fh.c cVar = fh.c.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            cVar.init(applicationContext);
        }
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new z0(context));
        return (String) new com.vungle.ads.internal.executor.c(m16getAvailableBidTokens$lambda1(LazyKt.lazy(lazyThreadSafetyMode, (Function0) new a1(context))).getApiExecutor().submit(new com.facebook.w(LazyKt.lazy(lazyThreadSafetyMode, (Function0) new b1(context)), 5))).get(m15getAvailableBidTokens$lambda0(lazy).getTimeout(), TimeUnit.MILLISECONDS);
    }

    public final String getSdkVersion() {
        return "7.3.2";
    }
}
