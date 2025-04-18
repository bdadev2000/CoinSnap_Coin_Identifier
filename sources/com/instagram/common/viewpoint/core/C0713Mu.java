package com.instagram.common.viewpoint.core;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0713Mu implements RF {
    public static byte[] A06;
    public ValueAnimator A00;
    public RE A01 = RE.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    static {
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{49, 32, 61, 49, 6, 42, 41, 42, 55};
    }

    public C0713Mu(View view, int i2, int i3, int i4) {
        this.A02 = i2;
        this.A05 = view;
        this.A04 = i3;
        this.A03 = i4;
    }

    private void A06(int i2, int i3) {
        this.A01 = i2 == this.A04 ? RE.A03 : RE.A05;
        this.A00 = ObjectAnimator.ofInt((TextView) this.A05, A04(0, 9, 85), i2, i3);
        this.A00.setEvaluator(new ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new RL(this, i2, i3));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i2, int i3, boolean z2) {
        if (z2) {
            A06(i2, i3);
        } else {
            ((TextView) this.A05).setTextColor(i3);
            this.A01 = i3 == this.A03 ? RE.A02 : RE.A04;
        }
    }

    @Override // com.instagram.common.viewpoint.core.RF
    public final void A3u(boolean z2, boolean z3) {
        int endColor = z3 ? this.A03 : this.A04;
        int startColor = z3 ? this.A04 : this.A03;
        A07(endColor, startColor, z2);
    }

    @Override // com.instagram.common.viewpoint.core.RF
    public final RE A8Q() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.RF
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
