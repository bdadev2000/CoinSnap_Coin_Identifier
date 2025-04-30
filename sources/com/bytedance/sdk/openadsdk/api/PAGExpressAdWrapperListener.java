package com.bytedance.sdk.openadsdk.api;

import android.view.View;

/* loaded from: classes.dex */
public interface PAGExpressAdWrapperListener extends PAGAdWrapperListener {
    void onAdDismissed();

    void onAdShow(View view, int i9);

    void onRenderFail(View view, String str, int i9);

    void onRenderSuccess(View view, float f9, float f10);
}
