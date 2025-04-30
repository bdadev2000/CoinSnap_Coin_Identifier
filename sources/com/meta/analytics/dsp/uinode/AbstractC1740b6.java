package com.meta.analytics.dsp.uinode;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.b6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1740b6 extends AbstractC08904c<UR> {
    public static final int A05 = (int) (LD.A02 * 4.0f);
    public C1B A00;
    public final List<V2> A01;
    public final int A02;
    public final C1636Yn A03;
    public final RD A04 = new C1742b8(this);

    public AbstractC1740b6(C3C c3c, List<V2> list, C1636Yn c1636Yn) {
        this.A03 = c1636Yn;
        this.A02 = c3c.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i10 = this.A02;
        if (i9 == 0) {
            i10 *= 2;
        }
        marginLayoutParams.setMargins(i10, 0, i9 >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08904c
    public final int A0E() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i9) {
        V2 v22 = this.A01.get(i9);
        JP adCoverImage = v22.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC1513Tq A04 = new AsyncTaskC1513Tq(imageView, this.A03).A04();
            A04.A06(new C1741b7(this, i9, v22));
            A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(C1B c1b) {
        this.A00 = c1b;
    }

    public void A0H(UR ur, int i9) {
        ur.A0j().setLayoutParams(A02(i9));
    }
}
