package com.instagram.common.viewpoint.core;

import android.graphics.Color;
import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.1O, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1O implements Serializable {
    public static byte[] A09 = null;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final long serialVersionUID = 8946536326456653736L;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{110, 125, 126, 125, -126, 125, -111, 121, -118, -72, -118, -68, -117, -116, -77, -55, -64, -55, -60, -55, -13, -113, -46, -94, -46, -93, -46, -91, UnsignedBytes.MAX_POWER_OF_TWO, -61, -61, -111, -115, -107, -115, -61, -61, -64, -62, -62, -60, -51, -45, -66, -62, -50, -53, -50, -47, 24, 29, 21, 25, 37, 34, 37, 40, 22, 35, 24, 45, 19, 23, 35, 32, 35, 38, 27, 44, 25, 23, 27, 39, 36, 39, 42, 14, 31, 12, 10, 14, 26, 23, 26, 29, 10, 26, 33, 16, 29, 10, 24, 16, 15, 20, 12, 17, 34, 15, 13, 34, 19, 38, 34, 13, 17, 29, 26, 29, 32, -16, 1, -18, -20, 1, -14, 5, 1, -20, -16, -4, -7, -4, -1, -20, -4, 3, -14, -1, -20, -6, -14, -15, -10, -18, 48, 50, 31, 49, 38, 49, 41, 34, 28, 32, 44, 41, 44, 47, 29, 18, 29, 21, 14, 8, 12, 24, 21, 24, 27};
    }

    static {
        A03();
        A0A = Color.parseColor(A02(14, 7, 76));
        A0B = Color.parseColor(A02(7, 7, 18));
        A0C = Color.parseColor(A02(21, 7, 40));
        String A02 = A02(28, 9, 25);
        A0D = Color.parseColor(A02);
        A0E = Color.parseColor(A02(0, 7, 7));
        A0F = Color.parseColor(A02);
    }

    public C1O(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A04 = i6;
        this.A05 = i7;
        this.A06 = i8;
        this.A07 = i9;
        this.A08 = i10;
    }

    public static int A00(JSONObject jSONObject, String str, int i2) {
        if (jSONObject != null && jSONObject.has(str)) {
            return Color.parseColor(jSONObject.optString(str));
        }
        return i2;
    }

    public static C1O A01(JSONObject jSONObject) {
        return new C1O(A00(jSONObject, A02(37, 12, 27), A0A), A00(jSONObject, A02(57, 10, 112), A0B), A00(jSONObject, A02(Opcodes.I2D, 14, Opcodes.LSHL), -16777216), A00(jSONObject, A02(49, 8, Opcodes.FREM), A0C), A00(jSONObject, A02(67, 9, 116), A0D), A00(jSONObject, A02(76, 20, 103), -1), A00(jSONObject, A02(96, 14, 106), -1), A00(jSONObject, A02(110, 25, 73), A0F), A00(jSONObject, A02(Opcodes.FCMPL, 11, 101), -16777216));
    }

    public final int A04(boolean z2) {
        if (z2) {
            return -1;
        }
        return this.A00;
    }

    public final int A05(boolean z2) {
        if (z2) {
            return -1;
        }
        return this.A01;
    }

    public final int A06(boolean z2) {
        if (z2) {
            return -1;
        }
        return this.A02;
    }

    public final int A07(boolean z2) {
        return z2 ? A0E : this.A03;
    }

    public final int A08(boolean z2) {
        return z2 ? this.A05 : this.A04;
    }

    public final int A09(boolean z2) {
        return z2 ? this.A07 : this.A06;
    }

    public final int A0A(boolean z2) {
        if (z2) {
            return -1;
        }
        return this.A08;
    }
}
