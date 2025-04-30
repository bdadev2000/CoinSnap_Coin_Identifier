package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* loaded from: assets/audience_network.dex */
public class YZ extends KT {
    public final /* synthetic */ C1635Ym A00;

    public YZ(C1635Ym c1635Ym) {
        this.A00 = c1635Ym;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
