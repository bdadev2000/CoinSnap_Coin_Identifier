package com.facebook.ads.redexgen.uinode;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.ads.redexgen.X.Vq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0998Vq {
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
    public final <T extends H8> long A04(T t5, H6<T> h62, int i10) {
        Looper myLooper = Looper.myLooper();
        AbstractC0626Ha.A04(myLooper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new H7(this, myLooper, t5, h62, i10, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public C0998Vq(String str) {
        this.A02 = IF.A0T(str);
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i10) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            H7<? extends H8> h72 = this.A00;
            if (h72 != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = h72.A03;
                }
                h72.A05(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void A07(H9 h92) {
        H7<? extends H8> h72 = this.A00;
        if (h72 != null) {
            h72.A07(true);
        }
        if (h92 != null) {
            this.A02.execute(new HA(h92));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
