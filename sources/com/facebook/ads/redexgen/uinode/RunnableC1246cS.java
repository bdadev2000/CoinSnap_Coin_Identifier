package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1246cS implements Runnable {
    public static String[] A03 = {"dpzU5luUOUHn3PWLQSytUkpXF5uf76Gb", "OIXAlbgxv8lxL6Dw2D3vNQ6xborOE6Ab", "016lHYH9eT2TKwrcc2bnFjN8P1e", "T3DTHKpc", "xtrZuPGJxZVhMxMYehMPzz7RP9cUVZ", "GHqsJR2NBv7dmhvhUyJ2cgs96CqPd5ri", "JC4MWKMVQLy9m", "a7WpfUfSeSK3qdCMwJm40hXORQEICpVd"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1245cR A01;
    public final /* synthetic */ Exception A02;

    public RunnableC1246cS(C1245cR c1245cR, int i10, Exception exc) {
        this.A01 = c1245cR;
        this.A00 = i10;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        SU su;
        Handler handler;
        Runnable runnable;
        if (KL.A02(this)) {
            return;
        }
        try {
            try {
                z10 = this.A01.A01;
                if (z10) {
                    C1245cR c1245cR = this.A01;
                    su = c1245cR.A05;
                    c1245cR.A04(su.AAY());
                    handler = this.A01.A04;
                    runnable = this.A01.A09;
                    handler.postDelayed(runnable, this.A00);
                }
            } catch (Exception e2) {
                StackTraceElement[] innerTrace = e2.getStackTrace();
                StackTraceElement[] stackTrace = this.A02.getStackTrace();
                StackTraceElement[] callerTrace = (StackTraceElement[]) Arrays.copyOf(innerTrace, innerTrace.length + stackTrace.length);
                System.arraycopy(stackTrace, 0, callerTrace, innerTrace.length, stackTrace.length);
                e2.setStackTrace(callerTrace);
                throw e2;
            }
        } catch (Throwable th2) {
            if (A03[4].length() == 16) {
                throw new RuntimeException();
            }
            A03[3] = "b6O1Nd";
            KL.A00(th2, this);
        }
    }
}
