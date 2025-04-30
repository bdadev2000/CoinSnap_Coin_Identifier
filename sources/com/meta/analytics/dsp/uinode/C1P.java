package com.meta.analytics.dsp.uinode;

import android.graphics.Color;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1P implements Serializable {
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

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{37, 52, 53, 52, 49, 52, 64, 84, 67, Ascii.NAK, 67, 17, 66, 65, 4, Ascii.RS, Ascii.ETB, Ascii.RS, 19, Ascii.RS, 68, 82, Ascii.ETB, 71, Ascii.ETB, 70, Ascii.ETB, 72, 58, Ascii.DEL, Ascii.DEL, 45, 41, 33, 41, Ascii.DEL, Ascii.DEL, 59, 57, 57, 63, 52, 46, 5, 57, 53, 54, 53, 40, 110, 107, 83, 111, 99, 96, 99, 126, 57, 52, 63, 34, 4, 56, 52, 55, 52, 41, Ascii.CR, Ascii.SUB, Ascii.SI, 49, Ascii.CR, 1, 2, 1, Ascii.FS, 105, 126, 107, 85, 105, 101, 102, 101, 120, 85, 101, 124, 111, 120, 85, 103, 111, 110, 99, 107, 1, Ascii.SYN, 3, 61, Ascii.SYN, 7, Ascii.SUB, Ascii.SYN, 61, 1, Ascii.CR, Ascii.SO, Ascii.CR, Ascii.DLE, Ascii.US, 8, Ascii.GS, 35, 8, Ascii.EM, 4, 8, 35, Ascii.US, 19, Ascii.DLE, 19, Ascii.SO, 35, 19, 10, Ascii.EM, Ascii.SO, 35, 17, Ascii.EM, Ascii.CAN, Ascii.NAK, Ascii.GS, 43, 45, 58, 44, 49, 44, 52, 61, 7, 59, 55, 52, 55, 42, 83, 78, 83, 75, 66, 120, 68, 72, 75, 72, 85};
    }

    static {
        A03();
        A0A = Color.parseColor(A02(14, 7, 123));
        A0B = Color.parseColor(A02(7, 7, 43));
        A0C = Color.parseColor(A02(21, 7, 45));
        String A02 = A02(28, 9, 69);
        A0D = Color.parseColor(A02);
        A0E = Color.parseColor(A02(0, 7, 90));
        A0F = Color.parseColor(A02);
    }

    public C1P(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.A00 = i9;
        this.A01 = i10;
        this.A02 = i11;
        this.A03 = i12;
        this.A04 = i13;
        this.A05 = i14;
        this.A06 = i15;
        this.A07 = i16;
        this.A08 = i17;
    }

    public static int A00(JSONObject jSONObject, String str, int i9) {
        if (jSONObject != null && jSONObject.has(str)) {
            return Color.parseColor(jSONObject.optString(str));
        }
        return i9;
    }

    public static C1P A01(JSONObject jSONObject) {
        return new C1P(A00(jSONObject, A02(37, 12, 6), A0A), A00(jSONObject, A02(57, 10, 7), A0B), A00(jSONObject, A02(135, 14, 4), ViewCompat.MEASURED_STATE_MASK), A00(jSONObject, A02(49, 8, 80), A0C), A00(jSONObject, A02(67, 9, 50), A0D), A00(jSONObject, A02(76, 20, 86), -1), A00(jSONObject, A02(96, 14, 62), -1), A00(jSONObject, A02(110, 25, 32), A0F), A00(jSONObject, A02(149, 11, 123), ViewCompat.MEASURED_STATE_MASK));
    }

    public final int A04(boolean z8) {
        if (z8) {
            return -1;
        }
        return this.A00;
    }

    public final int A05(boolean z8) {
        if (z8) {
            return -1;
        }
        return this.A01;
    }

    public final int A06(boolean z8) {
        if (z8) {
            return -1;
        }
        return this.A02;
    }

    public final int A07(boolean z8) {
        return z8 ? A0E : this.A03;
    }

    public final int A08(boolean z8) {
        return z8 ? this.A05 : this.A04;
    }

    public final int A09(boolean z8) {
        return z8 ? this.A07 : this.A06;
    }

    public final int A0A(boolean z8) {
        if (z8) {
            return -1;
        }
        return this.A08;
    }
}
