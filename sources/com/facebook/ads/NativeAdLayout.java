package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.AdComponentFrameLayout;
import com.facebook.ads.internal.api.NativeAdLayoutApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class NativeAdLayout extends AdComponentFrameLayout {
    private NativeAdLayoutApi mNativeAdLayoutApi;

    public NativeAdLayout(Context context) {
        super(context);
        initializeSelf(context);
    }

    private void initializeSelf(Context context) {
        NativeAdLayoutApi createNativeAdLayoutApi = DynamicLoaderFactory.makeLoader(context).createNativeAdLayoutApi();
        this.mNativeAdLayoutApi = createNativeAdLayoutApi;
        attachAdComponentViewApi(createNativeAdLayoutApi);
        this.mNativeAdLayoutApi.initialize(this);
    }

    public NativeAdLayoutApi getNativeAdLayoutApi() {
        return this.mNativeAdLayoutApi;
    }

    public void setMaxWidth(int i9) {
        this.mNativeAdLayoutApi.setMaxWidth(i9);
    }

    public void setMinWidth(int i9) {
        this.mNativeAdLayoutApi.setMinWidth(i9);
    }

    public NativeAdLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(context);
    }

    public NativeAdLayout(Context context, @Nullable AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        initializeSelf(context);
    }

    public NativeAdLayout(Context context, NativeAdLayoutApi nativeAdLayoutApi) {
        super(context);
        this.mNativeAdLayoutApi = nativeAdLayoutApi;
        attachAdComponentViewApi(nativeAdLayoutApi);
        this.mNativeAdLayoutApi.initialize(this);
    }
}
