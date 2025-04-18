package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class RT implements Runnable {
    public final /* synthetic */ RW A00;

    public RT(RW rw) {
        this.A00 = rw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
            handler = this.A00.A04;
            handler.removeCallbacks(this);
            handler2 = this.A00.A04;
            handler2.postDelayed(this, 250L);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
