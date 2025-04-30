package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Yw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1645Yw implements C6O {
    public static byte[] A01;
    public final Map<String, C6M> A00 = new HashMap();

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-53, -58, -86, -53, -55, -64, -59, -66};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.meta.analytics.dsp.uinode.C6O
    public final synchronized String AFE() {
        StringBuilder sb;
        sb = new StringBuilder();
        Iterator<C6M> it = this.A00.values().iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A00(0, 8, 79));
        }
        return sb.toString();
    }

    @Override // com.meta.analytics.dsp.uinode.C6O
    public final synchronized void reset() {
        this.A00.clear();
    }
}
