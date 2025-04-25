package com.glority.android.picturexx.payment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.payment.R;

/* loaded from: classes2.dex */
public final class CustomPurchaseLoadingBinding implements ViewBinding {
    public final ProgressBar iv;
    private final RelativeLayout rootView;

    private CustomPurchaseLoadingBinding(RelativeLayout relativeLayout, ProgressBar progressBar) {
        this.rootView = relativeLayout;
        this.iv = progressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static CustomPurchaseLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CustomPurchaseLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.custom_purchase_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CustomPurchaseLoadingBinding bind(View view) {
        int i = R.id.iv;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            return new CustomPurchaseLoadingBinding((RelativeLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
