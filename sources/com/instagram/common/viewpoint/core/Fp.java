package com.instagram.common.viewpoint.core;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Fp extends AbstractC1188cE {
    public final C1045Zs A00;
    public final JW A01;

    public Fp(C1045Zs c1045Zs, C3C c3c, List<W7> list, JW jw) {
        super(c3c, list, c1045Zs);
        this.A00 = c1045Zs;
        this.A01 = jw == null ? new JW() : jw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC02684c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final VW A0C(ViewGroup viewGroup, int i2) {
        return new VW(new MX(this.A00, this.A01));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02684c
    /* renamed from: A0H */
    public final void A0D(VW vw, int i2) {
        super.A0D(vw, i2);
        MX mx = (MX) vw.A0j();
        A0F(mx.getImageCardView(), i2);
        if (((AbstractC1188cE) this).A01.get(i2) != null) {
            mx.setTitle(((AbstractC1188cE) this).A01.get(i2).getAdHeadline());
            mx.setSubtitle(((AbstractC1188cE) this).A01.get(i2).getAdLinkDescription());
            mx.setButtonText(((AbstractC1188cE) this).A01.get(i2).getAdCallToAction());
        }
        W7 w7 = ((AbstractC1188cE) this).A01.get(i2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(mx);
        w7.A1O(mx, mx, arrayList);
    }
}
