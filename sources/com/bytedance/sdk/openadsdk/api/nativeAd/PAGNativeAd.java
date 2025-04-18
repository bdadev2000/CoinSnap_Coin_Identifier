package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.AlY;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PAGNativeAd implements PAGClientBidding, PangleAd {
    public static void loadAd(@NonNull String str, @NonNull PAGNativeRequest pAGNativeRequest, @NonNull PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        ISDKTypeFactory YFl = AlY.YFl(pAGNativeAdLoadListener);
        if (YFl != null) {
            YFl.createADTypeLoaderFactory(str).createNativeAdLoader().loadAd(str, pAGNativeRequest, pAGNativeAdLoadListener);
        }
    }

    public abstract PAGNativeAdData getNativeAdData();

    public abstract void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback);

    public abstract void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener);

    public abstract void showPrivacyActivity();

    public static void loadAd(@NonNull String str, @NonNull PAGNativeRequest pAGNativeRequest, @NonNull final PAGNativeAdLoadCallback pAGNativeAdLoadCallback) {
        loadAd(str, pAGNativeRequest, new PAGNativeAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
            public void onError(int i10, String str2) {
                PAGNativeAdLoadCallback.this.onError(new PAGErrorModel(i10, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(PAGNativeAd pAGNativeAd) {
                PAGNativeAdLoadCallback.this.onAdLoaded(pAGNativeAd);
            }
        });
    }
}
