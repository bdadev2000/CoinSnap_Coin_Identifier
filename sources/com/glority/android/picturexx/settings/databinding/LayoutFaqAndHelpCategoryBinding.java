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
public final class LayoutFaqAndHelpCategoryBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final GlTextView tvCategoryTitle;

    private LayoutFaqAndHelpCategoryBinding(ConstraintLayout constraintLayout, GlTextView glTextView) {
        this.rootView = constraintLayout;
        this.tvCategoryTitle = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutFaqAndHelpCategoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutFaqAndHelpCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_faq_and_help_category, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutFaqAndHelpCategoryBinding bind(View view) {
        int i = R.id.tv_category_title;
        GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(view, i);
        if (glTextView != null) {
            return new LayoutFaqAndHelpCategoryBinding((ConstraintLayout) view, glTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
