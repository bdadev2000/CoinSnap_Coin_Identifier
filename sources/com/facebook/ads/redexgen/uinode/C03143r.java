package com.facebook.ads.redexgen.uinode;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C03143r extends C0553Eb {
    public C03143r(C1070Yn c1070Yn) {
        super(c1070Yn);
        setCarouselLayoutManager(c1070Yn);
    }

    public AbstractC0905Sa getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.C0553Eb
    public C1096Zo getLayoutManager() {
        return (C1096Zo) super.getLayoutManager();
    }

    public AbstractC03414t getOnScrollListener() {
        return new US(this);
    }

    private void setCarouselLayoutManager(C1070Yn c1070Yn) {
        C1096Zo c1096Zo = new C1096Zo(c1070Yn, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1096Zo.A1R(true);
        }
        super.setLayoutManager(c1096Zo);
    }

    @Override // com.facebook.ads.redexgen.uinode.C0553Eb
    public void setLayoutManager(AbstractC03364o abstractC03364o) {
    }
}
