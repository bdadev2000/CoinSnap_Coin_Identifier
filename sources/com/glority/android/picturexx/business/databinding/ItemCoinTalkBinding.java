package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public final class ItemCoinTalkBinding implements ViewBinding {
    public final ShapeableImageView iv;
    private final ConstraintLayout rootView;
    public final GlTextView titleTv;
    public final GlTextView typeTv;

    private ItemCoinTalkBinding(ConstraintLayout rootView, ShapeableImageView iv, GlTextView titleTv, GlTextView typeTv) {
        this.rootView = rootView;
        this.iv = iv;
        this.titleTv = titleTv;
        this.typeTv = typeTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemCoinTalkBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemCoinTalkBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_coin_talk, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCoinTalkBinding bind(View rootView) {
        int i = R.id.iv;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(rootView, i);
        if (shapeableImageView != null) {
            i = R.id.title_tv;
            GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
            if (glTextView != null) {
                i = R.id.type_tv;
                GlTextView glTextView2 = (GlTextView) ViewBindings.findChildViewById(rootView, i);
                if (glTextView2 != null) {
                    return new ItemCoinTalkBinding((ConstraintLayout) rootView, shapeableImageView, glTextView, glTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
