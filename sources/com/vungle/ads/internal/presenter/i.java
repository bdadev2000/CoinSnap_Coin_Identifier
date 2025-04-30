package com.vungle.ads.internal.presenter;

import com.vungle.ads.internal.network.InterfaceC2099a;
import com.vungle.ads.internal.network.InterfaceC2100b;

/* loaded from: classes3.dex */
public final class i implements InterfaceC2100b {
    @Override // com.vungle.ads.internal.network.InterfaceC2100b
    public void onFailure(InterfaceC2099a interfaceC2099a, Throwable th) {
        com.vungle.ads.internal.util.v.Companion.d("MRAIDPresenter", "send RI Failure");
    }

    @Override // com.vungle.ads.internal.network.InterfaceC2100b
    public void onResponse(InterfaceC2099a interfaceC2099a, com.vungle.ads.internal.network.j jVar) {
        com.vungle.ads.internal.util.v.Companion.d("MRAIDPresenter", "send RI success");
    }
}
