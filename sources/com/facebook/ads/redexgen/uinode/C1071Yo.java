package com.facebook.ads.redexgen.uinode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Yo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1071Yo implements InterfaceC03796g {
    public final Map<String, Set<String>> A00 = new HashMap();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03796g
    public final synchronized boolean A8x(String str, String str2) {
        boolean z10;
        Set<String> set = this.A00.get(str2);
        if (set != null) {
            z10 = set.contains(str);
        }
        return z10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03796g
    public final synchronized void A4H(String str) {
        this.A00.remove(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03796g
    public final synchronized void AFq(String str, String str2) {
        Set<String> set = this.A00.get(str2);
        if (set == null) {
            set = new HashSet<>();
            this.A00.put(str2, set);
        }
        set.add(str);
    }
}
