package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* loaded from: classes4.dex */
public final class u {
    private static ConnectivityManager a;

    public static synchronized ConnectivityManager a() {
        ConnectivityManager connectivityManager;
        synchronized (u.class) {
            try {
                if (a == null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                    a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.m().c().getSystemService("connectivity");
                }
            } catch (Exception e2) {
                ad.b("NetManager", e2.getMessage());
            }
            connectivityManager = a;
        }
        return connectivityManager;
    }
}
