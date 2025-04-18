package com.facebook.ads.redexgen.uinode;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SM extends AbstractC03244c<SK> {
    public final int A00;
    public final C1070Yn A01;
    public final ViewOnClickListenerC0942Tl A02;
    public final List<String> A03;

    public SM(C1070Yn c1070Yn, List<String> screenshotUrls, int i10, ViewOnClickListenerC0942Tl viewOnClickListenerC0942Tl) {
        this.A03 = screenshotUrls;
        this.A00 = i10;
        this.A01 = c1070Yn;
        this.A02 = viewOnClickListenerC0942Tl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC03244c
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final SK A0C(ViewGroup viewGroup, int i10) {
        SL sl = new SL(this.A01);
        if (C0659Ih.A12(this.A01)) {
            sl.setOnClickListener(new Q6(this));
        }
        return new SK(sl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC03244c
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A0D(SK sk, int i10) {
        String str = this.A03.get(i10);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int leftMargin = this.A00;
        int i11 = leftMargin * 4;
        if (i10 == 0) {
            leftMargin = i11;
        }
        marginLayoutParams.setMargins(leftMargin, 0, i10 >= A0E() + (-1) ? this.A00 * 4 : this.A00, 0);
        sk.A0j().setLayoutParams(marginLayoutParams);
        sk.A0j().A00(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03244c
    public final int A0E() {
        return this.A03.size();
    }
}
