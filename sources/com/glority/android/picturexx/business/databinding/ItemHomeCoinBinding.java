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
public final class ItemHomeCoinBinding implements ViewBinding {
    public final ImageView ivImg;
    private final ConstraintLayout rootView;
    public final GlTextView tvTitle;

    private ItemHomeCoinBinding(ConstraintLayout rootView, ImageView ivImg, GlTextView tvTitle) {
        this.rootView = rootView;
        this.ivImg = ivImg;
        this.tvTitle = tvTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemHomeCoinBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemHomeCoinBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_home_coin, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHomeCoinBinding bind(View rootView) {
        int i = R.id.iv_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.tv_title;
            GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
            if (glTextView != null) {
                return new ItemHomeCoinBinding((ConstraintLayout) rootView, imageView, glTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
