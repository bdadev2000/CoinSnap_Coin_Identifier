package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class ItemHomeHeaderBinding implements ViewBinding {
    public final LinearLayout clTopGroup;
    public final LinearLayout llCapture;
    public final LinearLayout llShare;
    public final LinearLayout llVip;
    private final LinearLayout rootView;

    private ItemHomeHeaderBinding(LinearLayout rootView, LinearLayout clTopGroup, LinearLayout llCapture, LinearLayout llShare, LinearLayout llVip) {
        this.rootView = rootView;
        this.clTopGroup = clTopGroup;
        this.llCapture = llCapture;
        this.llShare = llShare;
        this.llVip = llVip;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemHomeHeaderBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemHomeHeaderBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_home_header, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHomeHeaderBinding bind(View rootView) {
        int i = R.id.cl_top_group;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = R.id.ll_capture;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
            if (linearLayout2 != null) {
                i = R.id.ll_share;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                if (linearLayout3 != null) {
                    i = R.id.ll_vip;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                    if (linearLayout4 != null) {
                        return new ItemHomeHeaderBinding((LinearLayout) rootView, linearLayout, linearLayout2, linearLayout3, linearLayout4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
