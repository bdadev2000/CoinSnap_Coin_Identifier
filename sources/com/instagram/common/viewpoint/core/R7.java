package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class R7 implements View.OnClickListener {
    public final /* synthetic */ C0742Nx A00;

    public R7(C0742Nx c0742Nx) {
        this.A00 = c0742Nx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JF jf;
        C1045Zs c1045Zs;
        T7 t7;
        boolean A07;
        T7 t72;
        T7 t73;
        if (KQ.A02(this)) {
            return;
        }
        try {
            jf = this.A00.A04;
            jf.A04(JE.A0j, null);
            c1045Zs = this.A00.A03;
            c1045Zs.A0E().A3X();
            t7 = this.A00.A00;
            if (t7 != null) {
                A07 = this.A00.A07();
                if (A07) {
                    t73 = this.A00.A00;
                    t73.setVolume(1.0f);
                } else {
                    t72 = this.A00.A00;
                    t72.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
