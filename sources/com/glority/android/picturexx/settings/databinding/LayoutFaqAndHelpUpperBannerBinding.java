package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.settings.R;
import com.glority.widget.GlTextView;

/* loaded from: classes5.dex */
public final class LayoutFaqAndHelpUpperBannerBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final GlTextView tvFaqTitle;

    private LayoutFaqAndHelpUpperBannerBinding(ConstraintLayout constraintLayout, GlTextView glTextView) {
        this.rootView = constraintLayout;
        this.tvFaqTitle = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutFaqAndHelpUpperBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutFaqAndHelpUpperBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_faq_and_help_upper_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutFaqAndHelpUpperBannerBinding bind(View view) {
        int i = R.id.tv_faq_title;
        GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(view, i);
        if (glTextView != null) {
            return new LayoutFaqAndHelpUpperBannerBinding((ConstraintLayout) view, glTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
