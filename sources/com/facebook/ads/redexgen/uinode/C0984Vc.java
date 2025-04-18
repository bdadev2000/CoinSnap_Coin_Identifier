package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.Vc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0984Vc implements InterfaceC0639Hn {
    public final Handler A00;

    public C0984Vc(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0639Hn
    public final Looper A7L() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0639Hn
    public final Message AAZ(int i10, int i11, int i12) {
        return this.A00.obtainMessage(i10, i11, i12);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0639Hn
    public final Message AAa(int i10, int i11, int i12, Object obj) {
        return this.A00.obtainMessage(i10, i11, i12, obj);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0639Hn
    public final Message AAb(int i10, Object obj) {
        return this.A00.obtainMessage(i10, obj);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0639Hn
    public final void AF8(int i10) {
        this.A00.removeMessages(i10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0639Hn
    public final boolean AFn(int i10) {
        return this.A00.sendEmptyMessage(i10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0639Hn
    public final boolean AFo(int i10, long j3) {
        return this.A00.sendEmptyMessageAtTime(i10, j3);
    }
}
