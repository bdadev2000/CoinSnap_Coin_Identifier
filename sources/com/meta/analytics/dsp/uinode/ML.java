package com.meta.analytics.dsp.uinode;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* loaded from: assets/audience_network.dex */
public class ML implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public ML(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MA ma;
        C1316Mb c1316Mb;
        MA ma2;
        if (KL.A02(this)) {
            return;
        }
        try {
            ma = this.A00.A02;
            if (ma == null) {
                return;
            }
            c1316Mb = this.A00.A07;
            if (!c1316Mb.A04()) {
                return;
            }
            ma2 = this.A00.A02;
            ma2.AB6();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
