package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public final class CoinLoadingErrorLayoutBinding implements ViewBinding {
    public final MaterialButton retryBt;
    private final LinearLayout rootView;

    private CoinLoadingErrorLayoutBinding(LinearLayout rootView, MaterialButton retryBt) {
        this.rootView = rootView;
        this.retryBt = retryBt;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CoinLoadingErrorLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static CoinLoadingErrorLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.coin_loading_error_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static CoinLoadingErrorLayoutBinding bind(View rootView) {
        int i = R.id.retry_bt;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(rootView, i);
        if (materialButton != null) {
            return new CoinLoadingErrorLayoutBinding((LinearLayout) rootView, materialButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
