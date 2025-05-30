package com.facebook.ads;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.NativeAdViewAttributesApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class NativeAdViewAttributes {
    private final NativeAdViewAttributesApi mNativeAdViewAttributesApi;

    public NativeAdViewAttributes(Context context) {
        this.mNativeAdViewAttributesApi = DynamicLoaderFactory.makeLoader(context).createNativeAdViewAttributesApi();
    }

    @Deprecated
    public boolean getAutoplay() {
        return AdSettings.isVideoAutoplay();
    }

    @Deprecated
    public boolean getAutoplayOnMobile() {
        return AdSettings.isVideoAutoplayOnMobile();
    }

    @Deprecated
    public int getBackgroundColor() {
        return 0;
    }

    @Deprecated
    public int getButtonBorderColor() {
        return 0;
    }

    @Deprecated
    public int getButtonColor() {
        return 0;
    }

    @Deprecated
    public int getButtonTextColor() {
        return 0;
    }

    @Deprecated
    public int getDescriptionTextColor() {
        return 0;
    }

    @Deprecated
    public int getDescriptionTextSize() {
        return 0;
    }

    public NativeAdViewAttributesApi getInternalAttributes() {
        return this.mNativeAdViewAttributesApi;
    }

    @Deprecated
    public int getTitleTextColor() {
        return 0;
    }

    @Deprecated
    public int getTitleTextSize() {
        return 0;
    }

    @Nullable
    @Deprecated
    public Typeface getTypeface() {
        return null;
    }

    @Deprecated
    public NativeAdViewAttributes setAutoplay(boolean z8) {
        return this;
    }

    @Deprecated
    public NativeAdViewAttributes setAutoplayOnMobile(boolean z8) {
        return this;
    }

    public NativeAdViewAttributes setBackgroundColor(int i9) {
        this.mNativeAdViewAttributesApi.setBackgroundColor(i9);
        return this;
    }

    public NativeAdViewAttributes setButtonBorderColor(int i9) {
        this.mNativeAdViewAttributesApi.setCTABorderColor(i9);
        return this;
    }

    public NativeAdViewAttributes setButtonColor(int i9) {
        this.mNativeAdViewAttributesApi.setCTABackgroundColor(i9);
        return this;
    }

    public NativeAdViewAttributes setButtonTextColor(int i9) {
        this.mNativeAdViewAttributesApi.setCTATextColor(i9);
        return this;
    }

    public NativeAdViewAttributes setDescriptionTextColor(int i9) {
        this.mNativeAdViewAttributesApi.setSecondaryTextColor(i9);
        return this;
    }

    public NativeAdViewAttributes setTitleTextColor(int i9) {
        this.mNativeAdViewAttributesApi.setPrimaryTextColor(i9);
        return this;
    }

    public NativeAdViewAttributes setTypeface(Typeface typeface) {
        this.mNativeAdViewAttributesApi.setTypeface(typeface);
        return this;
    }

    @Deprecated
    public NativeAdViewAttributes() {
        this.mNativeAdViewAttributesApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdViewAttributesApi();
    }
}
