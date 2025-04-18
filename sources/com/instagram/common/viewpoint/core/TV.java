package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public class TV extends AbstractC02854t {
    public static byte[] A0H;
    public static String[] A0I = {"oHxG", "", "w7XeyG7wcXlBDThCLG4YobF5JePdGcu8", "IQ8LgqWvoXOpUTXgnww89j6rU6uuZ1nj", "", "WKMwHhIum9", "0nm7H4VWCUBWNiJwCQAonSVvBZFyt", "hLsDwSpuFLAE"};
    public PE A02;
    public C0833Rk A04;
    public List<QK> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C1107at A0C;
    public final AnonymousClass51 A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final PI A0F = new TY(this);
    public PG A03 = new TX(this);
    public final PH A0E = new TW(this);

    public static String A05(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        String[] strArr = A0I;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[7] = "Cbp585p0FHy9";
        strArr2[6] = "QC7w158vCCR5KGktiGCBodiqPhNZq";
        A0H = new byte[]{-122, -102, -103, -108, -92, -107, -111, -122, -98, -92, -118, -109, -122, -121, -111, -118, -119, -92, -107, -122, -105, -122, -110, 81, 91, 103, 78, 81, 90, 91, 92, 103, 94, 81, 76, 77, 87, 103, 88, 73, 90, 73, 85, -51, -58, -61, -52, -60, -68, -42, -61, -68, -51, -68, -61, -42, -57, -72, -55, -72, -60};
    }

    static {
        A08();
    }

    public TV(C02583r c02583r, int i2, List<QK> list, C0833Rk c0833Rk, Bundle bundle) {
        this.A0C = c02583r.getLayoutManager();
        this.A0A = i2;
        this.A05 = list;
        this.A04 = c0833Rk;
        this.A0D = new C1106as(c02583r.getContext());
        this.A0B = c02583r.getContext();
        c02583r.A1f(this);
        A0D(bundle);
    }

    private UO A03(int i2, int i3) {
        return A04(i2, i3, true);
    }

    private UO A04(int i2, int i3, boolean z2) {
        UO uo = null;
        while (i2 <= i3) {
            UO uo2 = (UO) this.A0C.A1m(i2);
            if (uo2 == null || uo2.A17()) {
                return null;
            }
            boolean A0a = A0a(uo2);
            if (uo == null && uo2.A18() && A0a && !this.A0G.contains(Integer.valueOf(i2)) && (!z2 || A0I(uo2, this.A0A))) {
                uo = uo2;
            }
            if (uo2.A18() && !A0a) {
                A0C(i2, false);
            }
            i2++;
        }
        return uo;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A24();
        int firstVisibleItem = this.A0C.A25();
        UO A03 = A03(lastVisibleItem, firstVisibleItem);
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
    public void A09(int i2) {
        UO A04 = A04(i2 + 1, this.A0C.A25(), false);
        if (A04 != null) {
            A04.A15();
            A0U(((Integer) A04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i2, int i3) {
        while (i2 <= i3) {
            A0T(i2);
            i2++;
        }
    }

    private final void A0B(int i2, int i3) {
        A0S(i2);
        A0S(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i2, boolean z2) {
        if (z2) {
            this.A0G.add(Integer.valueOf(i2));
        } else {
            this.A0G.remove(Integer.valueOf(i2));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 112), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 62), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 1), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return this.A0A == 1;
    }

    public static boolean A0I(AbstractC0753Oi abstractC0753Oi, int i2) {
        int allowedAreaMaxX;
        int furthestX;
        if (i2 == 2) {
            allowedAreaMaxX = LP.A03.widthPixels - 1;
        } else {
            int width = abstractC0753Oi.getWidth();
            int allowedAreaMinX = LP.A03.widthPixels;
            allowedAreaMaxX = (int) (((width + allowedAreaMinX) * 1.3f) / 2.0f);
        }
        if (i2 == 2) {
            furthestX = 1;
        } else {
            int i3 = LP.A03.widthPixels;
            int allowedAreaMinX2 = abstractC0753Oi.getWidth();
            furthestX = (int) (((i3 - allowedAreaMinX2) * 0.7f) / 2.0f);
        }
        float x = abstractC0753Oi.getX();
        int allowedAreaMinX3 = abstractC0753Oi.getWidth();
        return ((int) (x + ((float) allowedAreaMinX3))) <= allowedAreaMaxX && abstractC0753Oi.getX() >= ((float) furthestX);
    }

    private boolean A0J(UO uo) {
        if (!this.A08 || !uo.A18()) {
            return false;
        }
        this.A08 = false;
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02854t
    public void A0L(FL fl, int i2) {
        super.A0L(fl, i2);
        if (i2 == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02854t
    public void A0M(FL fl, int i2, int i3) {
        super.A0M(fl, i2, i3);
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
        A0V(lastVisibleItem, firstVisibleItem, i2);
    }

    public final PG A0N() {
        return this.A03;
    }

    public final PH A0O() {
        return this.A0E;
    }

    public final PI A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int A25 = this.A0C.A25();
        for (int A24 = this.A0C.A24(); A24 <= A25 && A24 >= 0; A24++) {
            UO card = (UO) this.A0C.A1m(A24);
            String[] strArr = A0I;
            String str = strArr[1];
            String str2 = strArr[4];
            int lastPos = str.length();
            int firstPos = str2.length();
            if (lastPos != firstPos) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[0] = "4n0r";
            strArr2[5] = "UAml839wpr";
            if (card != null && card.A17()) {
                this.A01 = A24;
                card.A14();
                return;
            }
        }
    }

    public final void A0R() {
        UO uo = (UO) this.A0C.A1m(this.A01);
        if (uo != null && this.A01 >= 0) {
            uo.A15();
        }
    }

    public final void A0S(int i2) {
        UO uo = (UO) this.A0C.A1m(i2);
        if (uo != null && !A0a(uo)) {
            A0Z(uo, false);
        }
    }

    public final void A0T(int i2) {
        UO uo = (UO) this.A0C.A1m(i2);
        if (uo == null) {
            return;
        }
        if (A0a(uo)) {
            A0Z(uo, true);
        }
        if (A0J(uo) && this.A05 != null) {
            this.A0F.setVolume(this.A05.get(((Integer) uo.getTag(-1593835536)).intValue()).A03().A0E().A09() ? 0.0f : 1.0f);
        }
    }

    public final void A0U(int i2) {
        this.A0D.A0A(i2);
        this.A0C.A1L(this.A0D);
    }

    public final void A0V(int i2, int i3, int i4) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A23();
        if (recomputeFrom == -1) {
            recomputeFrom = i4 < 0 ? i2 : i3;
        }
        this.A02.AHH(recomputeFrom);
    }

    public final void A0W(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 112), this.A00);
        bundle.putBoolean(A05(0, 23, 62), this.A07);
        bundle.putBoolean(A05(23, 20, 1), this.A08);
    }

    public void A0X(View view, boolean z2) {
        view.setAlpha(z2 ? 1.0f : 0.5f);
    }

    public final void A0Y(PE pe) {
        this.A02 = pe;
    }

    public void A0Z(UO uo, boolean z2) {
        if (A0H()) {
            A0X(uo, z2);
        }
        if (!z2 && uo.A17()) {
            uo.A14();
        }
    }

    public boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
