package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.facebook.ads.RewardData;

/* loaded from: assets/audience_network.dex */
public final class O1 extends FrameLayout {
    public static String[] A07 = {"Lu0oG19N", "JNY", "Ev6F9eDhg42RHlCeRuJfEtiFO07AluFn", "qSbaO4FE34QcNqD1YWxCxyT8wr5s9kWw", "hZddA1hSD7Y", "v9TnLSaOxYneacolptRVdRHaZQ0ab06L", "iyW9tyIIQvF7WQz3LOxNHXxa074IcWbN", "vzh"};
    public MB A00;
    public final AbstractC1173b5 A01;
    public final C1070Yn A02;
    public final MC A03;
    public final O0 A04;
    public final SA A05;
    public final View[] A06;

    public O1(OP op, AbstractC1173b5 abstractC1173b5, SA sa2, KP kp, AbstractC0789No abstractC0789No, MC mc2, O0 o02) {
        this(op, abstractC1173b5, sa2, mc2, o02, kp, abstractC0789No);
    }

    public O1(OP op, AbstractC1173b5 abstractC1173b5, SA sa2, MC mc2, O0 o02, View... viewArr) {
        this(op.A05(), op.A08(), abstractC1173b5, sa2, mc2, o02, viewArr);
    }

    public O1(C1070Yn c1070Yn, MB mb2, AbstractC1173b5 abstractC1173b5, SA sa2, MC mc2, O0 o02, View... viewArr) {
        super(c1070Yn);
        this.A02 = c1070Yn;
        this.A00 = mb2;
        this.A01 = abstractC1173b5;
        this.A06 = viewArr;
        this.A03 = mc2;
        this.A05 = sa2;
        this.A04 = o02;
        A03();
    }

    private void A03() {
        String title;
        RewardData A0J = this.A01.A0J();
        if (A0J == null) {
            title = this.A01.A0z().A05();
        } else {
            title = this.A01.A0z().A06(A0J.getCurrency(), A0J.getQuantity());
        }
        MQ mq = new MQ(this.A02, -1, ViewCompat.MEASURED_STATE_MASK, title, null, this.A01.A0z().A04(), this.A01.A0z().A03(), AbstractC0746Lx.A01(EnumC0745Lw.REWARD_ICON));
        mq.A02.setOnClickListener(new ViewOnClickListenerC0799Ny(this));
        mq.A01.setOnClickListener(new ViewOnClickListenerC0800Nz(this));
        addView(mq, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        SA sa2 = this.A05;
        if (sa2 != null) {
            sa2.A0a(QH.A07);
        }
        this.A04.AAh();
        if (!this.A01.A0x().A0O()) {
            this.A01.A15(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        SA sa2 = this.A05;
        if (sa2 != null && !sa2.A0j()) {
            this.A05.A0f(false, false, 11);
            AbstractC0737Lo.A0N(this.A05, 4);
        }
        MB mb2 = this.A00;
        String[] strArr = A07;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A07[0] = "vGH3jzSu";
        if (mb2 != null) {
            AbstractC0737Lo.A0H(mb2);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            AbstractC0737Lo.A0N(view, 4);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        viewGroup.addView(this, layoutParams);
        this.A04.ACC();
    }
}
