package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.cmsui2.R;
import com.glority.widget.GlTextView;

/* loaded from: classes14.dex */
public final class CmsItemGradingBinding implements ViewBinding {
    public final TextView infoTv;
    public final ImageView iv;
    public final GlTextView levelTv;
    private final LinearLayout rootView;
    public final GlTextView toKnowMoreTv;

    private CmsItemGradingBinding(LinearLayout linearLayout, TextView textView, ImageView imageView, GlTextView glTextView, GlTextView glTextView2) {
        this.rootView = linearLayout;
        this.infoTv = textView;
        this.iv = imageView;
        this.levelTv = glTextView;
        this.toKnowMoreTv = glTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CmsItemGradingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CmsItemGradingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.cms_item_grading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CmsItemGradingBinding bind(View view) {
        int i = R.id.info_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.iv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.level_tv;
                GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(view, i);
                if (glTextView != null) {
                    i = R.id.to_know_more_tv;
                    GlTextView glTextView2 = (GlTextView) ViewBindings.findChildViewById(view, i);
                    if (glTextView2 != null) {
                        return new CmsItemGradingBinding((LinearLayout) view, textView, imageView, glTextView, glTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
