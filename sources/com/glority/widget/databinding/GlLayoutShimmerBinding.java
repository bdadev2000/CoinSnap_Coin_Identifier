package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;
import com.glority.widget.skeleton.ShimmerLayout;

/* loaded from: classes12.dex */
public final class GlLayoutShimmerBinding implements ViewBinding {
    private final ShimmerLayout rootView;

    private GlLayoutShimmerBinding(ShimmerLayout shimmerLayout) {
        this.rootView = shimmerLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShimmerLayout getRoot() {
        return this.rootView;
    }

    public static GlLayoutShimmerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlLayoutShimmerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_layout_shimmer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlLayoutShimmerBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new GlLayoutShimmerBinding((ShimmerLayout) view);
    }
}
