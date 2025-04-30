package com.meta.analytics.dsp.uinode;

import android.media.AudioTrack;

/* renamed from: com.facebook.ads.redexgen.X.Aw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1052Aw extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C1621Xy A01;

    public C1052Aw(C1621Xy c1621Xy, AudioTrack audioTrack) {
        this.A01 = c1621Xy;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.release();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
