package com.meta.analytics.dsp.uinode;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SM extends AbstractC08904c<SK> {
    public final int A00;
    public final C1636Yn A01;
    public final ViewOnClickListenerC1508Tl A02;
    public final List<String> A03;

    public SM(C1636Yn c1636Yn, List<String> screenshotUrls, int i9, ViewOnClickListenerC1508Tl viewOnClickListenerC1508Tl) {
        this.A03 = screenshotUrls;
        this.A00 = i9;
        this.A01 = c1636Yn;
        this.A02 = viewOnClickListenerC1508Tl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC08904c
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final SK A0C(ViewGroup viewGroup, int i9) {
        SL sl = new SL(this.A01);
        if (C1225Ih.A12(this.A01)) {
            sl.setOnClickListener(new Q6(this));
        }
        return new SK(sl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC08904c
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A0D(SK sk, int i9) {
        String str = this.A03.get(i9);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int leftMargin = this.A00;
        int i10 = leftMargin * 4;
        if (i9 == 0) {
            leftMargin = i10;
        }
        marginLayoutParams.setMargins(leftMargin, 0, i9 >= A0E() + (-1) ? this.A00 * 4 : this.A00, 0);
        sk.A0j().setLayoutParams(marginLayoutParams);
        sk.A0j().A00(str);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08904c
    public final int A0E() {
        return this.A03.size();
    }
}
