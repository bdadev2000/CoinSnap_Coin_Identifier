package com.facebook.ads.internal.api;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class a implements AdComponentViewParentApi {
    public final /* synthetic */ AdComponentFrameLayout b;

    public a(AdComponentFrameLayout adComponentFrameLayout) {
        this.b = adComponentFrameLayout;
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        super/*android.view.ViewGroup*/.addView(view, i9, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        super/*android.view.ViewGroup*/.bringChildToFront(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onMeasure(int i9, int i10) {
        super/*android.widget.FrameLayout*/.onMeasure(i9, i10);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i9) {
        super/*android.view.View*/.onVisibilityChanged(view, i9);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z8) {
        super/*android.view.View*/.onWindowFocusChanged(z8);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super/*android.view.View*/.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void setMeasuredDimension(int i9, int i10) {
        super/*android.view.View*/.setMeasuredDimension(i9, i10);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view) {
        super/*android.view.ViewGroup*/.addView(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i9) {
        super/*android.view.ViewGroup*/.addView(view, i9);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super/*android.view.ViewGroup*/.addView(view, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i9, int i10) {
        super/*android.view.ViewGroup*/.addView(view, i9, i10);
    }
}
