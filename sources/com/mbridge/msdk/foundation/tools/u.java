package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f16078a;

    public static synchronized ConnectivityManager a() {
        ConnectivityManager connectivityManager;
        synchronized (u.class) {
            try {
                if (f16078a == null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                    f16078a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.m().c().getSystemService("connectivity");
                }
            } catch (Exception e4) {
                ad.b("NetManager", e4.getMessage());
            }
            connectivityManager = f16078a;
        }
        return connectivityManager;
    }
}
