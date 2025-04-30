package com.vungle.ads.internal.network;

import com.vungle.ads.InterfaceC2130o;

/* loaded from: classes3.dex */
public final class v implements InterfaceC2100b {
    final /* synthetic */ InterfaceC2130o $requestListener;

    public v(InterfaceC2130o interfaceC2130o) {
        this.$requestListener = interfaceC2130o;
    }

    @Override // com.vungle.ads.internal.network.InterfaceC2100b
    public void onFailure(InterfaceC2099a interfaceC2099a, Throwable th) {
        this.$requestListener.onFailure();
    }

    @Override // com.vungle.ads.internal.network.InterfaceC2100b
    public void onResponse(InterfaceC2099a interfaceC2099a, j jVar) {
        this.$requestListener.onSuccess();
    }
}
