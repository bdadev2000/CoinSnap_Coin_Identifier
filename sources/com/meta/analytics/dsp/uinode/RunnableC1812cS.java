package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1812cS implements Runnable {
    public static String[] A03 = {"dpzU5luUOUHn3PWLQSytUkpXF5uf76Gb", "OIXAlbgxv8lxL6Dw2D3vNQ6xborOE6Ab", "016lHYH9eT2TKwrcc2bnFjN8P1e", "T3DTHKpc", "xtrZuPGJxZVhMxMYehMPzz7RP9cUVZ", "GHqsJR2NBv7dmhvhUyJ2cgs96CqPd5ri", "JC4MWKMVQLy9m", "a7WpfUfSeSK3qdCMwJm40hXORQEICpVd"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1811cR A01;
    public final /* synthetic */ Exception A02;

    public RunnableC1812cS(C1811cR c1811cR, int i9, Exception exc) {
        this.A01 = c1811cR;
        this.A00 = i9;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        SU su;
        Handler handler;
        Runnable runnable;
        if (KL.A02(this)) {
            return;
        }
        try {
            try {
                z8 = this.A01.A01;
                if (z8) {
                    C1811cR c1811cR = this.A01;
                    su = c1811cR.A05;
                    c1811cR.A04(su.AAY());
                    handler = this.A01.A04;
                    runnable = this.A01.A09;
                    handler.postDelayed(runnable, this.A00);
                }
            } catch (Exception e4) {
                StackTraceElement[] innerTrace = e4.getStackTrace();
                StackTraceElement[] stackTrace = this.A02.getStackTrace();
                StackTraceElement[] callerTrace = (StackTraceElement[]) Arrays.copyOf(innerTrace, innerTrace.length + stackTrace.length);
                System.arraycopy(stackTrace, 0, callerTrace, innerTrace.length, stackTrace.length);
                e4.setStackTrace(callerTrace);
                throw e4;
            }
        } catch (Throwable th) {
            if (A03[4].length() == 16) {
                throw new RuntimeException();
            }
            A03[3] = "b6O1Nd";
            KL.A00(th, this);
        }
    }
}
