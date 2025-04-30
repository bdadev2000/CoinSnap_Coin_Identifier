package com.meta.analytics.dsp.uinode;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class KA implements InterfaceC1428Qj {
    public static String[] A06 = {"Zp1jBMTXyTngXAjRlLP1q6RZbaUI", "nHljDkT3i8Wirocu51jroGsoJHOhv1cR", "sP6X6aS", "KZL6M4", "KoOjzqZIxieUbLbPf8D", "B1jmqrSafv9jI6Lw73IRSYcL6IlnF6YH", "FLN3m70EKIfdw8", "ppmNyXlbfQKy53gkSU0tUatt7Y3PBdXb"};
    public ValueAnimator A00;
    public EnumC1427Qi A01 = EnumC1427Qi.A05;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public KA(View view, int i9, int i10, int i11) {
        this.A05 = view;
        this.A02 = i9;
        this.A04 = i10;
        this.A03 = i11;
    }

    private ValueAnimator A00(View view, int i9, int i10) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i9, i10);
        ofInt.setDuration(this.A02);
        ofInt.addUpdateListener(new C1437Qs(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            if (A06[1].charAt(28) != 'v') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[7] = "75AaLozsvbqC7RPKNa9MBDOQqsQ1eQ5U";
            strArr[5] = "oWQ9IgFva7oIaP1s8z2NxAvwjcynmKEe";
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z8) {
        if (z8) {
            this.A01 = EnumC1427Qi.A06;
            ValueAnimator A00 = A00(this.A05, this.A03, this.A04);
            this.A00 = A00;
            A00.addListener(new C1436Qr(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        AbstractC1303Lo.A0H(this.A05);
        this.A01 = EnumC1427Qi.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z8) {
        AbstractC1303Lo.A0L(this.A05);
        if (z8) {
            this.A01 = EnumC1427Qi.A04;
            ValueAnimator A00 = A00(this.A05, this.A04, this.A03);
            this.A00 = A00;
            A00.addListener(new C1435Qq(this));
            this.A00.start();
            return;
        }
        View view = this.A05;
        if (A06[1].charAt(28) != 'v') {
            throw new RuntimeException();
        }
        A06[4] = "CRQ3If4kF9c";
        view.setTranslationY(this.A03);
        this.A01 = EnumC1427Qi.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1428Qj
    public final void A3Y(boolean z8, boolean z9) {
        if (z9) {
            A08(z8);
        } else {
            A09(z8);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1428Qj
    public final EnumC1427Qi A82() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1428Qj
    public final void cancel() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
