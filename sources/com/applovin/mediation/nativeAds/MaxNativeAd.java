package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* loaded from: classes3.dex */
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

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private MaxAdFormat f28419a;

        /* renamed from: b, reason: collision with root package name */
        private String f28420b;

        /* renamed from: c, reason: collision with root package name */
        private String f28421c;
        private String d;
        private String e;

        /* renamed from: f, reason: collision with root package name */
        private MaxNativeAdImage f28422f;

        /* renamed from: g, reason: collision with root package name */
        private View f28423g;

        /* renamed from: h, reason: collision with root package name */
        private View f28424h;

        /* renamed from: i, reason: collision with root package name */
        private View f28425i;

        /* renamed from: j, reason: collision with root package name */
        private MaxNativeAdImage f28426j;

        /* renamed from: k, reason: collision with root package name */
        private float f28427k;

        /* renamed from: l, reason: collision with root package name */
        private Double f28428l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f28419a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f28421c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f28422f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f28423g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f28426j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f2) {
            this.f28427k = f2;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f28425i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f28424h = view;
            return this;
        }

        public Builder setStarRating(Double d) {
            this.f28428l = d;
            return this;
        }

        public Builder setTitle(String str) {
            this.f28420b = str;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static class MaxNativeAdImage {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f28429a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f28430b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f28429a = drawable;
        }

        @Nullable
        public Drawable getDrawable() {
            return this.f28429a;
        }

        @Nullable
        public Uri getUri() {
            return this.f28430b;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f28430b = uri;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f28419a;
        this.title = builder.f28420b;
        this.advertiser = builder.f28421c;
        this.body = builder.d;
        this.callToAction = builder.e;
        this.icon = builder.f28422f;
        this.iconView = builder.f28423g;
        this.optionsView = builder.f28424h;
        this.mediaView = builder.f28425i;
        this.mainImage = builder.f28426j;
        this.mediaContentAspectRatio = builder.f28427k;
        Double d = builder.f28428l;
        this.starRating = (d == null || d.doubleValue() < 3.0d) ? null : d;
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

    @UiThread
    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
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
}
