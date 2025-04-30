package com.meta.analytics.dsp.uinode;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public final class KI implements InterfaceC1428Qj {
    public int A00;
    public ValueAnimator A01;
    public EnumC1427Qi A02 = EnumC1427Qi.A05;
    public final int A03;
    public final int A04;
    public final View A05;

    public KI(View view, int i9, int i10, int i11) {
        this.A05 = view;
        this.A03 = i9;
        this.A00 = i10;
        this.A04 = i11;
    }

    private ValueAnimator A00(int i9, int i10, View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i9, i10);
        ofInt.setDuration(this.A03);
        ofInt.addUpdateListener(new C1431Qm(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z8) {
        if (z8) {
            this.A02 = EnumC1427Qi.A06;
            ValueAnimator A00 = A00(this.A00, this.A04, this.A05);
            this.A01 = A00;
            A00.addListener(new C1430Ql(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        AbstractC1303Lo.A0H(this.A05);
        this.A02 = EnumC1427Qi.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z8) {
        AbstractC1303Lo.A0L(this.A05);
        if (z8) {
            this.A02 = EnumC1427Qi.A04;
            ValueAnimator A00 = A00(this.A04, this.A00, this.A05);
            this.A01 = A00;
            A00.addListener(new C1429Qk(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC1427Qi.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1428Qj
    public final void A3Y(boolean z8, boolean z9) {
        if (z9) {
            A07(z8);
        } else {
            A08(z8);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1428Qj
    public final EnumC1427Qi A82() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1428Qj
    public final void cancel() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
