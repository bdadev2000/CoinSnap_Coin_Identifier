package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public final class NN {
    public static byte[] A08;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final String A07;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{5, Ascii.SO, Ascii.FF, 62, 2, Ascii.SO, Ascii.SI, Ascii.NAK, 4, Ascii.SI, Ascii.NAK, 62, Ascii.CR, Ascii.SO, 0, 5, 4, 5, 62, Ascii.FF, Ascii.DC2, 56, 49, 62, 52, 60, 53, 34, Ascii.SI, 36, 57, Base64.padSymbol, 53, Ascii.SI, Base64.padSymbol, 35, Ascii.CAN, Ascii.US, Ascii.CAN, 5, Ascii.CAN, Ascii.DLE, Ascii.GS, 46, 4, 3, Ascii.GS, 71, 68, 74, 79, 116, 77, 66, 69, 66, 88, 67, 116, 70, 88, Ascii.DLE, 19, Ascii.GS, Ascii.CAN, 35, Ascii.SI, 8, Ascii.GS, Ascii.SO, 8, 35, 17, Ascii.SI, 66, 85, 67, 64, 95, 94, 67, 85, 111, 85, 94, 84, 111, 93, 67, 59, 43, 58, 39, 36, 36, Ascii.ETB, 58, 45, 41, 44, 49, Ascii.ETB, 37, 59, 40, 62, 40, 40, 50, 52, 53, 4, Base64.padSymbol, 50, 53, 50, 40, 51, 4, 54, 40};
    }

    public NN(String str, long j3, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.A07 = str;
        this.A01 = j3;
        this.A03 = j10;
        this.A04 = j11;
        this.A00 = j12;
        this.A05 = j13;
        this.A02 = j14;
        this.A06 = j15;
    }

    public final Map<String, String> A02() {
        HashMap hashMap = new HashMap(7);
        hashMap.put(A00(36, 11, 96), this.A07);
        hashMap.put(A00(21, 15, 65), String.valueOf(this.A01));
        hashMap.put(A00(61, 13, 109), String.valueOf(this.A03));
        hashMap.put(A00(74, 15, 33), String.valueOf(this.A04));
        hashMap.put(A00(0, 21, 112), String.valueOf(this.A00));
        hashMap.put(A00(89, 15, 89), String.valueOf(this.A05));
        hashMap.put(A00(47, 14, 58), String.valueOf(this.A02));
        hashMap.put(A00(104, 17, 74), String.valueOf(this.A06));
        return hashMap;
    }
}
