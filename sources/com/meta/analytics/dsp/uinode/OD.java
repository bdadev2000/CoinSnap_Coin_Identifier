package com.meta.analytics.dsp.uinode;

import android.app.Activity;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class OD implements Runnable {
    public final /* synthetic */ C1U A00;
    public final /* synthetic */ OG A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public OD(OG og, String str, C1U c1u, String str2) {
        this.A01 = og;
        this.A03 = str;
        this.A00 = c1u;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        C1636Yn c1636Yn;
        if (KL.A02(this)) {
            return;
        }
        try {
            z8 = this.A01.A00;
            if (!z8) {
                return;
            }
            boolean z9 = false;
            this.A01.A00 = false;
            c1636Yn = this.A01.A03;
            Activity A0D = c1636Yn.A0D();
            boolean z10 = false;
            if (Build.VERSION.SDK_INT >= 24) {
                if (A0D != null && A0D.isInMultiWindowMode()) {
                    z9 = true;
                }
                z10 = z9;
            }
            if (!z10 && C1278Kp.A00().A03()) {
                return;
            }
            this.A01.A05(this.A03, this.A00, this.A02);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
