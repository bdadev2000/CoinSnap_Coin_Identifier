package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.cmsui2.R;
import com.glority.widget.GlTextView;

/* loaded from: classes14.dex */
public final class CmsJoinRedditBinding implements ViewBinding {
    public final ImageView iv;
    private final LinearLayout rootView;
    public final GlTextView tv1;

    private CmsJoinRedditBinding(LinearLayout linearLayout, ImageView imageView, GlTextView glTextView) {
        this.rootView = linearLayout;
        this.iv = imageView;
        this.tv1 = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CmsJoinRedditBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CmsJoinRedditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.cms_join_reddit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CmsJoinRedditBinding bind(View view) {
        int i = R.id.iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tv1;
            GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(view, i);
            if (glTextView != null) {
                return new CmsJoinRedditBinding((LinearLayout) view, imageView, glTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
