package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.f1;
import com.vungle.ads.m1;
import g7.C2309c;
import java.util.concurrent.TimeUnit;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;

/* loaded from: classes3.dex */
public final class e0 {
    /* renamed from: getAvailableBidTokens$lambda-0 */
    private static final com.vungle.ads.internal.util.k m40getAvailableBidTokens$lambda0(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.util.k) interfaceC2717f.getValue();
    }

    /* renamed from: getAvailableBidTokens$lambda-1 */
    private static final com.vungle.ads.internal.executor.f m41getAvailableBidTokens$lambda1(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.executor.f) interfaceC2717f.getValue();
    }

    /* renamed from: getAvailableBidTokens$lambda-2 */
    private static final com.vungle.ads.internal.bidding.e m42getAvailableBidTokens$lambda2(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.bidding.e) interfaceC2717f.getValue();
    }

    /* renamed from: getAvailableBidTokens$lambda-3 */
    public static final String m43getAvailableBidTokens$lambda3(InterfaceC2717f interfaceC2717f) {
        G7.j.e(interfaceC2717f, "$bidTokenEncoder$delegate");
        return m42getAvailableBidTokens$lambda2(interfaceC2717f).encode();
    }

    public final String getAvailableBidTokens(Context context) {
        G7.j.e(context, "context");
        if (!m1.Companion.isInitialized()) {
            C2309c c2309c = C2309c.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            G7.j.d(applicationContext, "context.applicationContext");
            c2309c.init(applicationContext);
        }
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        EnumC2718g enumC2718g = EnumC2718g.b;
        InterfaceC2717f c9 = AbstractC2712a.c(enumC2718g, new b0(context));
        return (String) new com.vungle.ads.internal.executor.c(m41getAvailableBidTokens$lambda1(AbstractC2712a.c(enumC2718g, new c0(context))).getApiExecutor().submit(new a0(AbstractC2712a.c(enumC2718g, new d0(context)), 0))).get(m40getAvailableBidTokens$lambda0(c9).getTimeout(), TimeUnit.MILLISECONDS);
    }

    public final String getSdkVersion() {
        return "7.3.2";
    }
}
