package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.NativeAdLayoutApi;

/* loaded from: assets/audience_network.dex */
public class ZG extends C09135a implements NativeAdLayoutApi {
    public View A02;
    public NativeAdLayout A03;
    public int A01 = 0;
    public int A00 = 0;

    public final void A02() {
        AbstractC1303Lo.A0T(this.A03);
        this.A03.removeView(this.A02);
        this.A02 = null;
    }

    public final void A03(AbstractC1329Mo abstractC1329Mo) {
        this.A02 = abstractC1329Mo;
        abstractC1329Mo.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC1303Lo.A0T(this.A03);
        this.A03.addView(this.A02);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void initialize(NativeAdLayout nativeAdLayout) {
        this.A03 = nativeAdLayout;
    }

    @Override // com.meta.analytics.dsp.uinode.C09135a, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.A00 > 0) {
            int measuredWidth = this.A03.getMeasuredWidth();
            int i11 = this.A00;
            if (measuredWidth > i11) {
                setMeasuredDimension(i11, this.A03.getMeasuredHeight());
                return;
            }
        }
        int measuredWidth2 = this.A03.getMeasuredWidth();
        int i12 = this.A01;
        if (measuredWidth2 >= i12) {
            return;
        }
        setMeasuredDimension(i12, this.A03.getMeasuredHeight());
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void setMaxWidth(int i9) {
        this.A00 = i9;
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void setMinWidth(int i9) {
        this.A01 = i9;
    }
}
