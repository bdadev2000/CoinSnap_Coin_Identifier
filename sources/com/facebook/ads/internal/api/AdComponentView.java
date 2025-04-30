package com.facebook.ads.internal.api;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface AdComponentView {
    void addView(View view);

    void addView(View view, int i9);

    void addView(View view, int i9, int i10);

    void addView(View view, int i9, ViewGroup.LayoutParams layoutParams);

    void addView(View view, ViewGroup.LayoutParams layoutParams);

    void onWindowFocusChanged(boolean z8);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);
}
