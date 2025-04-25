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
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public final class ItemResultCoinBinding implements ViewBinding {
    public final GlTextView bestMatchTv;
    public final ImageView indexIv;
    public final LinearLayout itemLl;
    public final ImageView ivArrow;
    public final ShapeableImageView ivImg1;
    public final ShapeableImageView ivImg2;
    private final FrameLayout rootView;
    public final LinearLayout titleLl;
    public final GlTextView tvName;

    private ItemResultCoinBinding(FrameLayout rootView, GlTextView bestMatchTv, ImageView indexIv, LinearLayout itemLl, ImageView ivArrow, ShapeableImageView ivImg1, ShapeableImageView ivImg2, LinearLayout titleLl, GlTextView tvName) {
        this.rootView = rootView;
        this.bestMatchTv = bestMatchTv;
        this.indexIv = indexIv;
        this.itemLl = itemLl;
        this.ivArrow = ivArrow;
        this.ivImg1 = ivImg1;
        this.ivImg2 = ivImg2;
        this.titleLl = titleLl;
        this.tvName = tvName;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemResultCoinBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemResultCoinBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_result_coin, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemResultCoinBinding bind(View rootView) {
        int i = R.id.best_match_tv;
        GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
        if (glTextView != null) {
            i = R.id.index_iv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                i = R.id.item_ll;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = R.id.iv_arrow;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                    if (imageView2 != null) {
                        i = R.id.iv_img1;
                        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(rootView, i);
                        if (shapeableImageView != null) {
                            i = R.id.iv_img2;
                            ShapeableImageView shapeableImageView2 = (ShapeableImageView) ViewBindings.findChildViewById(rootView, i);
                            if (shapeableImageView2 != null) {
                                i = R.id.title_ll;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                if (linearLayout2 != null) {
                                    i = R.id.tv_name;
                                    GlTextView glTextView2 = (GlTextView) ViewBindings.findChildViewById(rootView, i);
                                    if (glTextView2 != null) {
                                        return new ItemResultCoinBinding((FrameLayout) rootView, glTextView, imageView, linearLayout, imageView2, shapeableImageView, shapeableImageView2, linearLayout2, glTextView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
