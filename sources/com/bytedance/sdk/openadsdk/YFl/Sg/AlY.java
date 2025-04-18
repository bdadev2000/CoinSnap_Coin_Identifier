package com.bytedance.sdk.openadsdk.YFl.Sg;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.Wwa;

/* loaded from: classes.dex */
public class AlY implements PAGNativeAdData {
    private final YFl YFl;

    public AlY(YFl yFl) {
        this.YFl = yFl;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        YFl yFl = this.YFl;
        if (yFl != null) {
            return yFl.eT();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        YFl yFl = this.YFl;
        if (yFl != null) {
            return yFl.nc();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        YFl yFl = this.YFl;
        if (yFl != null) {
            return yFl.vc();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        YFl yFl = this.YFl;
        if (yFl != null) {
            return yFl.wN();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        YFl yFl = this.YFl;
        if (yFl != null) {
            return yFl.tN();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        if (Wwa.wN(this.YFl.YFl)) {
            return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo;
        }
        return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        YFl yFl = this.YFl;
        if (yFl != null) {
            return yFl.DSW();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        YFl yFl = this.YFl;
        if (yFl != null) {
            return yFl.AlY();
        }
        return null;
    }
}
