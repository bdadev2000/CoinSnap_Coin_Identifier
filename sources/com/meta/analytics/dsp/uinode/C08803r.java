package com.meta.analytics.dsp.uinode;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C08803r extends C1119Eb {
    public C08803r(C1636Yn c1636Yn) {
        super(c1636Yn);
        setCarouselLayoutManager(c1636Yn);
    }

    public AbstractC1471Sa getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.C1119Eb
    public C1662Zo getLayoutManager() {
        return (C1662Zo) super.getLayoutManager();
    }

    public AbstractC09074t getOnScrollListener() {
        return new US(this);
    }

    private void setCarouselLayoutManager(C1636Yn c1636Yn) {
        C1662Zo c1662Zo = new C1662Zo(c1636Yn, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1662Zo.A1R(true);
        }
        super.setLayoutManager(c1662Zo);
    }

    @Override // com.meta.analytics.dsp.uinode.C1119Eb
    public void setLayoutManager(AbstractC09024o abstractC09024o) {
    }
}
