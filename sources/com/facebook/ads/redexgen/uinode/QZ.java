package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum QZ {
    A05,
    A04,
    A03;

    public static byte[] A00;
    public static String[] A01 = {"7GN8MrenydislHWBBPReIB", "P5", "QDtKUFo4Pv7jZ7qumv108KMzWf6HrSMn", "iim9AI0VqZedzbhMlrV0qDo4YMl61NlV", "LtGcJkDv8PpKzGxu4pknm0pyAahoAI9h", "Z7tecEc8tS2JrzNmQM0R9CjEnjCb6ksC", "JuvL09EyJViLP4nPFPxPBzJM00GhcqAu", "kQTCJlS50BSCbahTVqCDmy8LW1L9RVvG"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 53);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{66, 69, 64, 65, 91, 75, 81, 80, 91, 75, 74, 91, 84, 72, 69, 93, 101, 98, 122, Byte.MAX_VALUE, 101, 110, 96, 105, 5, Ascii.SUB, 0, Ascii.SUB, 17, Ascii.US, Ascii.SYN};
    }

    static {
        A01();
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static QZ[] valuesCustom() {
        Object clone = values().clone();
        String[] strArr = A01;
        if (strArr[1].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        A01[3] = "fXviZ9AMoZT5h2KBZwjslTMVyIobOTux";
        return (QZ[]) clone;
    }
}
