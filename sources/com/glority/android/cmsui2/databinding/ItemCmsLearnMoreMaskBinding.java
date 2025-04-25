package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.cmsui2.R;

/* loaded from: classes14.dex */
public final class ItemCmsLearnMoreMaskBinding implements ViewBinding {
    public final LinearLayout llMoreContainer;
    private final ConstraintLayout rootView;
    public final TextView tvMore;
    public final View vMask;

    private ItemCmsLearnMoreMaskBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, View view) {
        this.rootView = constraintLayout;
        this.llMoreContainer = linearLayout;
        this.tvMore = textView;
        this.vMask = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemCmsLearnMoreMaskBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCmsLearnMoreMaskBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_cms_learn_more_mask, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCmsLearnMoreMaskBinding bind(View view) {
        View findChildViewById;
        int i = R.id.ll_more_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.tv_more;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.v_mask))) != null) {
                return new ItemCmsLearnMoreMaskBinding((ConstraintLayout) view, linearLayout, textView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
