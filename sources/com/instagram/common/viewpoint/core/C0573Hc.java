package com.instagram.common.viewpoint.core;

import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.Hc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0573Hc extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C0963Wl A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0573Hc(C0963Wl c0963Wl, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c0963Wl;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                try {
                    this.A00.open();
                    this.A01.A04();
                } finally {
                    th = th;
                    while (true) {
                        try {
                            break;
                        } catch (Throwable th) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
