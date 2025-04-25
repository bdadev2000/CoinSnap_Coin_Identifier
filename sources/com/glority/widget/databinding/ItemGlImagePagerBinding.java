package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;
import com.glority.widget.imagepager.GlImageViewTouch;

/* loaded from: classes12.dex */
public final class ItemGlImagePagerBinding implements ViewBinding {
    private final GlImageViewTouch rootView;
    public final GlImageViewTouch touchImageView;

    private ItemGlImagePagerBinding(GlImageViewTouch glImageViewTouch, GlImageViewTouch glImageViewTouch2) {
        this.rootView = glImageViewTouch;
        this.touchImageView = glImageViewTouch2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public GlImageViewTouch getRoot() {
        return this.rootView;
    }

    public static ItemGlImagePagerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemGlImagePagerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_gl_image_pager, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemGlImagePagerBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        GlImageViewTouch glImageViewTouch = (GlImageViewTouch) view;
        return new ItemGlImagePagerBinding(glImageViewTouch, glImageViewTouch);
    }
}
