package com.meta.analytics.dsp.uinode;

import android.os.ConditionVariable;

/* loaded from: assets/audience_network.dex */
public class HX extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C1554Vg A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HX(C1554Vg c1554Vg, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c1554Vg;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
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
            KL.A00(th2, this);
        }
    }
}
