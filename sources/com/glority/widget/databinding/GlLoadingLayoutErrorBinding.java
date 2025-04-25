package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlLoadingLayoutErrorBinding implements ViewBinding {
    private final FrameLayout rootView;

    private GlLoadingLayoutErrorBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static GlLoadingLayoutErrorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlLoadingLayoutErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_loading_layout_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlLoadingLayoutErrorBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new GlLoadingLayoutErrorBinding((FrameLayout) view);
    }
}
