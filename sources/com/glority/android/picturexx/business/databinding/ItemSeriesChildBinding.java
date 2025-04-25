package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public final class ItemSeriesChildBinding implements ViewBinding {
    public final ImageView iv1;
    public final ImageView iv2;
    public final FrameLayout ivContainer;
    public final GlTextView nameTv;
    private final LinearLayout rootView;

    private ItemSeriesChildBinding(LinearLayout rootView, ImageView iv1, ImageView iv2, FrameLayout ivContainer, GlTextView nameTv) {
        this.rootView = rootView;
        this.iv1 = iv1;
        this.iv2 = iv2;
        this.ivContainer = ivContainer;
        this.nameTv = nameTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemSeriesChildBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemSeriesChildBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_series_child, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSeriesChildBinding bind(View rootView) {
        int i = R.id.iv1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.iv2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = R.id.iv_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                if (frameLayout != null) {
                    i = R.id.name_tv;
                    GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
                    if (glTextView != null) {
                        return new ItemSeriesChildBinding((LinearLayout) rootView, imageView, imageView2, frameLayout, glTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
