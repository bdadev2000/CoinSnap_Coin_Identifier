package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MN implements View.OnClickListener {
    public final /* synthetic */ C1Z A00;
    public final /* synthetic */ JF A01;
    public final /* synthetic */ MO A02;
    public final /* synthetic */ MR A03;
    public final /* synthetic */ String A04;

    public MN(MO mo, JF jf, MR mr, String str, C1Z c1z) {
        this.A02 = mo;
        this.A01 = jf;
        this.A03 = mr;
        this.A04 = str;
        this.A00 = c1z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2S c2s;
        C1045Zs c1045Zs;
        C1045Zs c1045Zs2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A01.A04(JE.A0A, null);
            c2s = this.A02.A02;
            c1045Zs = this.A02.A03;
            if (c2s.A0O(c1045Zs.A01(), true)) {
                this.A03.A9l(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                L2 l2 = new L2();
                c1045Zs2 = this.A02.A03;
                L2.A0M(l2, c1045Zs2, L5.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
