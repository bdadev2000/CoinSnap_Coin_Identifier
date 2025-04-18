package com.bytedance.sdk.openadsdk.api;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

/* loaded from: classes.dex */
public interface PAGLoadCallback<Ad> {
    void onAdLoaded(Ad ad2);

    void onError(@NonNull PAGErrorModel pAGErrorModel);
}
