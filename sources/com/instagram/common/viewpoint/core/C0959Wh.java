package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.Wh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0959Wh implements InterfaceC0589Hs {
    public final Handler A00;

    public C0959Wh(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0589Hs
    public final Looper A7j() {
        return this.A00.getLooper();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0589Hs
    public final Message AAz(int i2, int i3, int i4) {
        return this.A00.obtainMessage(i2, i3, i4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0589Hs
    public final Message AB0(int i2, int i3, int i4, Object obj) {
        return this.A00.obtainMessage(i2, i3, i4, obj);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0589Hs
    public final Message AB1(int i2, Object obj) {
        return this.A00.obtainMessage(i2, obj);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0589Hs
    public final void AFb(int i2) {
        this.A00.removeMessages(i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0589Hs
    public final boolean AGD(int i2) {
        return this.A00.sendEmptyMessage(i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0589Hs
    public final boolean AGE(int i2, long j2) {
        return this.A00.sendEmptyMessageAtTime(i2, j2);
    }
}
