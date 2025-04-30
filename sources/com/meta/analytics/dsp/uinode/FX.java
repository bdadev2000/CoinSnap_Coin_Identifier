package com.meta.analytics.dsp.uinode;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class FX extends AbstractC1740b6 {
    public final C1636Yn A00;
    public final JR A01;

    public FX(C1636Yn c1636Yn, C3C c3c, List<V2> list, JR jr) {
        super(c3c, list, c1636Yn);
        this.A00 = c1636Yn;
        this.A01 = jr == null ? new JR() : jr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC08904c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final UR A0C(ViewGroup viewGroup, int i9) {
        return new UR(new MI(this.A00, this.A01));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08904c
    /* renamed from: A0H */
    public final void A0D(UR ur, int i9) {
        super.A0D(ur, i9);
        MI mi = (MI) ur.A0j();
        A0F(mi.getImageCardView(), i9);
        if (((AbstractC1740b6) this).A01.get(i9) != null) {
            mi.setTitle(((AbstractC1740b6) this).A01.get(i9).getAdHeadline());
            mi.setSubtitle(((AbstractC1740b6) this).A01.get(i9).getAdLinkDescription());
            mi.setButtonText(((AbstractC1740b6) this).A01.get(i9).getAdCallToAction());
        }
        V2 v22 = ((AbstractC1740b6) this).A01.get(i9);
        ArrayList arrayList = new ArrayList();
        arrayList.add(mi);
        v22.A1O(mi, mi, arrayList);
    }
}
