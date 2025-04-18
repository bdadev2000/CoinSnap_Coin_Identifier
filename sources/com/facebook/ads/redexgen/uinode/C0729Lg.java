package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Lg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0729Lg {
    public static byte[] A0I;
    public static String[] A0J = {"UAfRYX1IJYK1F4gMurnkVir00q2Lzr", "W9rWnfjKrefpB8hDj8decpkzvyqzW", "KuE77vVQtzCska5bvEw0ie6MMkaH2LqI", "aCUXypAv16RVdaAbRrmoDPgF0pJQTLdN", "UhONC0e0tLrj", "Xpoa", "YCNHKjVOQFwEe4MjzAzWrTTEWfFYaS", "tXFOakpgFhvHBQhEUyJ4FZAKQx0U"};
    public static final String A0K;
    public View A0F;
    public View A0G;
    public boolean A0H;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public int A03 = -1;
    public long A0C = -1;
    public int A09 = -1;
    public long A0E = -1;
    public long A0D = -1;
    public int A0A = -1;
    public int A0B = -1;
    public int A07 = -1;
    public int A08 = -1;
    public float A00 = -1.0f;
    public float A02 = -1.0f;
    public float A01 = -1.0f;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-48, -60, -124, 120, -69, -60, -63, -69, -61, -65, -51, -71, -54, -68, -84, -63, -59, -67, -110, 120, -8, -5, -25, 6, 10, 0, Ascii.VT, 0, 6, 5, -17, -16, -13, -33, -2, 2, -8, 3, -8, -2, -3, -24, -79, -70, -73, -79, -71, -110, -77, -70, -81, -57, -94, -73, -69, -77, 5, Ascii.SO, Ascii.VT, 5, Ascii.CR, -6, -4, 5, 2, -4, 4, -14, -88, -79, -82, -88, -80, -86, -87, -101, -82, -86, -68, -103, -90, -84, -69, -60, -70, -86, -65, -61, -69, -16, -7, -17, -29, -94, -85, -95, -106, -97, -88, -85, -100, -98, -91, -94, -90, -92, -91, -79, 10, Ascii.DC4, -28, Ascii.CR, 10, 4, Ascii.FF, -24, Ascii.SYN, 2, 19, 5, -26, Ascii.SI, 2, 3, Ascii.CR, 6, 5, -37, -63, -20, -37, -34, -29, -17, -19, -46, Ascii.DC4, 3, 6, Ascii.VT, Ascii.ETB, Ascii.NAK, -5, -53, -66, -68, -56, -53, -67, -62, -57, -64, 121, -62, -58, -55, -53, -66, -52, -52, -62, -56, -57, -109, 121, -59, -58, -77, -60, -58, -90, -69, -65, -73, -52, -51, -70, -53, -51, -79, 7, 8, -11, 6, 8, -19, 4, -10, -15, 1, -11};
        if (A0J[6].length() == 24) {
            throw new RuntimeException();
        }
        A0J[5] = "KWAi";
        A0I = bArr;
    }

    static {
        A02();
        A0K = C0729Lg.class.getSimpleName();
    }

    private LI A00() {
        View view;
        View view2 = this.A0G;
        if (view2 == null || (view = this.A0F) == null) {
            return LI.A0I;
        }
        if (view2 != view) {
            return LI.A0G;
        }
        if (Build.VERSION.SDK_INT < 4) {
            return LI.A0F;
        }
        Object tag = this.A0G.getTag(LI.A02);
        if (tag == null) {
            return LI.A0H;
        }
        if (!(tag instanceof LI)) {
            return LI.A0J;
        }
        return (LI) tag;
    }

    public final long A03() {
        if (A07()) {
            return System.currentTimeMillis() - this.A0C;
        }
        if (A0J[6].length() == 24) {
            throw new RuntimeException();
        }
        A0J[5] = "dmN9";
        return -1L;
    }

    public final Map<String, String> A04() {
        long j3;
        if (!this.A0H) {
            return null;
        }
        String valueOf = String.valueOf((this.A02 * this.A01) / 2.0f);
        long j10 = this.A0C;
        if (j10 > 0) {
            long j11 = this.A0D;
            if (j11 > j10) {
                j3 = j11 - j10;
                HashMap hashMap = new HashMap();
                String valueOf2 = String.valueOf(this.A04);
                String radius = A01(20, 11, 106);
                hashMap.put(radius, valueOf2);
                String valueOf3 = String.valueOf(this.A05);
                String radius2 = A01(31, 11, 98);
                hashMap.put(radius2, valueOf3);
                String valueOf4 = String.valueOf(this.A06);
                String radius3 = A01(186, 5, 96);
                hashMap.put(radius3, valueOf4);
                String valueOf5 = String.valueOf(this.A03);
                String radius4 = A01(102, 6, 16);
                hashMap.put(radius4, valueOf5);
                String A01 = A01(42, 14, 33);
                String radius5 = String.valueOf(j3);
                hashMap.put(A01, radius5);
                String valueOf6 = String.valueOf(this.A0E);
                String radius6 = A01(165, 9, 37);
                hashMap.put(radius6, valueOf6);
                String valueOf7 = String.valueOf(this.A0D);
                String radius7 = A01(82, 7, 41);
                hashMap.put(radius7, valueOf7);
                String valueOf8 = String.valueOf(this.A0A);
                String radius8 = A01(174, 6, 44);
                hashMap.put(radius8, valueOf8);
                String valueOf9 = String.valueOf(this.A0B);
                String radius9 = A01(180, 6, 103);
                hashMap.put(radius9, valueOf9);
                String valueOf10 = String.valueOf(this.A07);
                String radius10 = A01(56, 6, 117);
                hashMap.put(radius10, valueOf10);
                String valueOf11 = String.valueOf(this.A08);
                String radius11 = A01(62, 6, 108);
                hashMap.put(radius11, valueOf11);
                String valueOf12 = String.valueOf(this.A07);
                String radius12 = A01(89, 4, 94);
                hashMap.put(radius12, valueOf12);
                String valueOf13 = String.valueOf(this.A08);
                String radius13 = A01(93, 4, 16);
                hashMap.put(radius13, valueOf13);
                String valueOf14 = String.valueOf(this.A00);
                String radius14 = A01(97, 5, 12);
                hashMap.put(radius14, valueOf14);
                String radius15 = A01(129, 7, 77);
                hashMap.put(radius15, valueOf);
                String radius16 = A01(136, 7, 117);
                hashMap.put(radius16, valueOf);
                String valueOf15 = String.valueOf(A00().A05());
                String radius17 = A01(68, 14, 24);
                hashMap.put(radius17, valueOf15);
                return hashMap;
            }
        }
        j3 = -1;
        HashMap hashMap2 = new HashMap();
        String valueOf22 = String.valueOf(this.A04);
        String radius18 = A01(20, 11, 106);
        hashMap2.put(radius18, valueOf22);
        String valueOf32 = String.valueOf(this.A05);
        String radius22 = A01(31, 11, 98);
        hashMap2.put(radius22, valueOf32);
        String valueOf42 = String.valueOf(this.A06);
        String radius32 = A01(186, 5, 96);
        hashMap2.put(radius32, valueOf42);
        String valueOf52 = String.valueOf(this.A03);
        String radius42 = A01(102, 6, 16);
        hashMap2.put(radius42, valueOf52);
        String A012 = A01(42, 14, 33);
        String radius52 = String.valueOf(j3);
        hashMap2.put(A012, radius52);
        String valueOf62 = String.valueOf(this.A0E);
        String radius62 = A01(165, 9, 37);
        hashMap2.put(radius62, valueOf62);
        String valueOf72 = String.valueOf(this.A0D);
        String radius72 = A01(82, 7, 41);
        hashMap2.put(radius72, valueOf72);
        String valueOf82 = String.valueOf(this.A0A);
        String radius82 = A01(174, 6, 44);
        hashMap2.put(radius82, valueOf82);
        String valueOf92 = String.valueOf(this.A0B);
        String radius92 = A01(180, 6, 103);
        hashMap2.put(radius92, valueOf92);
        String valueOf102 = String.valueOf(this.A07);
        String radius102 = A01(56, 6, 117);
        hashMap2.put(radius102, valueOf102);
        String valueOf112 = String.valueOf(this.A08);
        String radius112 = A01(62, 6, 108);
        hashMap2.put(radius112, valueOf112);
        String valueOf122 = String.valueOf(this.A07);
        String radius122 = A01(89, 4, 94);
        hashMap2.put(radius122, valueOf122);
        String valueOf132 = String.valueOf(this.A08);
        String radius132 = A01(93, 4, 16);
        hashMap2.put(radius132, valueOf132);
        String valueOf142 = String.valueOf(this.A00);
        String radius142 = A01(97, 5, 12);
        hashMap2.put(radius142, valueOf142);
        String radius152 = A01(129, 7, 77);
        hashMap2.put(radius152, valueOf);
        String radius162 = A01(136, 7, 117);
        hashMap2.put(radius162, valueOf);
        String valueOf152 = String.valueOf(A00().A05());
        String radius172 = A01(68, 14, 24);
        hashMap2.put(radius172, valueOf152);
        return hashMap2;
    }

    public final void A05() {
        this.A0C = System.currentTimeMillis();
        if (BuildConfigApi.isDebug()) {
            String str = A01(143, 22, 44) + this.A0C;
        }
    }

    public final void A06(C1070Yn c1070Yn, MotionEvent motionEvent, View view, View view2) {
        if (view == null) {
            c1070Yn.A0E().AGu();
            return;
        }
        boolean z10 = this.A0H;
        if (A0J[5].length() != 4) {
            throw new RuntimeException();
        }
        A0J[4] = "drnDCnvAjgSKiECIW4dLYcZdZ";
        if (!z10) {
            this.A0H = true;
            InputDevice touchDevice = motionEvent.getDevice();
            if (touchDevice != null) {
                InputDevice.MotionRange motionRange = touchDevice.getMotionRange(0);
                InputDevice.MotionRange motionRange2 = touchDevice.getMotionRange(1);
                if (motionRange != null && motionRange2 != null) {
                    this.A01 = Math.min(motionRange.getRange(), motionRange2.getRange());
                }
            }
            if (this.A01 <= 0.0f) {
                this.A01 = Math.min(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationInWindow(iArr2);
        switch (motionEvent.getAction()) {
            case 0:
                this.A04 = (int) (iArr[0] / LD.A02);
                this.A05 = (int) (iArr[1] / LD.A02);
                this.A06 = (int) (view.getWidth() / LD.A02);
                this.A03 = (int) (view.getHeight() / LD.A02);
                this.A09 = 1;
                this.A0E = System.currentTimeMillis();
                this.A0A = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0]) / LD.A02);
                int touchStartYInPx = (((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1];
                this.A0B = (int) (touchStartYInPx / LD.A02);
                this.A00 = motionEvent.getPressure();
                this.A02 = motionEvent.getSize();
                this.A0G = view2;
                return;
            case 1:
            case 3:
                this.A0D = System.currentTimeMillis();
                this.A07 = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0]) / LD.A02);
                int touchEndYInPx = (((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1];
                this.A08 = (int) (touchEndYInPx / LD.A02);
                this.A0F = view2;
                return;
            case 2:
                float f10 = this.A00;
                float f11 = f10 - (f10 / this.A09);
                this.A00 = f11;
                float pressure = motionEvent.getPressure();
                int i10 = this.A09;
                this.A00 = f11 + (pressure / i10);
                float f12 = this.A02;
                float f13 = f12 - (f12 / i10);
                this.A02 = f13;
                float size = motionEvent.getSize();
                int i11 = this.A09;
                this.A02 = f13 + (size / i11);
                this.A09 = i11 + 1;
                return;
            default:
                return;
        }
    }

    public final boolean A07() {
        return this.A0C != -1;
    }

    public final boolean A08() {
        return this.A0H;
    }

    public final boolean A09(Context context) {
        boolean z10;
        int A06 = C0659Ih.A06(context);
        long A03 = A03();
        if (A06 >= 0 && A03 < A06) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (BuildConfigApi.isDebug()) {
            String str = A01(108, 21, 116) + z10 + A01(2, 18, 43) + A06 + A01(0, 2, 119) + A03;
        }
        return z10;
    }
}
