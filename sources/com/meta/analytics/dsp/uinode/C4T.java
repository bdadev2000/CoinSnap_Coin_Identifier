package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4T {
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public boolean A09;
    public boolean A0B = true;
    public int A02 = 0;
    public boolean A0A = false;
    public List<AnonymousClass56> A08 = null;

    private View A00() {
        int size = this.A08.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view = this.A08.get(i9).A0H;
            C09034p c09034p = (C09034p) view.getLayoutParams();
            if (!c09034p.A02()) {
                int i10 = this.A01;
                int size2 = c09034p.A00();
                if (i10 == size2) {
                    A02(view);
                    return view;
                }
            }
        }
        return null;
    }

    private final View A01(View view) {
        int size = this.A08.size();
        View view2 = null;
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = this.A08.get(i10).A0H;
            C09034p c09034p = (C09034p) view3.getLayoutParams();
            if (view3 != view && !c09034p.A02()) {
                int A00 = c09034p.A00();
                int size2 = this.A01;
                int i11 = A00 - size2;
                int size3 = this.A03;
                int i12 = i11 * size3;
                if (i12 >= 0 && i12 < i9) {
                    view2 = view3;
                    i9 = i12;
                    if (i12 == 0) {
                        break;
                    }
                }
            }
        }
        return view2;
    }

    private final void A02(View view) {
        View closest = A01(view);
        if (closest == null) {
            this.A01 = -1;
        } else {
            this.A01 = ((C09034p) closest.getLayoutParams()).A00();
        }
    }

    public final View A03(C09094w c09094w) {
        if (this.A08 != null) {
            return A00();
        }
        View A0G = c09094w.A0G(this.A01);
        this.A01 += this.A03;
        return A0G;
    }

    public final void A04() {
        A02(null);
    }

    public final boolean A05(AnonymousClass53 anonymousClass53) {
        int i9 = this.A01;
        return i9 >= 0 && i9 < anonymousClass53.A03();
    }
}
