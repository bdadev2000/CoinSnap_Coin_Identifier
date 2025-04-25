package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class ItemHomeHeaderCategoryBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final TextView tvListTitle;

    private ItemHomeHeaderCategoryBinding(FrameLayout rootView, TextView tvListTitle) {
        this.rootView = rootView;
        this.tvListTitle = tvListTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemHomeHeaderCategoryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemHomeHeaderCategoryBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_home_header_category, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHomeHeaderCategoryBinding bind(View rootView) {
        int i = R.id.tv_list_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            return new ItemHomeHeaderCategoryBinding((FrameLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
