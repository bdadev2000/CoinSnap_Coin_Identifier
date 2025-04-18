package com.instagram.common.viewpoint.core;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Qr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0814Qr extends ContentObserver {
    public final C0863So A00;

    public C0814Qr(Handler handler, C0863So c0863So) {
        super(handler);
        this.A00 = c0863So;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        this.A00.A0e();
    }
}
