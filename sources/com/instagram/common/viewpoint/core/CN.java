package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* loaded from: assets/audience_network.dex */
public final class CN implements W6 {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public CN(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.instagram.common.viewpoint.core.JM
    public final void AB2() {
        KP.A00(new W2(this));
    }

    @Override // com.instagram.common.viewpoint.core.JM
    public final void AB6() {
        KP.A00(new W3(this));
    }

    @Override // com.instagram.common.viewpoint.core.JM
    public final void ABs(C0625Jg c0625Jg) {
        KP.A00(new W5(this, c0625Jg));
    }

    @Override // com.instagram.common.viewpoint.core.JM
    public final void ACb() {
        KP.A00(new W1(this));
    }

    @Override // com.instagram.common.viewpoint.core.W6
    public final void ACg() {
        KP.A00(new W4(this));
    }
}
