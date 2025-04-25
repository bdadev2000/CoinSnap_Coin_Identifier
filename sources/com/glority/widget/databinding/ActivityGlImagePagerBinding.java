package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;
import com.glority.widget.imagepager.GlImagePager;

/* loaded from: classes12.dex */
public final class ActivityGlImagePagerBinding implements ViewBinding {
    public final GlImagePager imagePager;
    private final ConstraintLayout rootView;

    private ActivityGlImagePagerBinding(ConstraintLayout constraintLayout, GlImagePager glImagePager) {
        this.rootView = constraintLayout;
        this.imagePager = glImagePager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityGlImagePagerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGlImagePagerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_gl_image_pager, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityGlImagePagerBinding bind(View view) {
        int i = R.id.image_pager;
        GlImagePager glImagePager = (GlImagePager) view.findViewById(i);
        if (glImagePager != null) {
            return new ActivityGlImagePagerBinding((ConstraintLayout) view, glImagePager);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
