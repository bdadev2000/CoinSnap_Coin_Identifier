package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.a1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1054a1 implements C6R {
    public static byte[] A01;
    public static String[] A02 = {"XX81oR58WpEsQKvqY2LExbYJLqP9XswE", "az8CKzVkexBjitPsCylcg2AVWlGeK3EI", "bGZ3", "xIFKC7mmnDHSKxOkrjRNDYdlMsmKF1A7", "XScWVG1X4Mc8JZxVJlT03KGo8WKkDIiE", "ymPwCIBu7cN5wKkxYqt2Z3a", "4biB1nxlWznGwE3vHvSlKad", "lswyJVFYW7lcf"};
    public final Map<String, C6P> A00 = new HashMap();

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[6].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "T1kvqoJ1cX6i4DSx7n80qqGN8Qg91HVj";
            strArr2[3] = "zM5VtNN21yuLINvrTPslJyIzIvAVUrXA";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 74);
            i5++;
        }
    }

    public static void A01() {
        A01 = new byte[]{49, 42, 22, 49, 55, 44, 43, 34};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.instagram.common.viewpoint.core.C6R
    public final synchronized String AFi() {
        StringBuilder sb;
        sb = new StringBuilder();
        Iterator<C6P> it = this.A00.values().iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A00(0, 8, 15));
        }
        return sb.toString();
    }

    static {
        A01();
    }

    @Override // com.instagram.common.viewpoint.core.C6R
    public final synchronized void reset() {
        this.A00.clear();
    }
}
