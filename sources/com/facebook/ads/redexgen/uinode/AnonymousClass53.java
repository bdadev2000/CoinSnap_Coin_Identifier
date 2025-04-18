package com.facebook.ads.redexgen.uinode;

import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.53, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass53 {
    public static byte[] A0H;
    public int A01;
    public int A02;
    public int A06;
    public int A07;
    public long A08;
    public SparseArray<Object> A0G;
    public int A0F = -1;
    public int A05 = 0;
    public int A00 = 0;
    public int A04 = 1;
    public int A03 = 0;
    public boolean A0D = false;
    public boolean A09 = false;
    public boolean A0E = false;
    public boolean A0A = false;
    public boolean A0C = false;
    public boolean A0B = false;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0H = new byte[]{-75, -9, 10, 9, -75, -2, 9, -75, -2, 8, -75, -38, -50, Ascii.ESC, -14, Ascii.SI, 34, Ascii.SI, -21, -10, -22, 55, Ascii.SO, 47, 54, 47, 62, 47, 46, 19, 56, 64, 51, Base64.padSymbol, 51, 44, 54, 47, 19, 62, 47, 55, Ascii.CR, 57, 63, 56, 62, Ascii.GS, 51, 56, 45, 47, Ascii.SUB, 60, 47, 64, 51, 57, 63, Base64.padSymbol, Ascii.SYN, 43, 67, 57, 63, 62, 7, -2, -14, 63, Ascii.ESC, 64, 34, 68, 55, Ascii.RS, 51, 75, 65, 71, 70, Ascii.SI, -49, -61, Ascii.DLE, -20, Ascii.ETB, 8, Ascii.DLE, -26, Ascii.DC2, Ascii.CAN, 17, Ascii.ETB, -32, -27, -39, 38, 9, 43, Ascii.RS, 47, 34, 40, 46, 44, 5, Ascii.SUB, 50, 40, 46, 45, 2, 45, Ascii.RS, 38, -4, 40, 46, 39, 45, -10, -73, -85, -8, -35, 0, -7, -37, -3, -16, -17, -12, -18, -1, -12, 1, -16, -52, -7, -12, -8, -20, -1, -12, -6, -7, -2, -56, -111, -123, -46, -73, -38, -45, -72, -50, -46, -43, -47, -54, -90, -45, -50, -46, -58, -39, -50, -44, -45, -40, -94, -69, -81, -4, -30, 3, 1, 4, -14, 3, 4, 1, -12, -46, -9, -16, -3, -10, -12, -13, -52, -16, 5, Ascii.GS, 19, Ascii.EM, Ascii.CAN, -60, Ascii.ETB, Ascii.CAN, 5, Ascii.CAN, 9, -60, Ascii.ETB, Ascii.FF, 19, Ascii.EM, Ascii.DLE, 8, -60, 6, 9, -60, 19, Ascii.DC2, 9, -60, 19, 10, -60, -31, 2, -17, 2, -13, 9, -5, -30, -17, 0, -11, -13, 2, -34, -3, 1, -9, 2, -9, -3, -4, -53};
    }

    public final int A03() {
        if (this.A09) {
            return this.A05 - this.A00;
        }
        return this.A03;
    }

    public final void A04(int i10) {
        if ((this.A04 & i10) != 0) {
        } else {
            throw new IllegalStateException(A01(PsExtractor.AUDIO_STREAM, 30, 67) + Integer.toBinaryString(i10) + A01(0, 11, 52) + Integer.toBinaryString(this.A04));
        }
    }

    public final void A05(AbstractC03244c abstractC03244c) {
        this.A04 = 1;
        this.A03 = abstractC03244c.A0E();
        this.A09 = false;
        this.A0E = false;
        this.A0A = false;
    }

    public final boolean A06() {
        return this.A0F != -1;
    }

    public final boolean A07() {
        return this.A09;
    }

    public final boolean A08() {
        return this.A0B;
    }

    public final String toString() {
        return A01(222, 22, 45) + this.A0F + A01(11, 8, 77) + this.A0G + A01(82, 13, 66) + this.A03 + A01(95, 27, 88) + this.A05 + A01(19, 48, 105) + this.A00 + A01(172, 20, 46) + this.A0D + A01(67, 15, 113) + this.A09 + A01(149, 23, 4) + this.A0C + A01(122, 27, 42) + this.A0B + AbstractJsonLexerKt.END_OBJ;
    }
}
