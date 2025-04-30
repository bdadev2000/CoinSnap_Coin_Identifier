package com.applovin.impl.sdk;

import com.applovin.impl.kn;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sm;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a */
    private static boolean f11150a;

    public static /* synthetic */ void a(k kVar) {
        if (f11150a) {
            return;
        }
        kVar.B().a(o.b.INTEGRATION_ERROR, "no_ads_loaded");
    }

    public static void b(k kVar) {
        Long l = (Long) kVar.a(qe.f10297H7);
        if (l.longValue() <= 0) {
            return;
        }
        kVar.l0().a(new kn(kVar, true, "submitIntegrationErrorReport", new F(8, kVar)), sm.b.OTHER, TimeUnit.SECONDS.toMillis(l.longValue()));
    }

    public static void a() {
        f11150a = true;
    }
}
