package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class IH {
    public static byte[] A05;
    public static String[] A06 = {"BmLXPPjgF3W3yl6sHxYVjODx4Gc4ZSvN", "I4b0P0MoHEzHAP7yyYIBBQ151YdBHOwS", "TnUUZ2ELhZytD28RyaEX2mWW0X", "N95", "x88QxZ2XVEltUSPssGjwLeARzs7qYdf0", "T8gtGJunXdUSumjdX3X9mxIBVL", "lBAIpAErMYY7sFwVqjboSux", "Abd"};
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
    public static IH A00(C0651Hz c0651Hz) throws C04599v {
        try {
            c0651Hz.A0Z(4);
            int A0E = (c0651Hz.A0E() & 3) + 1;
            if (A0E == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int A0E2 = c0651Hz.A0E() & 31;
            for (int i10 = 0; i10 < A0E2; i10++) {
                arrayList.add(A03(c0651Hz));
            }
            int A0E3 = c0651Hz.A0E();
            for (int i11 = 0; i11 < A0E3; i11++) {
                arrayList.add(A03(c0651Hz));
            }
            int i12 = -1;
            int i13 = -1;
            float f10 = 1.0f;
            if (A0E2 > 0) {
                C0646Hu A062 = AbstractC0647Hv.A06((byte[]) arrayList.get(0), A0E, ((byte[]) arrayList.get(0)).length);
                i12 = A062.A06;
                i13 = A062.A02;
                f10 = A062.A00;
            } else {
                String[] strArr = A06;
                if (strArr[3].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[2] = "uBIRbiuvHYy0oHv2RJvgJqXQ4A";
                strArr2[5] = "sPpQgCzWXqIb9lVIC566YsDxxs";
            }
            return new IH(arrayList, A0E, i12, i13, f10);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new C04599v(A01(0, 24, 65), e2);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-14, Ascii.US, Ascii.US, Ascii.FS, Ascii.US, -51, Ascii.GS, Ascii.SO, Ascii.US, 32, Ascii.SYN, Ascii.ESC, Ascii.DC4, -51, -18, 3, -16, -51, Ascii.DLE, Ascii.FS, Ascii.ESC, 19, Ascii.SYN, Ascii.DC4};
    }

    static {
        A02();
    }

    public IH(List<byte[]> initializationData, int i10, int i11, int i12, float f10) {
        this.A04 = initializationData;
        this.A02 = i10;
        this.A03 = i11;
        this.A01 = i12;
        this.A00 = f10;
    }

    public static byte[] A03(C0651Hz c0651Hz) {
        int A0I = c0651Hz.A0I();
        int offset = c0651Hz.A06();
        c0651Hz.A0Z(A0I);
        return AbstractC0630He.A08(c0651Hz.A00, offset, A0I);
    }
}
