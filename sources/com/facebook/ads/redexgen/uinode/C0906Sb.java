package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0906Sb extends AbstractC03414t {
    public static byte[] A0H;
    public static String[] A0I = {"vVts3290hN8iYOphvTtUHsw8p", "g", "QXZRYfiopoOIgyOb", "uRY3EBcOhcPzIFCW", "1yhQGC5wOot73mjsntHrCCOy6H7", "ngPHprqJPXgJBcmGEhNrmzVf2B4dA5Oh", "DCeBbFrEMIUsiq6", "addqTveDrmk"};
    public InterfaceC0816Op A02;
    public RE A04;
    public List<C0842Pp> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C1096Zo A0C;
    public final AnonymousClass51 A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final InterfaceC0820Ot A0F = new C0909Se(this);
    public InterfaceC0818Or A03 = new C0908Sd(this);
    public final InterfaceC0819Os A0E = new C0907Sc(this);

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0H = new byte[]{-26, -6, -7, -12, 4, -11, -15, -26, -2, 4, -22, -13, -26, -25, -15, -22, -23, 4, -11, -26, -9, -26, -14, 7, 17, Ascii.GS, 4, 7, Ascii.DLE, 17, Ascii.DC2, Ascii.GS, Ascii.DC4, 7, 2, 3, Ascii.CR, Ascii.GS, Ascii.SO, -1, Ascii.DLE, -1, Ascii.VT, -5, -12, -15, -6, -14, -22, 4, -15, -22, -5, -22, -15, 4, -11, -26, -9, -26, -14};
    }

    static {
        A08();
    }

    public C0906Sb(C03143r c03143r, int i10, List<C0842Pp> list, RE re2, Bundle bundle) {
        this.A0C = c03143r.getLayoutManager();
        this.A0A = i10;
        this.A05 = list;
        this.A04 = re2;
        this.A0D = new C1095Zn(c03143r.getContext());
        this.A0B = c03143r.getContext();
        c03143r.A1f(this);
        A0D(bundle);
    }

    private TS A03(int i10, int i11) {
        return A04(i10, i11, true);
    }

    private TS A04(int i10, int i11, boolean z10) {
        TS ts = null;
        while (i10 <= i11) {
            TS ts2 = (TS) this.A0C.A1m(i10);
            if (ts2 == null || ts2.A17()) {
                return null;
            }
            boolean A0a = A0a(ts2);
            int i12 = A0I[2].length();
            if (i12 != 16) {
                throw new RuntimeException();
            }
            A0I[0] = "";
            if (ts == null && ts2.A18() && A0a && !this.A0G.contains(Integer.valueOf(i10)) && (!z10 || A0I(ts2, this.A0A))) {
                ts = ts2;
            }
            if (ts2.A18() && !A0a) {
                A0C(i10, false);
            }
            i10++;
        }
        return ts;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A24();
        int firstVisibleItem = this.A0C.A25();
        TS A03 = A03(lastVisibleItem, firstVisibleItem);
        if (A03 != null) {
            A03.A15();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int A23 = this.A0C.A23();
        if (A23 != -1) {
            int curPos = this.A05.size();
            if (A23 < curPos - 1) {
                int curPos2 = A23 + 1;
                A0U(curPos2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i10) {
        TS A04 = A04(i10 + 1, this.A0C.A25(), false);
        if (A04 != null) {
            A04.A15();
            A0U(((Integer) A04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i10, int i11) {
        while (i10 <= i11) {
            A0T(i10);
            i10++;
        }
    }

    private final void A0B(int i10, int i11) {
        A0S(i10);
        A0S(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i10, boolean z10) {
        if (z10) {
            this.A0G.add(Integer.valueOf(i10));
        } else {
            this.A0G.remove(Integer.valueOf(i10));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 39), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 39), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 64), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return this.A0A == 1;
    }

    public static boolean A0I(OL ol, int i10) {
        int allowedAreaMaxX;
        int furthestX;
        if (i10 != 2) {
            allowedAreaMaxX = (int) (((ol.getWidth() + LD.A03.widthPixels) * 1.3f) / 2.0f);
        } else {
            int i11 = LD.A03.widthPixels;
            if (A0I[5].charAt(29) != '5') {
                throw new RuntimeException();
            }
            A0I[0] = "Sny8hSa0LYjBAej7q";
            allowedAreaMaxX = i11 - 1;
        }
        if (i10 == 2) {
            furthestX = 1;
        } else {
            int i12 = LD.A03.widthPixels;
            int allowedAreaMinX = ol.getWidth();
            furthestX = (int) (((i12 - allowedAreaMinX) * 0.7f) / 2.0f);
        }
        float x10 = ol.getX();
        int allowedAreaMinX2 = ol.getWidth();
        return ((int) (x10 + ((float) allowedAreaMinX2))) <= allowedAreaMaxX && ol.getX() >= ((float) furthestX);
    }

    private boolean A0J(TS ts) {
        if (!this.A08 || !ts.A18()) {
            return false;
        }
        this.A08 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03414t
    public void A0L(C0553Eb c0553Eb, int i10) {
        super.A0L(c0553Eb, i10);
        if (i10 == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03414t
    public void A0M(C0553Eb c0553Eb, int i10, int i11) {
        super.A0M(c0553Eb, i10, i11);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A24();
        int firstVisibleItem = this.A0C.A25();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0V(lastVisibleItem, firstVisibleItem, i10);
    }

    public final InterfaceC0818Or A0N() {
        return this.A03;
    }

    public final InterfaceC0819Os A0O() {
        return this.A0E;
    }

    public final InterfaceC0820Ot A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int i10 = this.A0C.A25();
        for (int A24 = this.A0C.A24(); A24 <= i10 && A24 >= 0; A24++) {
            TS ts = (TS) this.A0C.A1m(A24);
            if (ts != null && ts.A17()) {
                this.A01 = A24;
                ts.A14();
                return;
            }
        }
    }

    public final void A0R() {
        TS ts = (TS) this.A0C.A1m(this.A01);
        if (ts != null && this.A01 >= 0) {
            ts.A15();
        }
    }

    public final void A0S(int i10) {
        TS ts = (TS) this.A0C.A1m(i10);
        if (ts == null || A0a(ts)) {
            return;
        }
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[0] = "Vxamqv9qm4zlsVVB8";
        A0Z(ts, false);
    }

    public final void A0T(int i10) {
        List<C0842Pp> list;
        TS ts = (TS) this.A0C.A1m(i10);
        if (ts == null) {
            return;
        }
        if (A0a(ts)) {
            A0Z(ts, true);
        }
        if (A0J(ts) && (list = this.A05) != null) {
            this.A0F.setVolume(list.get(((Integer) ts.getTag(-1593835536)).intValue()).A03().A0D().A09() ? 0.0f : 1.0f);
        }
    }

    public final void A0U(int i10) {
        this.A0D.A0A(i10);
        this.A0C.A1L(this.A0D);
    }

    public final void A0V(int i10, int i11, int i12) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A23();
        if (recomputeFrom == -1) {
            recomputeFrom = i12 < 0 ? i10 : i11;
        }
        this.A02.AGp(recomputeFrom);
    }

    public final void A0W(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 39), this.A00);
        bundle.putBoolean(A05(0, 23, 39), this.A07);
        bundle.putBoolean(A05(23, 20, 64), this.A08);
    }

    public void A0X(View view, boolean z10) {
        view.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public final void A0Y(InterfaceC0816Op interfaceC0816Op) {
        this.A02 = interfaceC0816Op;
    }

    public void A0Z(TS ts, boolean z10) {
        if (A0H()) {
            A0X(ts, z10);
        }
        if (z10) {
            return;
        }
        boolean A17 = ts.A17();
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[2] = "slnyAJQBNPORwedJ";
        if (A17) {
            ts.A14();
        }
    }

    public boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
