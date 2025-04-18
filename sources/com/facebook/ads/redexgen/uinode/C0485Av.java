package com.facebook.ads.redexgen.uinode;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.Av, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0485Av extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C1055Xy A01;

    public C0485Av(C1055Xy c1055Xy, AudioTrack audioTrack) {
        this.A01 = c1055Xy;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        if (KL.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.flush();
                this.A00.release();
            } finally {
                conditionVariable = this.A01.A0f;
                conditionVariable.open();
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
