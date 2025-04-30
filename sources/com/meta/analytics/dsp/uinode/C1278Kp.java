package com.meta.analytics.dsp.uinode;

import android.app.Activity;

/* renamed from: com.facebook.ads.redexgen.X.Kp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1278Kp {
    public static final C1278Kp A04 = new C1278Kp(new C1535Um(), new C1534Ul());
    public final InterfaceC1277Ko A02;
    public final InterfaceC1293Le A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C1278Kp(InterfaceC1293Le interfaceC1293Le, InterfaceC1277Ko interfaceC1277Ko) {
        this.A03 = interfaceC1293Le;
        this.A02 = interfaceC1277Ko;
    }

    public static C1278Kp A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A50();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A7G();
        boolean z8 = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (C1278Kp.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A50() - this.A00 >= 1000) {
                z8 = false;
            }
            return z8;
        }
    }
}
