package com.vungle.ads.internal.presenter;

/* loaded from: classes4.dex */
public final class i implements com.vungle.ads.internal.network.b {
    @Override // com.vungle.ads.internal.network.b
    public void onFailure(com.vungle.ads.internal.network.a aVar, Throwable th2) {
        com.vungle.ads.internal.util.v.Companion.d("MRAIDPresenter", "send RI Failure");
    }

    @Override // com.vungle.ads.internal.network.b
    public void onResponse(com.vungle.ads.internal.network.a aVar, com.vungle.ads.internal.network.j jVar) {
        com.vungle.ads.internal.util.v.Companion.d("MRAIDPresenter", "send RI success");
    }
}
