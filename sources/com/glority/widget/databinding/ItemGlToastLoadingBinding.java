package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class ItemGlToastLoadingBinding implements ViewBinding {
    public final ProgressBar iv;
    private final RelativeLayout rootView;

    private ItemGlToastLoadingBinding(RelativeLayout relativeLayout, ProgressBar progressBar) {
        this.rootView = relativeLayout;
        this.iv = progressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemGlToastLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemGlToastLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_gl_toast_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemGlToastLoadingBinding bind(View view) {
        int i = R.id.iv;
        ProgressBar progressBar = (ProgressBar) view.findViewById(i);
        if (progressBar != null) {
            return new ItemGlToastLoadingBinding((RelativeLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
