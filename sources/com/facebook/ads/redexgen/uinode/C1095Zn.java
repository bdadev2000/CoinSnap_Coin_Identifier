package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Zn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1095Zn extends AnonymousClass51 {
    public static byte[] A06;
    public PointF A02;
    public final float A03;
    public final LinearInterpolator A05 = new LinearInterpolator();
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public int A00 = 0;
    public int A01 = 0;

    static {
        A06();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final int A03(View view, int i10) {
        AbstractC03364o A08 = A08();
        if (A08 == null || !A08.A21()) {
            return 0;
        }
        C03374p c03374p = (C03374p) view.getLayoutParams();
        return A0N(A08.A0o(view) - c03374p.topMargin, A08.A0j(view) + c03374p.bottomMargin, A08.A0g(), A08.A0X() - A08.A0d(), i10);
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 35);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A06 = new byte[]{41, Ascii.FF, Ascii.VT, 0, 4, Ascii.ETB, 54, 8, 10, 10, 17, Ascii.CR, 54, 6, Ascii.ETB, 10, 9, 9, 0, Ascii.ETB, Ascii.NAK, 35, 57, 108, 63, 36, 35, 57, 32, 40, 108, 35, 58, 41, 62, 62, 37, 40, 41, 108, 47, 35, 33, 60, 57, 56, 41, Ascii.US, 47, 62, 35, 32, 32, Ascii.SUB, 41, 47, 56, 35, 62, 10, 35, 62, Ascii.FS, 35, 63, 37, 56, 37, 35, 34, 108, 59, 36, 41, 34, 108, 56, 36, 41, 108, 0, 45, 53, 35, 57, 56, 1, 45, 34, 45, 43, 41, 62, 108, 40, 35, 41, 63, 108, 34, 35, 56, 108, 37, 33, 60, 32, 41, 33, 41, 34, 56, 108, 42, 55, 56, 41, 121, 41, 43, 60, 63, 60, 43, 60, 55, 58, 60, 121, 42, 49, 54, 44, 53, Base64.padSymbol, 121, 59, 60, 121, 54, 55, 60, 121, 54, 63, 121, 45, 49, 60, 121, 58, 54, 55, 42, 45, 56, 55, 45, 42, 121, Base64.padSymbol, 60, 63, 48, 55, 60, Base64.padSymbol, 121, 48, 55, 121, 10, 52, 54, 54, 45, 49, 10, 58, 43, 54, 53, 53, 60, 43, 117, 121, 42, 45, 56, 43, 45, 48, 55, 62, 121, 46, 48, 45, 49, 121, 10, Ascii.ETB, Ascii.CAN, 9, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public int A0O(View view, int i10) {
        AbstractC03364o A08 = A08();
        if (A08 == null || !A08.A20()) {
            return 0;
        }
        C03374p c03374p = (C03374p) view.getLayoutParams();
        return A0N(A08.A0k(view) - c03374p.leftMargin, A08.A0n(view) + c03374p.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i10);
    }

    public C1095Zn(Context context) {
        this.A03 = A0J(context.getResources().getDisplayMetrics());
    }

    private final int A00() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.A02.y > 0.0f ? 1 : -1;
    }

    private int A01(int i10, int i11) {
        int before = i10 - i11;
        if (i10 * before <= 0) {
            return 0;
        }
        return before;
    }

    private final void A07(C03464z c03464z) {
        PointF A0P = A0P(A07());
        if (A0P == null || (A0P.x == 0.0f && A0P.y == 0.0f)) {
            c03464z.A03(A07());
            A09();
            return;
        }
        A0B(A0P);
        this.A02 = A0P;
        this.A00 = (int) (A0P.x * 10000.0f);
        this.A01 = (int) (A0P.y * 10000.0f);
        int time = (int) (A0L(10000) * 1.2f);
        c03464z.A04((int) (this.A00 * 1.2f), (int) (this.A01 * 1.2f), time, this.A05);
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass51
    public final void A0G() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass51
    public final void A0H(int i10, int i11, AnonymousClass53 anonymousClass53, C03464z c03464z) {
        if (A06() == 0) {
            A09();
            return;
        }
        this.A00 = A01(this.A00, i10);
        int A01 = A01(this.A01, i11);
        this.A01 = A01;
        if (this.A00 == 0 && A01 == 0) {
            A07(c03464z);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass51
    public void A0I(View view, AnonymousClass53 anonymousClass53, C03464z c03464z) {
        int A0O = A0O(view, A0K());
        int dx = A00();
        int A03 = A03(view, dx);
        int dy = A0O * A0O;
        int dx2 = A03 * A03;
        int time = A0M((int) Math.sqrt(dy + dx2));
        if (time > 0) {
            int distance = -A0O;
            int dy2 = -A03;
            c03464z.A04(distance, dy2, time, this.A04);
        }
    }

    public float A0J(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A0K() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.A02.x > 0.0f ? 1 : -1;
    }

    public int A0L(int i10) {
        return (int) Math.ceil(Math.abs(i10) * this.A03);
    }

    public final int A0M(int i10) {
        return (int) Math.ceil(A0L(i10) / 0.3356d);
    }

    public final int A0N(int i10, int i11, int i12, int i13, int i14) {
        switch (i14) {
            case -1:
                return i12 - i10;
            case 0:
                int i15 = i12 - i10;
                if (i15 > 0) {
                    return i15;
                }
                int i16 = i13 - i11;
                if (i16 < 0) {
                    return i16;
                }
                return 0;
            case 1:
                return i13 - i11;
            default:
                throw new IllegalArgumentException(A04(113, 93, 122));
        }
    }

    public PointF A0P(int i10) {
        Object A08 = A08();
        if (A08 instanceof AnonymousClass50) {
            return ((AnonymousClass50) A08).A4O(i10);
        }
        Log.w(A04(0, 20, 70), A04(20, 93, 111) + AnonymousClass50.class.getCanonicalName());
        return null;
    }
}
