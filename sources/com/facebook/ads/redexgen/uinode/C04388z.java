package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.8z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04388z {
    public static byte[] A02;
    public static String[] A03 = {"x3S2W4LbSFe5E5feiuJV3xvLrDJW5MIT", "c6l", "kksKjEgnZRd2qIBKnSBjD5FFw", "r4XHqvELKUQNiUGngs8vqNM0Mk3b9MGe", "kvUI2sJVOm05aD2rNLnp8ceY2vExoctW", "R5zC7nE0u0bj6wUda1FjOq7V7", "PNiW5N8GwPzy1zueKCYWrY6DC52FHCY", "sp7WuMlrQg67lkIbNPhafgU9zVWwTylU"};
    public final int A00;
    public final int A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 35);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-85, -48, -40, -61, -50, -53, -58, -126, -53, -48, -58, -57, -38, -90, -57, -50, -42, -61, -126, -118, -121, -58, -114, -126, -53, -48, -58, -57, -38, -126, -97, -126, -121, -58, -117, -88, -85, -82, -89, 98, 106, 103, -90, 107, 98, 126, 98, 111, 115, -93, -90, -87, -94, 93, 122, 93, 98, -95, 93, 99, 99, 93, -90, -85, -95, -94, -75, 93, 122, 93, 98, -95, -51, -48, -45, -52, -121, -92, -92, -121, -108, -104, -121, -115, -115, -121, -48, -43, -53, -52, -33, -121, -92, -121, -116, -53};
    }

    static {
        A01();
    }

    public C04388z() {
        this(-1, -1);
    }

    public C04388z(int i10, int i11) {
        if (i10 < -1) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(35, 14, 31), Integer.valueOf(i10)));
        }
        if (i10 >= 0 && i11 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(49, 23, 26), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        if (i10 == -1 && i11 != -1) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(72, 24, 68), Integer.valueOf(i11)));
        }
        this.A00 = i10;
        this.A01 = i11;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final int A04(C04388z c04388z) {
        int i10 = this.A00;
        int i11 = c04388z.A00;
        if (i10 != i11) {
            return i10 - i11;
        }
        return this.A01 - c04388z.A01;
    }

    public final C04388z A05(int i10) {
        int i11 = this.A01;
        if (i10 + i11 >= 0) {
            return new C04388z(this.A00, i11 + i10);
        }
        throw new IllegalArgumentException(String.format(Locale.US, A00(0, 35, 63), Integer.valueOf(i10), Integer.valueOf(this.A01)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C04388z)) {
            return false;
        }
        C04388z c04388z = (C04388z) obj;
        int i10 = c04388z.A00;
        int i11 = this.A00;
        if (A03[4].charAt(2) != 'U') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[2] = "8FF357LC7LaQaiaU3dBgrFv1B";
        strArr[5] = "tq4t252ij5wfM6c4Cr38q8OJQ";
        return i10 == i11 && c04388z.A01 == this.A01;
    }

    public final int hashCode() {
        return (this.A00 * 2) + (this.A01 * 3);
    }
}
