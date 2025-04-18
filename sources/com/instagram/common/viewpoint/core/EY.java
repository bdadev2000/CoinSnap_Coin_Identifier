package com.instagram.common.viewpoint.core;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class EY implements InterfaceC1001Ya {
    public static byte[] A05;
    public static String[] A06 = {"Xr6CfYARiXWi1tHF5rKzHnV8sizRHMyX", "wJO", "vhv6fx1WvUjVUT42a865NPYV6nOkfSqv", "ykO1A1PT3jL3Q8zq7D2WaGEX54xmjF9S", "j", "GNQC5jQwe2bl4DeUZLcdaEx2Qf8zZlwn", "pCroGV0GNScuUwFSTYQpDpdwc2fRC0On", "UPhRQNGhO5dHFWFW9SQSP3jiGA6NTJBd"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{84, 88, 9, 24, 31, 22, 113, 53, 48, 37, 48, 113, 34, 56, 43, 52, 113, 60, 56, 34, 60, 48, 37, 50, 57, 107, 113, 52, 5, 2, 11, Utf8.REPLACEMENT_BYTE, 9, 9, 7, 9, 30};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.instagram.common.viewpoint.core.C6
    public final C5 A8H(long j2) {
        double d;
        if (!A9h()) {
            return new C5(new C7(0L, this.A02 + this.A00));
        }
        long A0E = IK.A0E(j2, 0L, this.A03);
        double d2 = (A0E * 100.0d) / this.A03;
        if (d2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        } else if (d2 >= 100.0d) {
            d = 256.0d;
        } else {
            int i2 = (int) d2;
            double d3 = this.A04[i2];
            d = (((i2 == 99 ? 256.0d : this.A04[i2 + 1]) - d3) * (d2 - i2)) + d3;
        }
        return new C5(new C7(A0E, this.A02 + IK.A0E(Math.round((d / 256.0d) * this.A01), this.A00, this.A01 - 1)));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1001Ya
    public final long A8W(long j2) {
        long j3 = j2 - this.A02;
        if (!A9h() || j3 <= this.A00) {
            return 0L;
        }
        double d = (j3 * 256.0d) / this.A01;
        int A0B = IK.A0B(this.A04, (long) d, true, true);
        long A00 = A00(A0B);
        long j4 = this.A04[A0B];
        long A002 = A00(A0B + 1);
        return Math.round((A002 - A00) * (j4 == (A0B == 99 ? 256L : this.A04[A0B + 1]) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d - j4) / (r8 - j4))) + A00;
    }

    static {
        A03();
    }

    public EY(long j2, int i2, long j3) {
        this(j2, i2, j3, -1L, null);
    }

    public EY(long j2, int i2, long j3, long j4, long[] jArr) {
        this.A02 = j2;
        this.A00 = i2;
        this.A03 = j3;
        this.A01 = j4;
        this.A04 = jArr;
    }

    private long A00(int i2) {
        return (this.A03 * i2) / 100;
    }

    public static EY A01(long durationUs, long dataSize, C3 c3, I4 i4) {
        int A0H;
        int i2 = c3.A04;
        int i3 = c3.A03;
        int A08 = i4.A08();
        if ((A08 & 1) != 1 || (A0H = i4.A0H()) == 0) {
            return null;
        }
        long A0F = IK.A0F(A0H, i2 * 1000000, i3);
        int i5 = A08 & 6;
        if (A06[4].length() == 20) {
            throw new RuntimeException();
        }
        A06[4] = "W327rNxAr1Lp0kX";
        if (i5 != 6) {
            return new EY(dataSize, c3.A02, A0F);
        }
        long A0H2 = i4.A0H();
        long[] jArr = new long[100];
        for (int i6 = 0; i6 < 100; i6++) {
            long A0E = i4.A0E();
            String[] strArr = A06;
            String str = strArr[6];
            String str2 = strArr[2];
            int charAt = str.charAt(6);
            int i7 = str2.charAt(6);
            if (charAt == i7) {
                throw new RuntimeException();
            }
            A06[7] = "SFqGi8tygZ59FROXyWZkbYPPfUMGUQ5V";
            jArr[i6] = A0E;
        }
        if (durationUs != -1 && durationUs != dataSize + A0H2) {
            Log.w(A02(27, 10, 64), A02(2, 25, Opcodes.LUSHR) + durationUs + A02(0, 2, 84) + (dataSize + A0H2));
        }
        return new EY(dataSize, c3.A02, A0F, A0H2, jArr);
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final long A7F() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final boolean A9h() {
        return this.A04 != null;
    }
}
