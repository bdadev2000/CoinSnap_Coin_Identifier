package com.mbridge.msdk.d;

import com.applovin.impl.L;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.d.a;

/* loaded from: classes3.dex */
public class b {

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        static b f14907a = new b();
    }

    public static b getInstance() {
        return a.f14907a;
    }

    public void addInterstitialList(String str, String str2) {
        try {
            a.C0151a.f14906a.b(str, str2);
        } catch (Exception e4) {
            L.s(e4, new StringBuilder("addInterstitialList error:"), "TimerController");
        }
    }

    public void addRewardList(String str, String str2) {
        try {
            a.C0151a.f14906a.a(str, str2);
        } catch (Exception e4) {
            L.s(e4, new StringBuilder("addRewardList error:"), "TimerController");
        }
    }

    public void start() {
        g f9 = L.f(h.a());
        if (f9 == null) {
            h.a();
            f9 = i.a();
        }
        if (f9.l() > 0) {
            a.C0151a.f14906a.a(r0 * 1000);
        }
    }

    private b() {
    }
}
