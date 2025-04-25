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
public final class ItemThirdLevelCoinBinding implements ViewBinding {
    public final ImageView ivImg;
    private final FrameLayout rootView;
    public final GlTextView tvDetail;
    public final GlTextView tvName;

    private ItemThirdLevelCoinBinding(FrameLayout rootView, ImageView ivImg, GlTextView tvDetail, GlTextView tvName) {
        this.rootView = rootView;
        this.ivImg = ivImg;
        this.tvDetail = tvDetail;
        this.tvName = tvName;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemThirdLevelCoinBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemThirdLevelCoinBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_third_level_coin, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemThirdLevelCoinBinding bind(View rootView) {
        int i = R.id.iv_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.tv_detail;
            GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
            if (glTextView != null) {
                i = R.id.tv_name;
                GlTextView glTextView2 = (GlTextView) ViewBindings.findChildViewById(rootView, i);
                if (glTextView2 != null) {
                    return new ItemThirdLevelCoinBinding((FrameLayout) rootView, imageView, glTextView, glTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
