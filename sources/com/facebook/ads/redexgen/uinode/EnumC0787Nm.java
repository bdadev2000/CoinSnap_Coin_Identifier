package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0787Nm {
    A06(0),
    A05(1),
    A04(2);

    public static byte[] A01;
    public static String[] A02 = {"rZGvvZMI6I", "wpdicw5jfWUP9Cs9nncu65zzvPXSjTXh", "qXEMgnv7Ct425l7In8PWxhOPFYVbEYpB", "dTodKdBY68fO6HNBSU3LN7qZJ4nOCEpk", "Hkjhu", "mY7TKQYFYXm3BBS2pDypGTbdY20sKsEk", "u0FGaDIimXxXG0l3UqPLAtx16Sc8Y059", "GEphX9PDUn8ir5euMIdeMTZrm9gVIFzw"};
    public int A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{46, 35, 44, 38, 49, 33, 35, 50, 39, 77, 82, 79, 73, 79, 92, 84, 73, 102, 125, 96, 99, 118, 112, 122, 117, 122, 118, 119};
    }

    static {
        A02();
    }

    EnumC0787Nm(int i10) {
        this.A00 = i10;
    }

    public static EnumC0787Nm A00(int i10) {
        for (EnumC0787Nm enumC0787Nm : valuesCustom()) {
            if (enumC0787Nm.A00 == i10) {
                return enumC0787Nm;
            }
        }
        return A05;
    }

    public final int A03() {
        return this.A00;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0787Nm[] valuesCustom() {
        Object clone = values().clone();
        if (A02[4].length() == 18) {
            throw new RuntimeException();
        }
        A02[4] = "9YF3oPenjmVnddjujEMQmJq4m";
        return (EnumC0787Nm[]) clone;
    }
}
