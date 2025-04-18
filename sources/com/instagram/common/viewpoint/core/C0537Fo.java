package com.instagram.common.viewpoint.core;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0537Fo extends AbstractC1188cE {
    public final C1045Zs A00;

    public C0537Fo(C3C c3c, List<W7> list, C1045Zs c1045Zs) {
        super(c3c, list, c1045Zs);
        this.A00 = c1045Zs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC02684c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final VW A0C(ViewGroup viewGroup, int i2) {
        return new VW(new C0695Mc(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02684c
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final void A0D(VW vw, int i2) {
        super.A0D(vw, i2);
        C0695Mc c0695Mc = (C0695Mc) vw.A0j();
        C0718Mz imageView = (C0718Mz) c0695Mc.getImageCardView();
        imageView.setImageDrawable(null);
        A0F(imageView, i2);
        W7 childAd = ((AbstractC1188cE) this).A01.get(i2);
        childAd.A11().A0K(this.A00);
        childAd.A1N(c0695Mc, c0695Mc);
    }
}
