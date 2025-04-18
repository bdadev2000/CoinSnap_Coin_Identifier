package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OP implements View.OnClickListener {
    public final /* synthetic */ OS A00;

    public OP(OS os) {
        this.A00 = os;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OR or;
        MQ mq;
        View[] viewArr;
        T7 t7;
        T7 t72;
        T7 t73;
        MQ mq2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            or = this.A00.A04;
            or.ACc();
            mq = this.A00.A00;
            if (mq != null) {
                mq2 = this.A00.A00;
                M3.A0L(mq2);
            }
            viewArr = this.A00.A06;
            for (View view2 : viewArr) {
                M3.A0N(view2, 0);
            }
            M3.A0J(this.A00);
            t7 = this.A00.A05;
            if (t7 == null) {
                return;
            }
            t72 = this.A00.A05;
            M3.A0N(t72, 0);
            t73 = this.A00.A05;
            t73.A0b(EnumC0815Qs.A02, 14);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
