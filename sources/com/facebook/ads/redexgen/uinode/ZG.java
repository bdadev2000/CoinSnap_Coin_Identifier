package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.NativeAdLayoutApi;

/* loaded from: assets/audience_network.dex */
public class ZG extends C03475a implements NativeAdLayoutApi {
    public View A02;
    public NativeAdLayout A03;
    public int A01 = 0;
    public int A00 = 0;

    public final void A02() {
        AbstractC0737Lo.A0T(this.A03);
        this.A03.removeView(this.A02);
        this.A02 = null;
    }

    public final void A03(AbstractC0763Mo abstractC0763Mo) {
        this.A02 = abstractC0763Mo;
        abstractC0763Mo.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC0737Lo.A0T(this.A03);
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

    @Override // com.facebook.ads.redexgen.uinode.C03475a, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.A00 > 0) {
            int measuredWidth = this.A03.getMeasuredWidth();
            int i12 = this.A00;
            if (measuredWidth > i12) {
                setMeasuredDimension(i12, this.A03.getMeasuredHeight());
                return;
            }
        }
        int measuredWidth2 = this.A03.getMeasuredWidth();
        int i13 = this.A01;
        if (measuredWidth2 >= i13) {
            return;
        }
        setMeasuredDimension(i13, this.A03.getMeasuredHeight());
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void setMaxWidth(int i10) {
        this.A00 = i10;
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void setMinWidth(int i10) {
        this.A01 = i10;
    }
}
