package com.facebook.ads.redexgen.uinode;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class KC implements InterfaceC0862Qj {
    public static byte[] A06;
    public static String[] A07 = {"A7BI5", "gKWOMBrJHuMwvM90e1kQxbLVjOWHbC33", "UYN9ptwwhG6kseDSIUjMW4tKOOJXD2Z7", "Ja75eMPfNEu2gmMNMrA6", "IMMQ3U1D8CAOequczoeO", "aOtgKGua3vuGYyvCOzm8c8DJStBVo0w", "j", "V23k2coZlnHKKs"};
    public ValueAnimator A00;
    public EnumC0861Qi A01 = EnumC0861Qi.A05;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{40, Ascii.EM, 44, 40, -9, 35, 32, 35, 38};
    }

    static {
        A05();
    }

    public KC(View view, int i10, int i11, int i12) {
        this.A02 = i10;
        this.A05 = view;
        this.A04 = i11;
        this.A03 = i12;
    }

    private void A06(int i10, int i11) {
        this.A01 = i10 == this.A04 ? EnumC0861Qi.A04 : EnumC0861Qi.A06;
        ObjectAnimator ofInt = ObjectAnimator.ofInt((TextView) this.A05, A04(0, 9, 82), i10, i11);
        this.A00 = ofInt;
        ofInt.setEvaluator(new ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new C0868Qp(this, i10, i11));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i10, int i11, boolean z10) {
        if (z10) {
            A06(i10, i11);
            return;
        }
        View view = this.A05;
        if (A07[4].length() != 20) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[7] = "Y4rCa4lywlEdVv";
        strArr[0] = "Hdg5N";
        ((TextView) view).setTextColor(i11);
        this.A01 = i11 == this.A03 ? EnumC0861Qi.A03 : EnumC0861Qi.A05;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0862Qj
    public final void A3Y(boolean z10, boolean z11) {
        int endColor = z11 ? this.A03 : this.A04;
        int startColor = z11 ? this.A04 : this.A03;
        A07(endColor, startColor, z10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0862Qj
    public final EnumC0861Qi A82() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0862Qj
    public final void cancel() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
