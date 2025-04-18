package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0465Ch {
    public static byte[] A00;
    public static String[] A01 = {"LDHS3H9YnUh7C7BCkh", "wC9e9nnwReFs9ZTI4bgFhMBKq7UfutKa", "dOVlFJvoAdJbJQKRw8v4NRbH1WbgG8Lt", "DZWYNPZ", "BS0YbHQAO0VU4qHMbgdjqGwsVP1Lt8hI", "pFDu33085QdGuzrGUL", "zTHWwR6874BSc50B06ceZtd8OhPobwtD", "iUZAADc"};
    public static final int[] A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{118, 34, 119, 36, 1, 85, 0, 80, 31, 75, 73, 26, 33, 117, 117, 36, 115, 39, 48, 16, 68, 81, 21, 31, 75, 95, 26, 21, 108, 25, 120, 69, 60, 94, 40, 123, 2, 96, 102, 122, 100, 121, 97, 49, 38, 51, 97, 17, 67, 1, 87, 108, 97, 114, 53, 58, 36, 49, 99, 102, 124, 96, 61, 75, 81, 77, 17, 66, 88, 68, 31, 73, 83, 79, 21, 100, 126, 98, 59, 31, 5, 25, 27, 20, 27, 27, 22, 91, 70, 2, 7, 22, 11, 79, 73, 88, 93, 9, 9};
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e8, code lost:
    
        if (r14 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ec, code lost:
    
        if (r17 != r11) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ee, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0062, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(com.instagram.common.viewpoint.core.InterfaceC0456By r16, boolean r17) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AbstractC0465Ch.A05(com.facebook.ads.redexgen.X.By, boolean):boolean");
    }

    static {
        A01();
        A02 = new int[]{IK.A08(A00(79, 4, 41)), IK.A08(A00(59, 4, 80)), IK.A08(A00(63, 4, Opcodes.LUSHR)), IK.A08(A00(67, 4, 116)), IK.A08(A00(71, 4, 127)), IK.A08(A00(75, 4, 82)), IK.A08(A00(43, 4, 15)), IK.A08(A00(55, 4, 13)), IK.A08(A00(51, 4, 91)), IK.A08(A00(87, 4, 105)), IK.A08(A00(91, 4, 36)), IK.A08(A00(0, 4, 26)), IK.A08(A00(4, 4, 109)), IK.A08(A00(19, 4, 124)), IK.A08(A00(23, 4, Opcodes.DREM)), IK.A08(A00(8, 4, Opcodes.DREM)), IK.A08(A00(12, 4, 77)), IK.A08(A00(31, 4, 87)), IK.A08(A00(27, 4, 7)), IK.A08(A00(47, 4, 40)), IK.A08(A00(83, 4, 32)), IK.A08(A00(35, 4, 105)), IK.A08(A00(95, 4, Opcodes.FNEG)), IK.A08(A00(39, 4, 104))};
    }

    public static boolean A02(int i2) {
        if ((i2 >>> 8) == IK.A08(A00(16, 3, 31))) {
            return true;
        }
        for (int i3 : A02) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        return A05(interfaceC0456By, true);
    }

    public static boolean A04(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        return A05(interfaceC0456By, false);
    }
}
