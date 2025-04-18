package com.facebook.ads.redexgen.uinode;

import android.app.Activity;

/* renamed from: com.facebook.ads.redexgen.X.Kp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0712Kp {
    public static final C0712Kp A04 = new C0712Kp(new C0969Um(), new C0968Ul());
    public final InterfaceC0711Ko A02;
    public final InterfaceC0727Le A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C0712Kp(InterfaceC0727Le interfaceC0727Le, InterfaceC0711Ko interfaceC0711Ko) {
        this.A03 = interfaceC0727Le;
        this.A02 = interfaceC0711Ko;
    }

    public static C0712Kp A00() {
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
        boolean z10 = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (C0712Kp.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A50() - this.A00 >= 1000) {
                z10 = false;
            }
            return z10;
        }
    }
}
