package com.meta.analytics.dsp.uinode;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.ads.redexgen.X.Vq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1564Vq {
    public H7<? extends H8> A00;
    public IOException A01;
    public final ExecutorService A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final <T extends H8> long A04(T t9, H6<T> h6, int i9) {
        Looper myLooper = Looper.myLooper();
        AbstractC1192Ha.A04(myLooper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new H7(this, myLooper, t9, h6, i9, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public C1564Vq(String str) {
        this.A02 = IF.A0T(str);
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i9) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            H7<? extends H8> h72 = this.A00;
            if (h72 != null) {
                if (i9 == Integer.MIN_VALUE) {
                    i9 = h72.A03;
                }
                h72.A05(i9);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void A07(H9 h9) {
        H7<? extends H8> h72 = this.A00;
        if (h72 != null) {
            h72.A07(true);
        }
        if (h9 != null) {
            this.A02.execute(new HA(h9));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
