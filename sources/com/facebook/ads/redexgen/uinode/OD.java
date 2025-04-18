package com.facebook.ads.redexgen.uinode;

import android.app.Activity;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class OD implements Runnable {
    public final /* synthetic */ C1U A00;
    public final /* synthetic */ OG A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public OD(OG og2, String str, C1U c1u, String str2) {
        this.A01 = og2;
        this.A03 = str;
        this.A00 = c1u;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        C1070Yn c1070Yn;
        if (KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A01.A00;
            if (!z10) {
                return;
            }
            boolean z11 = false;
            this.A01.A00 = false;
            c1070Yn = this.A01.A03;
            Activity A0D = c1070Yn.A0D();
            boolean z12 = false;
            if (Build.VERSION.SDK_INT >= 24) {
                if (A0D != null && A0D.isInMultiWindowMode()) {
                    z11 = true;
                }
                z12 = z11;
            }
            if (!z12 && C0712Kp.A00().A03()) {
                return;
            }
            this.A01.A05(this.A03, this.A00, this.A02);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
