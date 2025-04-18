package com.facebook.ads.redexgen.uinode;

import android.media.AudioTrack;

/* renamed from: com.facebook.ads.redexgen.X.Aw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0486Aw extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C1055Xy A01;

    public C0486Aw(C1055Xy c1055Xy, AudioTrack audioTrack) {
        this.A01 = c1055Xy;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.release();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
