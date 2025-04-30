package com.bytedance.sdk.openadsdk.apiImpl.feed;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.woN;

/* loaded from: classes.dex */
public class jU implements PAGNativeAdData {
    private final zp zp;

    public jU(zp zpVar) {
        this.zp = zpVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        zp zpVar = this.zp;
        if (zpVar != null) {
            return zpVar.Bj();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        zp zpVar = this.zp;
        if (zpVar != null) {
            return zpVar.dT();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        zp zpVar = this.zp;
        if (zpVar != null) {
            return zpVar.HWF();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        zp zpVar = this.zp;
        if (zpVar != null) {
            return zpVar.COT();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        zp zpVar = this.zp;
        if (zpVar != null) {
            return zpVar.KS();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        if (woN.COT(this.zp.zp)) {
            return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo;
        }
        return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        zp zpVar = this.zp;
        if (zpVar != null) {
            return zpVar.QR();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        zp zpVar = this.zp;
        if (zpVar != null) {
            return zpVar.jU();
        }
        return null;
    }
}
