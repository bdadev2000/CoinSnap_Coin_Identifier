package com.instagram.common.viewpoint.core;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class TJ extends AbstractC02684c<TH> {
    public final int A00;
    public final C1045Zs A01;
    public final ViewOnClickListenerC0909Ui A02;
    public final List<String> A03;

    public TJ(C1045Zs c1045Zs, List<String> screenshotUrls, int i2, ViewOnClickListenerC0909Ui viewOnClickListenerC0909Ui) {
        this.A03 = screenshotUrls;
        this.A00 = i2;
        this.A01 = c1045Zs;
        this.A02 = viewOnClickListenerC0909Ui;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC02684c
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final TH A0C(ViewGroup viewGroup, int i2) {
        TI ti = new TI(this.A01);
        if (C0608Im.A17(this.A01)) {
            ti.setOnClickListener(new ViewOnClickListenerC0798Qb(this));
        }
        return new TH(ti);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC02684c
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A0D(TH th, int i2) {
        String str = this.A03.get(i2);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i2 != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i2 >= A0E() + (-1) ? this.A00 * 4 : this.A00, 0);
        th.A0j().setLayoutParams(marginLayoutParams);
        th.A0j().A00(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02684c
    public final int A0E() {
        return this.A03.size();
    }
}
