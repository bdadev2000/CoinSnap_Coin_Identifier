package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* loaded from: assets/audience_network.dex */
public class YP implements InterfaceC09677j {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ YO A01;

    public YP(YO yo, AdvertisingId advertisingId) {
        this.A01 = yo;
        this.A00 = advertisingId;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC09677j
    public final boolean A97() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC09677j
    public final String getId() {
        return this.A00.getId();
    }
}
