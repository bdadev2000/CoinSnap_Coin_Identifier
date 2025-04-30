package com.meta.analytics.dsp.uinode;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class E4 implements XV {
    public static byte[] A05;
    public static String[] A06 = {"ilqNaxLa84KwPxLclQkuXaDAjXKjVBay", "YYRGnxFlW9XodSzMr5d0AgWnEUGN8SAb", "TFjL0s25LaCBEteV0vZTEC31LOIwZtzx", "GUmZTVO9tTTKl3Mpcsedxo5lbewk1Lj3", "rxyeYW6RMQKKTnfalukPqNZ2KBfsB6S5", "mDRU4t7MoPNm7z5QI5KjgmazMAxk28NE", "eki8tF0EBXj6l5GM9f5RfEnwS82fHKRK", "1REkWmsZMDj0bgzORsQu3VEtsLn99tZ6"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static E4 A01(long j7, long j9, By by, C1217Hz c1217Hz) {
        int A0H;
        int i9 = by.A04;
        int i10 = by.A03;
        int A08 = c1217Hz.A08();
        if ((A08 & 1) != 1 || (A0H = c1217Hz.A0H()) == 0) {
            return null;
        }
        long A0F = IF.A0F(A0H, i9 * 1000000, i10);
        if ((A08 & 6) != 6) {
            return new E4(j9, by.A02, A0F);
        }
        long A0H2 = c1217Hz.A0H();
        long[] jArr = new long[100];
        for (int i11 = 0; i11 < 100; i11++) {
            jArr[i11] = c1217Hz.A0E();
        }
        if (j7 != -1 && j7 != j9 + A0H2) {
            Log.w(A02(27, 10, 25), A02(2, 25, 119) + j7 + A02(0, 2, 77) + (j9 + A0H2));
        }
        return new E4(j9, by.A02, A0F, A0H2, jArr);
    }

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-24, -36, 62, 47, 52, 45, 6, 74, 71, 90, 71, 6, 89, 79, 96, 75, 6, 83, 79, 89, 83, 71, 90, 73, 78, 32, 6, -32, -15, -10, -17, -37, -19, -19, -13, -19, -6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.meta.analytics.dsp.uinode.XV
    public final long A88(long j7) {
        long j9 = j7 - this.A02;
        if (!A9I()) {
            return 0L;
        }
        int i9 = this.A00;
        String[] strArr = A06;
        if (strArr[5].charAt(8) == strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[5] = "W8nk4dNFk5UYs2ixe7nvUw2jVo0XpVlf";
        strArr2[2] = "94Ku6bJ3HPlMD7WZMvisRyq3A9jYmrd2";
        if (j9 <= i9) {
            return 0L;
        }
        double d2 = (j9 * 256.0d) / this.A01;
        int A0B = IF.A0B(this.A04, (long) d2, true, true);
        long A00 = A00(A0B);
        long j10 = this.A04[A0B];
        long A002 = A00(A0B + 1);
        return Math.round((A002 - A00) * (j10 == (A0B == 99 ? 256L : this.A04[A0B + 1]) ? 0.0d : (d2 - j10) / (r9 - j10))) + A00;
    }

    static {
        A03();
    }

    public E4(long j7, int i9, long j9) {
        this(j7, i9, j9, -1L, null);
    }

    public E4(long j7, int i9, long j9, long j10, long[] jArr) {
        this.A02 = j7;
        this.A00 = i9;
        this.A03 = j9;
        this.A01 = j10;
        this.A04 = jArr;
    }

    private long A00(int i9) {
        return (this.A03 * i9) / 100;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j7) {
        double scaledPosition;
        if (!A9I()) {
            return new C0(new C2(0L, this.A02 + this.A00));
        }
        long A0E = IF.A0E(j7, 0L, this.A03);
        double d2 = (A0E * 100.0d) / this.A03;
        if (d2 <= 0.0d) {
            scaledPosition = 0.0d;
        } else if (d2 >= 100.0d) {
            scaledPosition = 256.0d;
        } else {
            int i9 = (int) d2;
            double prevScaledPosition = this.A04[i9];
            double d9 = i9 == 99 ? 256.0d : r5[i9 + 1];
            double d10 = i9;
            String[] strArr = A06;
            if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[5] = "OMtgh7AGIO6dejZGwnLWpymQ4IFINQQk";
            strArr2[2] = "IsjlGA9bpSadN6h09kE1zH4HNrdroVjr";
            scaledPosition = ((d9 - prevScaledPosition) * (d2 - d10)) + prevScaledPosition;
        }
        long round = Math.round((scaledPosition / 256.0d) * this.A01);
        long positionOffset = this.A00;
        return new C0(new C2(A0E, this.A02 + IF.A0E(round, positionOffset, this.A01 - 1)));
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return this.A04 != null;
    }
}
