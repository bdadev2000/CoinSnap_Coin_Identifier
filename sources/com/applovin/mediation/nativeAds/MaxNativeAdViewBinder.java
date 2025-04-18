package com.applovin.mediation.nativeAds;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;

/* loaded from: classes.dex */
public class MaxNativeAdViewBinder {

    @IdRes
    protected final int advertiserTextViewId;

    @IdRes
    protected final int bodyTextViewId;

    @IdRes
    protected final int callToActionButtonId;

    @IdRes
    protected final int iconContentViewId;

    @IdRes
    protected final int iconImageViewId;

    @LayoutRes
    protected final int layoutResourceId;
    protected final View mainView;

    @IdRes
    protected final int mediaContentFrameLayoutId;

    @IdRes
    protected final int mediaContentViewGroupId;

    @IdRes
    protected final int optionsContentFrameLayoutId;

    @IdRes
    protected final int optionsContentViewGroupId;

    @IdRes
    protected final int starRatingContentViewGroupId;
    protected final String templateType;

    @IdRes
    protected final int titleTextViewId;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final View f28447a;

        /* renamed from: b, reason: collision with root package name */
        private final int f28448b;

        /* renamed from: c, reason: collision with root package name */
        private int f28449c;
        private int d;
        private int e;

        /* renamed from: f, reason: collision with root package name */
        private int f28450f;

        /* renamed from: g, reason: collision with root package name */
        private int f28451g;

        /* renamed from: h, reason: collision with root package name */
        private int f28452h;

        /* renamed from: i, reason: collision with root package name */
        private int f28453i;

        /* renamed from: j, reason: collision with root package name */
        private int f28454j;

        /* renamed from: k, reason: collision with root package name */
        private int f28455k;

        /* renamed from: l, reason: collision with root package name */
        private int f28456l;

        /* renamed from: m, reason: collision with root package name */
        private int f28457m;

        /* renamed from: n, reason: collision with root package name */
        private String f28458n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f28447a, this.f28448b, this.f28449c, this.d, this.e, this.f28450f, this.f28451g, this.f28454j, this.f28452h, this.f28453i, this.f28455k, this.f28456l, this.f28457m, this.f28458n);
        }

        public Builder setAdvertiserTextViewId(@IdRes int i2) {
            this.d = i2;
            return this;
        }

        public Builder setBodyTextViewId(@IdRes int i2) {
            this.e = i2;
            return this;
        }

        public Builder setCallToActionButtonId(@IdRes int i2) {
            this.f28457m = i2;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(@IdRes int i2) {
            this.f28451g = i2;
            return this;
        }

        public Builder setIconImageViewId(@IdRes int i2) {
            this.f28450f = i2;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(@IdRes int i2) {
            this.f28456l = i2;
            return this;
        }

        public Builder setMediaContentViewGroupId(@IdRes int i2) {
            this.f28455k = i2;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(@IdRes int i2) {
            this.f28453i = i2;
            return this;
        }

        public Builder setOptionsContentViewGroupId(@IdRes int i2) {
            this.f28452h = i2;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(@IdRes int i2) {
            this.f28454j = i2;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f28458n = str;
            return this;
        }

        public Builder setTitleTextViewId(@IdRes int i2) {
            this.f28449c = i2;
            return this;
        }

        public Builder(@LayoutRes int i2) {
            this(i2, null);
        }

        private Builder(int i2, View view) {
            this.f28449c = -1;
            this.d = -1;
            this.e = -1;
            this.f28450f = -1;
            this.f28451g = -1;
            this.f28452h = -1;
            this.f28453i = -1;
            this.f28454j = -1;
            this.f28455k = -1;
            this.f28456l = -1;
            this.f28457m = -1;
            this.f28448b = i2;
            this.f28447a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, String str) {
        this.mainView = view;
        this.layoutResourceId = i2;
        this.titleTextViewId = i3;
        this.advertiserTextViewId = i4;
        this.bodyTextViewId = i5;
        this.iconImageViewId = i6;
        this.iconContentViewId = i7;
        this.starRatingContentViewGroupId = i8;
        this.optionsContentViewGroupId = i9;
        this.optionsContentFrameLayoutId = i10;
        this.mediaContentViewGroupId = i11;
        this.mediaContentFrameLayoutId = i12;
        this.callToActionButtonId = i13;
        this.templateType = str;
    }
}
