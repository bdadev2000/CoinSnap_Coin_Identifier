package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class ItemBackToTopBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final LinearLayout totopLl;

    private ItemBackToTopBinding(FrameLayout rootView, LinearLayout totopLl) {
        this.rootView = rootView;
        this.totopLl = totopLl;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemBackToTopBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemBackToTopBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_back_to_top, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemBackToTopBinding bind(View rootView) {
        int i = R.id.totop_ll;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
        if (linearLayout != null) {
            return new ItemBackToTopBinding((FrameLayout) rootView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
