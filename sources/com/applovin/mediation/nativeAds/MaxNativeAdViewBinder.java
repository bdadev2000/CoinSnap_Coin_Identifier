package com.applovin.mediation.nativeAds;

import android.view.View;

/* loaded from: classes.dex */
public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    /* loaded from: classes.dex */
    public static class Builder {
        private final View a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9553b;

        /* renamed from: c, reason: collision with root package name */
        private int f9554c;

        /* renamed from: d, reason: collision with root package name */
        private int f9555d;

        /* renamed from: e, reason: collision with root package name */
        private int f9556e;

        /* renamed from: f, reason: collision with root package name */
        private int f9557f;

        /* renamed from: g, reason: collision with root package name */
        private int f9558g;

        /* renamed from: h, reason: collision with root package name */
        private int f9559h;

        /* renamed from: i, reason: collision with root package name */
        private int f9560i;

        /* renamed from: j, reason: collision with root package name */
        private int f9561j;

        /* renamed from: k, reason: collision with root package name */
        private int f9562k;

        /* renamed from: l, reason: collision with root package name */
        private int f9563l;

        /* renamed from: m, reason: collision with root package name */
        private int f9564m;

        /* renamed from: n, reason: collision with root package name */
        private String f9565n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.a, this.f9553b, this.f9554c, this.f9555d, this.f9556e, this.f9557f, this.f9558g, this.f9561j, this.f9559h, this.f9560i, this.f9562k, this.f9563l, this.f9564m, this.f9565n);
        }

        public Builder setAdvertiserTextViewId(int i10) {
            this.f9555d = i10;
            return this;
        }

        public Builder setBodyTextViewId(int i10) {
            this.f9556e = i10;
            return this;
        }

        public Builder setCallToActionButtonId(int i10) {
            this.f9564m = i10;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(int i10) {
            this.f9558g = i10;
            return this;
        }

        public Builder setIconImageViewId(int i10) {
            this.f9557f = i10;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i10) {
            this.f9563l = i10;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i10) {
            this.f9562k = i10;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i10) {
            this.f9560i = i10;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i10) {
            this.f9559h = i10;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i10) {
            this.f9561j = i10;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f9565n = str;
            return this;
        }

        public Builder setTitleTextViewId(int i10) {
            this.f9554c = i10;
            return this;
        }

        public Builder(int i10) {
            this(i10, null);
        }

        private Builder(int i10, View view) {
            this.f9554c = -1;
            this.f9555d = -1;
            this.f9556e = -1;
            this.f9557f = -1;
            this.f9558g = -1;
            this.f9559h = -1;
            this.f9560i = -1;
            this.f9561j = -1;
            this.f9562k = -1;
            this.f9563l = -1;
            this.f9564m = -1;
            this.f9553b = i10;
            this.a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, String str) {
        this.mainView = view;
        this.layoutResourceId = i10;
        this.titleTextViewId = i11;
        this.advertiserTextViewId = i12;
        this.bodyTextViewId = i13;
        this.iconImageViewId = i14;
        this.iconContentViewId = i15;
        this.starRatingContentViewGroupId = i16;
        this.optionsContentViewGroupId = i17;
        this.optionsContentFrameLayoutId = i18;
        this.mediaContentViewGroupId = i19;
        this.mediaContentFrameLayoutId = i20;
        this.callToActionButtonId = i21;
        this.templateType = str;
    }
}
