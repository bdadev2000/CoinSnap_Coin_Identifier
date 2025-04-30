package com.meta.analytics.dsp.uinode;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.51, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass51 {
    public static byte[] A07;
    public static String[] A08 = {"ffTcX10Z9", "veDPHJ", "R", "iWatF5LLo", "0slLts", "p92m", "9", "eFvKPH9TFpfstHyCObyNN72zUjBGeH"};
    public View A01;
    public AbstractC09024o A02;
    public C1119Eb A03;
    public boolean A04;
    public boolean A05;
    public int A00 = -1;
    public final C09124z A06 = new C09124z(0, 0);

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {78, 105, 113, 102, 107, 110, 99, 39, 115, 102, 117, 96, 98, 115, 39, 119, 104, 116, 110, 115, 110, 104, 105, Ascii.SYN, 39, 53, 53, 35, 34, 102, 41, 48, 35, 52, 102, 50, 39, 52, 33, 35, 50, 102, 54, 41, 53, 47, 50, 47, 41, 40, 102, 49, 46, 47, 42, 35, 102, 53, 43, 41, 41, 50, 46, 102, 53, 37, 52, 41, 42, 42, 47, 40, 33, 104, 78, 121, Ascii.DEL, 101, Ascii.DEL, 112, 121, 110, 74, 117, 121, 107};
        String[] strArr = A08;
        if (strArr[4].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A08[7] = "8BqCBekg5p6xdwXQXpIxknueaPhzjw";
        A07 = bArr;
    }

    public abstract void A0G();

    public abstract void A0H(int i9, int i10, AnonymousClass53 anonymousClass53, C09124z c09124z);

    public abstract void A0I(View view, AnonymousClass53 anonymousClass53, C09124z c09124z);

    static {
        A03();
    }

    private final int A00(View view) {
        return this.A03.A1B(view);
    }

    private final View A01(int i9) {
        return this.A03.A06.A1m(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i9, int i10) {
        C1119Eb c1119Eb = this.A03;
        if (!this.A05 || this.A00 == -1 || c1119Eb == null) {
            A09();
        }
        this.A04 = false;
        View view = this.A01;
        if (view != null) {
            int A00 = A00(view);
            int i11 = this.A00;
            String[] strArr = A08;
            if (strArr[4].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "1zDtC4ICw";
            strArr2[0] = "WYaFIbeKL";
            if (A00 == i11) {
                A0I(this.A01, c1119Eb.A0s, this.A06);
                C09124z c09124z = this.A06;
                if (A08[5].length() != 9) {
                    String[] strArr3 = A08;
                    strArr3[6] = "M";
                    strArr3[2] = "Q";
                    c09124z.A05(c1119Eb);
                    A09();
                } else {
                    A08[5] = "sldJFA0K947j";
                    c09124z.A05(c1119Eb);
                    A09();
                }
            } else {
                Log.e(A02(74, 12, 0), A02(23, 51, 90));
                this.A01 = null;
            }
        }
        if (this.A05) {
            A0H(i9, i10, c1119Eb.A0s, this.A06);
            boolean hadJumpTarget = this.A06.A06();
            this.A06.A05(c1119Eb);
            if (hadJumpTarget) {
                if (this.A05) {
                    this.A04 = true;
                    c1119Eb.A08.A07();
                } else {
                    A09();
                }
            }
        }
    }

    public final int A06() {
        return this.A03.A06.A0W();
    }

    public final int A07() {
        return this.A00;
    }

    public final AbstractC09024o A08() {
        return this.A02;
    }

    public final void A09() {
        if (!this.A05) {
            return;
        }
        A0G();
        this.A03.A0s.A0F = -1;
        this.A01 = null;
        this.A00 = -1;
        this.A04 = false;
        this.A05 = false;
        this.A02.A0M(this);
        this.A02 = null;
        this.A03 = null;
    }

    public final void A0A(int i9) {
        this.A00 = i9;
    }

    public final void A0B(PointF pointF) {
        float sqrt = (float) Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
        float magnitude = pointF.x;
        pointF.x = magnitude / sqrt;
        float magnitude2 = pointF.y;
        pointF.y = magnitude2 / sqrt;
    }

    public final void A0C(View view) {
        if (A00(view) == A07()) {
            this.A01 = view;
        }
    }

    public final void A0D(C1119Eb c1119Eb, AbstractC09024o abstractC09024o) {
        this.A03 = c1119Eb;
        this.A02 = abstractC09024o;
        if (this.A00 != -1) {
            c1119Eb.A0s.A0F = this.A00;
            this.A05 = true;
            this.A04 = true;
            this.A01 = A01(A07());
            this.A03.A08.A07();
            return;
        }
        throw new IllegalArgumentException(A02(0, 23, 27));
    }

    public final boolean A0E() {
        return this.A04;
    }

    public final boolean A0F() {
        return this.A05;
    }
}
