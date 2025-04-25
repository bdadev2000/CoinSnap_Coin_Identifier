package com.glority.android.picturexx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.android.picturexx.R;

/* loaded from: classes2.dex */
public final class CoinLoadingLayoutBinding implements ViewBinding {
    private final FrameLayout rootView;

    private CoinLoadingLayoutBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static CoinLoadingLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CoinLoadingLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.coin_loading_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CoinLoadingLayoutBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new CoinLoadingLayoutBinding((FrameLayout) view);
    }
}
