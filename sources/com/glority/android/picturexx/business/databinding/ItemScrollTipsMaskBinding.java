package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class ItemScrollTipsMaskBinding implements ViewBinding {
    public final ImageView iv1;
    private final ConstraintLayout rootView;
    public final TextView tv1;

    private ItemScrollTipsMaskBinding(ConstraintLayout rootView, ImageView iv1, TextView tv1) {
        this.rootView = rootView;
        this.iv1 = iv1;
        this.tv1 = tv1;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemScrollTipsMaskBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemScrollTipsMaskBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_scroll_tips_mask, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemScrollTipsMaskBinding bind(View rootView) {
        int i = R.id.iv1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.tv1;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                return new ItemScrollTipsMaskBinding((ConstraintLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
