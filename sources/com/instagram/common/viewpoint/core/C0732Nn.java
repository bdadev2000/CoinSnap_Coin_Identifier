package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Nn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0732Nn {
    public static byte[] A08;
    public static String[] A09 = {"RCnn6pCzuGmx3q71pxhPkiVufEZFhrue", "mpaFRgKOI8I", "wGcy8NSqCuh8w4Qd8eleXwL5PKL6kLu0", "yBtS5H9nBGCF", "BJontwmfcei8Ydfnpbrw2OUV", "oZ3BMmDZvmusmOT443VgfsBrmXcMhGXT", "1c3rWqDgJYn0reBhn", "avQkykMwqnpIevrWTEzEvMtO"};
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final String A07;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 94);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{104, 99, 97, 83, 111, 99, 98, 120, 105, 98, 120, 83, 96, 99, 109, 104, 105, 104, 83, 97, Byte.MAX_VALUE, 112, 121, 118, 124, 116, 125, 106, 71, 108, 113, 117, 125, 71, 117, 107, 46, 41, 46, 51, 46, 38, 43, 24, 50, 53, 43, 81, 82, 92, 89, 98, 91, 84, 83, 84, 78, 85, 98, 80, 78, 89, 90, 84, 81, 106, 70, 65, 84, 71, 65, 106, 88, 70, 34, 53, 35, 32, Utf8.REPLACEMENT_BYTE, 62, 35, 53, 15, 53, 62, 52, 15, 61, 35, 92, 76, 93, 64, 67, 67, 112, 93, 74, 78, 75, 86, 112, 66, 92, 68, 82, 68, 68, 94, 88, 89, 104, 81, 94, 89, 94, 68, 95, 104, 90, 68};
        String[] strArr = A09;
        if (strArr[2].charAt(30) != strArr[0].charAt(30)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[4] = "471Kmxz1Me6vVyXXwzQpeRmH";
        strArr2[7] = "yPKApIkQtN13Op8uOOE76YlC";
    }

    static {
        A01();
    }

    public C0732Nn(String str, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.A07 = str;
        this.A01 = j2;
        this.A03 = j3;
        this.A04 = j4;
        this.A00 = j5;
        this.A05 = j6;
        this.A02 = j7;
        this.A06 = j8;
    }

    public final Map<String, String> A02() {
        HashMap hashMap = new HashMap(7);
        hashMap.put(A00(36, 11, 25), this.A07);
        hashMap.put(A00(21, 15, 70), String.valueOf(this.A01));
        hashMap.put(A00(61, 13, 107), String.valueOf(this.A03));
        hashMap.put(A00(74, 15, 14), String.valueOf(this.A04));
        hashMap.put(A00(0, 21, 82), String.valueOf(this.A00));
        hashMap.put(A00(89, 15, Opcodes.LREM), String.valueOf(this.A05));
        hashMap.put(A00(47, 14, 99), String.valueOf(this.A02));
        hashMap.put(A00(104, 17, 105), String.valueOf(this.A06));
        return hashMap;
    }
}
