package com.meta.analytics.dsp.uinode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.facebook.ads.redexgen.X.cT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1813cT {
    public final Map<DspViewableNode, C1819ca> A00 = new WeakHashMap();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized C1819ca A00(DspViewableNode dspViewableNode) {
        C1819ca c1819ca = this.A00.get(dspViewableNode);
        if (c1819ca != null) {
            return c1819ca;
        }
        return C1819ca.A08;
    }

    public final synchronized void A01(DspViewableNode dspViewableNode) {
        this.A00.remove(dspViewableNode);
    }

    public final synchronized void A02(DspViewableNode dspViewableNode, C1819ca c1819ca) {
        this.A00.put(dspViewableNode, c1819ca);
    }

    public final synchronized void A03(Collection<DspViewableNode> collection) {
        Iterator<DspViewableNode> it = this.A00.keySet().iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}
