package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.facebook.ads.redexgen.X.Wi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0960Wi implements InterfaceC0579Hi {
    @Override // com.instagram.common.viewpoint.core.InterfaceC0579Hi
    public final C0959Wh A4y(Looper looper, Handler.Callback callback) {
        return new C0959Wh(new Handler(looper, callback));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0579Hi
    public final long A5p() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0579Hi
    public final long AHK() {
        return SystemClock.uptimeMillis();
    }
}
