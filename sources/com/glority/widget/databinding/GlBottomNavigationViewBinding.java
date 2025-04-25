package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlBottomNavigationViewBinding implements ViewBinding {
    public final ImageView centerIv;
    public final LinearLayout endContainer;
    public final View holderV;
    public final LinearLayout itemContainer;
    private final ConstraintLayout rootView;
    public final LinearLayout startContainer;
    public final ImageView topIv;

    private GlBottomNavigationViewBinding(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, View view, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView2) {
        this.rootView = constraintLayout;
        this.centerIv = imageView;
        this.endContainer = linearLayout;
        this.holderV = view;
        this.itemContainer = linearLayout2;
        this.startContainer = linearLayout3;
        this.topIv = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static GlBottomNavigationViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlBottomNavigationViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_bottom_navigation_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlBottomNavigationViewBinding bind(View view) {
        View findViewById;
        int i = R.id.center_iv;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.end_container;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
            if (linearLayout != null && (findViewById = view.findViewById((i = R.id.holder_v))) != null) {
                i = R.id.item_container;
                LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                if (linearLayout2 != null) {
                    i = R.id.start_container;
                    LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i);
                    if (linearLayout3 != null) {
                        i = R.id.top_iv;
                        ImageView imageView2 = (ImageView) view.findViewById(i);
                        if (imageView2 != null) {
                            return new GlBottomNavigationViewBinding((ConstraintLayout) view, imageView, linearLayout, findViewById, linearLayout2, linearLayout3, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
