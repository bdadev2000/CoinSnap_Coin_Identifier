package com.facebook.ads.redexgen.uinode;

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
        MA ma2;
        C0750Mb c0750Mb;
        MA ma3;
        if (KL.A02(this)) {
            return;
        }
        try {
            ma2 = this.A00.A02;
            if (ma2 == null) {
                return;
            }
            c0750Mb = this.A00.A07;
            if (!c0750Mb.A04()) {
                return;
            }
            ma3 = this.A00.A02;
            ma3.AB6();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
