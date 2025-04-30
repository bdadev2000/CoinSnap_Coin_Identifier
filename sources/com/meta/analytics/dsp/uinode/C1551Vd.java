package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.facebook.ads.redexgen.X.Vd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1551Vd implements InterfaceC1195Hd {
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1195Hd
    public final C1550Vc A4c(Looper looper, Handler.Callback callback) {
        return new C1550Vc(new Handler(looper, callback));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1195Hd
    public final long A5T() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1195Hd
    public final long AGs() {
        return SystemClock.uptimeMillis();
    }
}
