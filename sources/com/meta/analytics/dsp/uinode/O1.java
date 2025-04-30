package com.meta.analytics.dsp.uinode;

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
    public final AbstractC1739b5 A01;
    public final C1636Yn A02;
    public final MC A03;
    public final O0 A04;
    public final SA A05;
    public final View[] A06;

    public O1(OP op, AbstractC1739b5 abstractC1739b5, SA sa, KP kp, AbstractC1355No abstractC1355No, MC mc, O0 o02) {
        this(op, abstractC1739b5, sa, mc, o02, kp, abstractC1355No);
    }

    public O1(OP op, AbstractC1739b5 abstractC1739b5, SA sa, MC mc, O0 o02, View... viewArr) {
        this(op.A05(), op.A08(), abstractC1739b5, sa, mc, o02, viewArr);
    }

    public O1(C1636Yn c1636Yn, MB mb, AbstractC1739b5 abstractC1739b5, SA sa, MC mc, O0 o02, View... viewArr) {
        super(c1636Yn);
        this.A02 = c1636Yn;
        this.A00 = mb;
        this.A01 = abstractC1739b5;
        this.A06 = viewArr;
        this.A03 = mc;
        this.A05 = sa;
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
        MQ mq = new MQ(this.A02, -1, ViewCompat.MEASURED_STATE_MASK, title, null, this.A01.A0z().A04(), this.A01.A0z().A03(), AbstractC1312Lx.A01(EnumC1311Lw.REWARD_ICON));
        mq.A02.setOnClickListener(new ViewOnClickListenerC1365Ny(this));
        mq.A01.setOnClickListener(new ViewOnClickListenerC1366Nz(this));
        addView(mq, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        SA sa = this.A05;
        if (sa != null) {
            sa.A0a(QH.A07);
        }
        this.A04.AAh();
        if (!this.A01.A0x().A0O()) {
            this.A01.A15(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        SA sa = this.A05;
        if (sa != null && !sa.A0j()) {
            this.A05.A0f(false, false, 11);
            AbstractC1303Lo.A0N(this.A05, 4);
        }
        MB mb = this.A00;
        String[] strArr = A07;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A07[0] = "vGH3jzSu";
        if (mb != null) {
            AbstractC1303Lo.A0H(mb);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            AbstractC1303Lo.A0N(view, 4);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        viewGroup.addView(this, layoutParams);
        this.A04.ACC();
    }
}
