package com.mbridge.msdk.d;

import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.d.a;

/* loaded from: classes4.dex */
public class b {

    /* loaded from: classes4.dex */
    public static class a {
        static b a = new b();
    }

    public static b getInstance() {
        return a.a;
    }

    public void addInterstitialList(String str, String str2) {
        try {
            a.C0163a.a.b(str, str2);
        } catch (Exception e2) {
            e.p(e2, new StringBuilder("addInterstitialList error:"), "TimerController");
        }
    }

    public void addRewardList(String str, String str2) {
        try {
            a.C0163a.a.a(str, str2);
        } catch (Exception e2) {
            e.p(e2, new StringBuilder("addRewardList error:"), "TimerController");
        }
    }

    public void start() {
        g d10 = e.d(h.a());
        if (d10 == null) {
            h.a();
            d10 = i.a();
        }
        if (d10.l() > 0) {
            a.C0163a.a.a(r0 * 1000);
        }
    }

    private b() {
    }
}
