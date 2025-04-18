package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.facebook.ads.redexgen.X.Vd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0985Vd implements InterfaceC0629Hd {
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0629Hd
    public final C0984Vc A4c(Looper looper, Handler.Callback callback) {
        return new C0984Vc(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0629Hd
    public final long A5T() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0629Hd
    public final long AGs() {
        return SystemClock.uptimeMillis();
    }
}
