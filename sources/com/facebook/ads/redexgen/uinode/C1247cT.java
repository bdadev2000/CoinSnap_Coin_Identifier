package com.facebook.ads.redexgen.uinode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.facebook.ads.redexgen.X.cT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1247cT {
    public final Map<DspViewableNode, C1253ca> A00 = new WeakHashMap();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized C1253ca A00(DspViewableNode dspViewableNode) {
        C1253ca c1253ca = this.A00.get(dspViewableNode);
        if (c1253ca != null) {
            return c1253ca;
        }
        return C1253ca.A08;
    }

    public final synchronized void A01(DspViewableNode dspViewableNode) {
        this.A00.remove(dspViewableNode);
    }

    public final synchronized void A02(DspViewableNode dspViewableNode, C1253ca c1253ca) {
        this.A00.put(dspViewableNode, c1253ca);
    }

    public final synchronized void A03(Collection<DspViewableNode> collection) {
        Iterator<DspViewableNode> it = this.A00.keySet().iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}
