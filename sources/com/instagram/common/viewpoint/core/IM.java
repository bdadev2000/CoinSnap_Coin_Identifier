package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class IM {
    public static byte[] A05;
    public static String[] A06 = {"CKr41w14t1O2cryEh3ikvT7i7pEP9", "bEGBJQHGeZKUb4WdZIGxqLwvmRBgZ", "WJDScLHbi8oxsdfQony1oDJlSLfJGxpw", "pOlO7zhgFKlhBGXLhLjwOcF", "rLNLh63NT4PjFgFvGilm0aaXO1", "ZBDxHqybdlnYnJoT5A", "oQHJZTGiGZIE4PPH2KMpxcomJFI3fhl6", "Q2Q9yYe5Vhv4fwSqVMC8JpXgrnkYYd7U"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List<byte[]> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static IM A00(I4 i4) throws A0 {
        try {
            i4.A0Z(4);
            int A0E = (i4.A0E() & 3) + 1;
            if (A0E == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int A0E2 = i4.A0E() & 31;
            for (int i2 = 0; i2 < A0E2; i2++) {
                arrayList.add(A03(i4));
            }
            int A0E3 = i4.A0E();
            for (int i3 = 0; i3 < A0E3; i3++) {
                arrayList.add(A03(i4));
            }
            int i5 = -1;
            int i6 = -1;
            float f2 = 1.0f;
            if (A0E2 > 0) {
                C0596Hz A062 = I0.A06((byte[]) arrayList.get(0), A0E, ((byte[]) arrayList.get(0)).length);
                i5 = A062.A06;
                i6 = A062.A02;
                f2 = A062.A00;
                String[] strArr = A06;
                if (strArr[0].length() != strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[0] = "iF8GnQ9Q0rYocX5fL90VsceL3jxlg";
                strArr2[1] = "Hokd8PUOGTr7ZNbLj7TXmfqAgif2w";
            }
            return new IM(arrayList, A0E, i5, i6, f2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new A0(A01(0, 24, Opcodes.LREM), e);
        }
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{36, 19, 19, 14, 19, 65, 17, 0, 19, 18, 8, 15, 6, 65, 32, 55, 34, 65, 2, 14, 15, 7, 8, 6};
    }

    static {
        A02();
    }

    public IM(List<byte[]> initializationData, int i2, int i3, int i4, float f2) {
        this.A04 = initializationData;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = f2;
    }

    public static byte[] A03(I4 i4) {
        int A0I = i4.A0I();
        int offset = i4.A06();
        i4.A0Z(A0I);
        return AbstractC0580Hj.A08(i4.A00, offset, A0I);
    }
}
