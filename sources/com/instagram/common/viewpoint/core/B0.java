package com.instagram.common.viewpoint.core;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* loaded from: assets/audience_network.dex */
public class B0 extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ Z3 A01;

    public B0(Z3 z3, AudioTrack audioTrack) {
        this.A01 = z3;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        if (KQ.A02(this)) {
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
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
