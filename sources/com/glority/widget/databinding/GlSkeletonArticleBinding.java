package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlSkeletonArticleBinding implements ViewBinding {
    private final LinearLayout rootView;

    private GlSkeletonArticleBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlSkeletonArticleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlSkeletonArticleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_skeleton_article, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlSkeletonArticleBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new GlSkeletonArticleBinding((LinearLayout) view);
    }
}
