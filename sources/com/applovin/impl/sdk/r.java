package com.applovin.impl.sdk;

import com.applovin.impl.kn;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sm;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class r {
    private static boolean a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(k kVar) {
        if (a) {
            return;
        }
        kVar.B().a(o.b.INTEGRATION_ERROR, "no_ads_loaded");
    }

    public static void b(k kVar) {
        Long l10 = (Long) kVar.a(qe.H7);
        if (l10.longValue() <= 0) {
            return;
        }
        kVar.l0().a(new kn(kVar, true, "submitIntegrationErrorReport", new f0(8, kVar)), sm.b.OTHER, TimeUnit.SECONDS.toMillis(l10.longValue()));
    }

    public static void a() {
        a = true;
    }
}
