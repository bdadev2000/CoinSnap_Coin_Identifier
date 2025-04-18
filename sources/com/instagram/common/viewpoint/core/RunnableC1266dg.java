package com.instagram.common.viewpoint.core;

import android.os.Handler;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1266dg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1265df A01;
    public final /* synthetic */ Exception A02;

    public RunnableC1266dg(C1265df c1265df, int i2, Exception exc) {
        this.A01 = c1265df;
        this.A00 = i2;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        T0 t02;
        Handler handler;
        Runnable runnable;
        if (KQ.A02(this)) {
            return;
        }
        try {
            try {
                z2 = this.A01.A01;
                if (z2) {
                    C1265df c1265df = this.A01;
                    t02 = this.A01.A05;
                    c1265df.A04(t02.AAy());
                    handler = this.A01.A04;
                    runnable = this.A01.A0A;
                    handler.postDelayed(runnable, this.A00);
                }
            } catch (Exception e) {
                StackTraceElement[] innerTrace = e.getStackTrace();
                StackTraceElement[] result = this.A02.getStackTrace();
                StackTraceElement[] callerTrace = (StackTraceElement[]) Arrays.copyOf(innerTrace, innerTrace.length + result.length);
                System.arraycopy(result, 0, callerTrace, innerTrace.length, result.length);
                e.setStackTrace(callerTrace);
                throw e;
            }
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
