package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.cmsui2.R;

/* loaded from: classes14.dex */
public final class CmsLoadingViewBinding implements ViewBinding {
    public final ProgressBar cmsLoadingPb;
    private final FrameLayout rootView;

    private CmsLoadingViewBinding(FrameLayout frameLayout, ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.cmsLoadingPb = progressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static CmsLoadingViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CmsLoadingViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.cms_loading_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CmsLoadingViewBinding bind(View view) {
        int i = R.id.cms_loading_pb;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            return new CmsLoadingViewBinding((FrameLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
