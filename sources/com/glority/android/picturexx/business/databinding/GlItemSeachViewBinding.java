package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public final class GlItemSeachViewBinding implements ViewBinding {
    public final GlTextView descTv;
    public final View dividerV;
    public final ImageView iv;
    public final ImageView iv1;
    private final ConstraintLayout rootView;
    public final GlTextView titleTv;

    private GlItemSeachViewBinding(ConstraintLayout rootView, GlTextView descTv, View dividerV, ImageView iv, ImageView iv1, GlTextView titleTv) {
        this.rootView = rootView;
        this.descTv = descTv;
        this.dividerV = dividerV;
        this.iv = iv;
        this.iv1 = iv1;
        this.titleTv = titleTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static GlItemSeachViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static GlItemSeachViewBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.gl_item_seach_view, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlItemSeachViewBinding bind(View rootView) {
        View findChildViewById;
        int i = R.id.desc_tv;
        GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
        if (glTextView != null && (findChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.divider_v))) != null) {
            i = R.id.iv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                i = R.id.iv1;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                if (imageView2 != null) {
                    i = R.id.title_tv;
                    GlTextView glTextView2 = (GlTextView) ViewBindings.findChildViewById(rootView, i);
                    if (glTextView2 != null) {
                        return new GlItemSeachViewBinding((ConstraintLayout) rootView, glTextView, findChildViewById, imageView, imageView2, glTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
