package com.applovin.impl;

import com.applovin.impl.tm;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class pb {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f26002a;

    public static void a() {
        f26002a = true;
    }

    public static void b(com.applovin.impl.sdk.j jVar) {
        Long l2 = (Long) jVar.a(ve.S7);
        if (l2.longValue() <= 0) {
            return;
        }
        jVar.j0().a(new jn(jVar, true, "submitIntegrationErrorReport", new pu(0, jVar)), tm.b.OTHER, TimeUnit.SECONDS.toMillis(l2.longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.j jVar) {
        if (f26002a) {
            return;
        }
        jVar.E().a(la.L, "no_ads_loaded");
    }
}
