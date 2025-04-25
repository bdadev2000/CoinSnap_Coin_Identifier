package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public final class ItemSecondLevelCoinBinding implements ViewBinding {
    public final ImageView ivArrow;
    public final ImageView ivImg;
    private final FrameLayout rootView;
    public final GlTextView tvName;

    private ItemSecondLevelCoinBinding(FrameLayout rootView, ImageView ivArrow, ImageView ivImg, GlTextView tvName) {
        this.rootView = rootView;
        this.ivArrow = ivArrow;
        this.ivImg = ivImg;
        this.tvName = tvName;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemSecondLevelCoinBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemSecondLevelCoinBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_second_level_coin, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSecondLevelCoinBinding bind(View rootView) {
        int i = R.id.iv_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.iv_img;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = R.id.tv_name;
                GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
                if (glTextView != null) {
                    return new ItemSecondLevelCoinBinding((FrameLayout) rootView, imageView, imageView2, glTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
