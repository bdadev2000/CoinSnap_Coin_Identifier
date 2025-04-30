package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1353Nm {
    A06(0),
    A05(1),
    A04(2);

    public static byte[] A01;
    public static String[] A02 = {"rZGvvZMI6I", "wpdicw5jfWUP9Cs9nncu65zzvPXSjTXh", "qXEMgnv7Ct425l7In8PWxhOPFYVbEYpB", "dTodKdBY68fO6HNBSU3LN7qZJ4nOCEpk", "Hkjhu", "mY7TKQYFYXm3BBS2pDypGTbdY20sKsEk", "u0FGaDIimXxXG0l3UqPLAtx16Sc8Y059", "GEphX9PDUn8ir5euMIdeMTZrm9gVIFzw"};
    public int A00;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{46, 35, 44, 38, 49, 33, 35, 50, 39, 77, 82, 79, 73, 79, 92, 84, 73, 102, 125, 96, 99, 118, 112, 122, 117, 122, 118, 119};
    }

    static {
        A02();
    }

    EnumC1353Nm(int i9) {
        this.A00 = i9;
    }

    public static EnumC1353Nm A00(int i9) {
        for (EnumC1353Nm enumC1353Nm : valuesCustom()) {
            if (enumC1353Nm.A00 == i9) {
                return enumC1353Nm;
            }
        }
        return A05;
    }

    public final int A03() {
        return this.A00;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1353Nm[] valuesCustom() {
        Object clone = values().clone();
        if (A02[4].length() == 18) {
            throw new RuntimeException();
        }
        A02[4] = "9YF3oPenjmVnddjujEMQmJq4m";
        return (EnumC1353Nm[]) clone;
    }
}
