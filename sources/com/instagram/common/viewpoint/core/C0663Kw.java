package com.instagram.common.viewpoint.core;

import android.app.Activity;

/* renamed from: com.facebook.ads.redexgen.X.Kw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0663Kw {
    public static final C0663Kw A04 = new C0663Kw(new C0944Vr(), new C0943Vq());
    public final InterfaceC0662Kv A02;
    public final InterfaceC0686Lt A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C0663Kw(InterfaceC0686Lt interfaceC0686Lt, InterfaceC0662Kv interfaceC0662Kv) {
        this.A03 = interfaceC0686Lt;
        this.A02 = interfaceC0662Kv;
    }

    public static C0663Kw A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A5M();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A7e();
        boolean z2 = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (C0663Kw.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A5M() - this.A00 >= 1000) {
                z2 = false;
            }
            return z2;
        }
    }
}
