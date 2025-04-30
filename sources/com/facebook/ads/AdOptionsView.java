package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.AdComponentFrameLayout;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class AdOptionsView extends AdComponentFrameLayout {
    private final AdOptionsViewApi mAdOptionsViewApi;

    @Keep
    /* loaded from: classes.dex */
    public enum Orientation {
        HORIZONTAL,
        VERTICAL
    }

    public AdOptionsView(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout) {
        super(context);
        AdOptionsViewApi createAdOptionsView = DynamicLoaderFactory.makeLoader(context).createAdOptionsView(context, nativeAdBase, nativeAdLayout, this);
        this.mAdOptionsViewApi = createAdOptionsView;
        attachAdComponentViewApi(createAdOptionsView);
    }

    public void setIconColor(int i9) {
        this.mAdOptionsViewApi.setIconColor(i9);
    }

    public void setIconSizeDp(int i9) {
        this.mAdOptionsViewApi.setIconSizeDp(i9);
    }

    public void setSingleIcon(boolean z8) {
        this.mAdOptionsViewApi.setSingleIcon(z8);
    }

    public AdOptionsView(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, Orientation orientation, int i9) {
        super(context);
        AdOptionsViewApi createAdOptionsView = DynamicLoaderFactory.makeLoader(context).createAdOptionsView(context, nativeAdBase, nativeAdLayout, orientation, i9, this);
        this.mAdOptionsViewApi = createAdOptionsView;
        attachAdComponentViewApi(createAdOptionsView);
    }
}
