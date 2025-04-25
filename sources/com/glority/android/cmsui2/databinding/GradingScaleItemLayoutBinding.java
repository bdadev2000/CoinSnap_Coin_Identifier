package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.cmsui2.R;
import com.glority.widget.GlTextView;

/* loaded from: classes14.dex */
public final class GradingScaleItemLayoutBinding implements ViewBinding {
    public final ImageView arrowIv;
    public final ImageView iv;
    public final GlTextView nameTv;
    private final LinearLayout rootView;
    public final LinearLayout scaleTypeLl;

    private GradingScaleItemLayoutBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, GlTextView glTextView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.arrowIv = imageView;
        this.iv = imageView2;
        this.nameTv = glTextView;
        this.scaleTypeLl = linearLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GradingScaleItemLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GradingScaleItemLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.grading_scale_item_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GradingScaleItemLayoutBinding bind(View view) {
        int i = R.id.arrow_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.iv;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.name_tv;
                GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(view, i);
                if (glTextView != null) {
                    i = R.id.scale_type_ll;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        return new GradingScaleItemLayoutBinding((LinearLayout) view, imageView, imageView2, glTextView, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
