package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.Vc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1550Vc implements InterfaceC1205Hn {
    public final Handler A00;

    public C1550Vc(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1205Hn
    public final Looper A7L() {
        return this.A00.getLooper();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1205Hn
    public final Message AAZ(int i9, int i10, int i11) {
        return this.A00.obtainMessage(i9, i10, i11);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1205Hn
    public final Message AAa(int i9, int i10, int i11, Object obj) {
        return this.A00.obtainMessage(i9, i10, i11, obj);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1205Hn
    public final Message AAb(int i9, Object obj) {
        return this.A00.obtainMessage(i9, obj);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1205Hn
    public final void AF8(int i9) {
        this.A00.removeMessages(i9);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1205Hn
    public final boolean AFn(int i9) {
        return this.A00.sendEmptyMessage(i9);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1205Hn
    public final boolean AFo(int i9, long j7) {
        return this.A00.sendEmptyMessageAtTime(i9, j7);
    }
}
