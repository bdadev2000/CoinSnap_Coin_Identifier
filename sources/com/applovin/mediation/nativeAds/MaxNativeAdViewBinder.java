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

        /* renamed from: a, reason: collision with root package name */
        private final View f12732a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private int f12733c;

        /* renamed from: d, reason: collision with root package name */
        private int f12734d;

        /* renamed from: e, reason: collision with root package name */
        private int f12735e;

        /* renamed from: f, reason: collision with root package name */
        private int f12736f;

        /* renamed from: g, reason: collision with root package name */
        private int f12737g;

        /* renamed from: h, reason: collision with root package name */
        private int f12738h;

        /* renamed from: i, reason: collision with root package name */
        private int f12739i;

        /* renamed from: j, reason: collision with root package name */
        private int f12740j;

        /* renamed from: k, reason: collision with root package name */
        private int f12741k;
        private int l;
        private int m;

        /* renamed from: n, reason: collision with root package name */
        private String f12742n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f12732a, this.b, this.f12733c, this.f12734d, this.f12735e, this.f12736f, this.f12737g, this.f12740j, this.f12738h, this.f12739i, this.f12741k, this.l, this.m, this.f12742n);
        }

        public Builder setAdvertiserTextViewId(int i9) {
            this.f12734d = i9;
            return this;
        }

        public Builder setBodyTextViewId(int i9) {
            this.f12735e = i9;
            return this;
        }

        public Builder setCallToActionButtonId(int i9) {
            this.m = i9;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(int i9) {
            this.f12737g = i9;
            return this;
        }

        public Builder setIconImageViewId(int i9) {
            this.f12736f = i9;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i9) {
            this.l = i9;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i9) {
            this.f12741k = i9;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i9) {
            this.f12739i = i9;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i9) {
            this.f12738h = i9;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i9) {
            this.f12740j = i9;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f12742n = str;
            return this;
        }

        public Builder setTitleTextViewId(int i9) {
            this.f12733c = i9;
            return this;
        }

        public Builder(int i9) {
            this(i9, null);
        }

        private Builder(int i9, View view) {
            this.f12733c = -1;
            this.f12734d = -1;
            this.f12735e = -1;
            this.f12736f = -1;
            this.f12737g = -1;
            this.f12738h = -1;
            this.f12739i = -1;
            this.f12740j = -1;
            this.f12741k = -1;
            this.l = -1;
            this.m = -1;
            this.b = i9;
            this.f12732a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, String str) {
        this.mainView = view;
        this.layoutResourceId = i9;
        this.titleTextViewId = i10;
        this.advertiserTextViewId = i11;
        this.bodyTextViewId = i12;
        this.iconImageViewId = i13;
        this.iconContentViewId = i14;
        this.starRatingContentViewGroupId = i15;
        this.optionsContentViewGroupId = i16;
        this.optionsContentFrameLayoutId = i17;
        this.mediaContentViewGroupId = i18;
        this.mediaContentFrameLayoutId = i19;
        this.callToActionButtonId = i20;
        this.templateType = str;
    }
}
