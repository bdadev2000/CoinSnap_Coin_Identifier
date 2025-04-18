package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* loaded from: classes.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    /* loaded from: classes.dex */
    public static class Builder {
        private MaxAdFormat a;

        /* renamed from: b, reason: collision with root package name */
        private String f9527b;

        /* renamed from: c, reason: collision with root package name */
        private String f9528c;

        /* renamed from: d, reason: collision with root package name */
        private String f9529d;

        /* renamed from: e, reason: collision with root package name */
        private String f9530e;

        /* renamed from: f, reason: collision with root package name */
        private MaxNativeAdImage f9531f;

        /* renamed from: g, reason: collision with root package name */
        private View f9532g;

        /* renamed from: h, reason: collision with root package name */
        private View f9533h;

        /* renamed from: i, reason: collision with root package name */
        private View f9534i;

        /* renamed from: j, reason: collision with root package name */
        private MaxNativeAdImage f9535j;

        /* renamed from: k, reason: collision with root package name */
        private float f9536k;

        /* renamed from: l, reason: collision with root package name */
        private Double f9537l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f9528c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f9529d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f9530e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f9531f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f9532g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f9535j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f10) {
            this.f9536k = f10;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f9534i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f9533h = view;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.f9537l = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.f9527b = str;
            return this;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.a;
        this.title = builder.f9527b;
        this.advertiser = builder.f9528c;
        this.body = builder.f9529d;
        this.callToAction = builder.f9530e;
        this.icon = builder.f9531f;
        this.iconView = builder.f9532g;
        this.optionsView = builder.f9533h;
        this.mediaView = builder.f9534i;
        this.mainImage = builder.f9535j;
        this.mediaContentAspectRatio = builder.f9536k;
        Double d10 = builder.f9537l;
        this.starRating = (d10 == null || d10.doubleValue() < 3.0d) ? null : d10;
    }

    @Nullable
    public final String getAdvertiser() {
        return this.advertiser;
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final String getCallToAction() {
        return this.callToAction;
    }

    @NonNull
    public final MaxAdFormat getFormat() {
        return this.format;
    }

    @Nullable
    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    @Nullable
    public final View getIconView() {
        return this.iconView;
    }

    @Nullable
    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    @Nullable
    public final View getMediaView() {
        return this.mediaView;
    }

    @Nullable
    public final View getOptionsView() {
        return this.optionsView;
    }

    @Nullable
    public final Double getStarRating() {
        return this.starRating;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView != null && (callToActionButton = maxNativeAdView.getCallToActionButton()) != null) {
            callToActionButton.performClick();
        }
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }

    /* loaded from: classes.dex */
    public static class MaxNativeAdImage {
        private Drawable a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f9538b;

        public MaxNativeAdImage(Drawable drawable) {
            this.a = drawable;
        }

        @Nullable
        public Drawable getDrawable() {
            return this.a;
        }

        @Nullable
        public Uri getUri() {
            return this.f9538b;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f9538b = uri;
        }
    }
}
