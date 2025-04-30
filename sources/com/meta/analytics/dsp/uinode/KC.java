package com.meta.analytics.dsp.uinode;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class KC implements InterfaceC1428Qj {
    public static byte[] A06;
    public static String[] A07 = {"A7BI5", "gKWOMBrJHuMwvM90e1kQxbLVjOWHbC33", "UYN9ptwwhG6kseDSIUjMW4tKOOJXD2Z7", "Ja75eMPfNEu2gmMNMrA6", "IMMQ3U1D8CAOequczoeO", "aOtgKGua3vuGYyvCOzm8c8DJStBVo0w", "j", "V23k2coZlnHKKs"};
    public ValueAnimator A00;
    public EnumC1427Qi A01 = EnumC1427Qi.A05;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public static String A04(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{40, Ascii.EM, 44, 40, -9, 35, 32, 35, 38};
    }

    static {
        A05();
    }

    public KC(View view, int i9, int i10, int i11) {
        this.A02 = i9;
        this.A05 = view;
        this.A04 = i10;
        this.A03 = i11;
    }

    private void A06(int i9, int i10) {
        this.A01 = i9 == this.A04 ? EnumC1427Qi.A04 : EnumC1427Qi.A06;
        ObjectAnimator ofInt = ObjectAnimator.ofInt((TextView) this.A05, A04(0, 9, 82), i9, i10);
        this.A00 = ofInt;
        ofInt.setEvaluator(new ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new C1434Qp(this, i9, i10));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i9, int i10, boolean z8) {
        if (z8) {
            A06(i9, i10);
            return;
        }
        View view = this.A05;
        if (A07[4].length() != 20) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[7] = "Y4rCa4lywlEdVv";
        strArr[0] = "Hdg5N";
        ((TextView) view).setTextColor(i10);
        this.A01 = i10 == this.A03 ? EnumC1427Qi.A03 : EnumC1427Qi.A05;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1428Qj
    public final void A3Y(boolean z8, boolean z9) {
        int endColor = z9 ? this.A03 : this.A04;
        int startColor = z9 ? this.A04 : this.A03;
        A07(endColor, startColor, z8);
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
