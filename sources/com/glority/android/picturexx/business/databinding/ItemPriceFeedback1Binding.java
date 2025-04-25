package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public final class ItemPriceFeedback1Binding implements ViewBinding {
    public final GlTextView case1Tv;
    public final GlTextView case2Tv;
    public final GlTextView case3Tv;
    public final GlTextView case4Tv;
    public final LinearLayout case5Tv;
    private final LinearLayout rootView;

    private ItemPriceFeedback1Binding(LinearLayout rootView, GlTextView case1Tv, GlTextView case2Tv, GlTextView case3Tv, GlTextView case4Tv, LinearLayout case5Tv) {
        this.rootView = rootView;
        this.case1Tv = case1Tv;
        this.case2Tv = case2Tv;
        this.case3Tv = case3Tv;
        this.case4Tv = case4Tv;
        this.case5Tv = case5Tv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemPriceFeedback1Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemPriceFeedback1Binding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_price_feedback1, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemPriceFeedback1Binding bind(View rootView) {
        int i = R.id.case1_tv;
        GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
        if (glTextView != null) {
            i = R.id.case2_tv;
            GlTextView glTextView2 = (GlTextView) ViewBindings.findChildViewById(rootView, i);
            if (glTextView2 != null) {
                i = R.id.case3_tv;
                GlTextView glTextView3 = (GlTextView) ViewBindings.findChildViewById(rootView, i);
                if (glTextView3 != null) {
                    i = R.id.case4_tv;
                    GlTextView glTextView4 = (GlTextView) ViewBindings.findChildViewById(rootView, i);
                    if (glTextView4 != null) {
                        i = R.id.case5_tv;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                        if (linearLayout != null) {
                            return new ItemPriceFeedback1Binding((LinearLayout) rootView, glTextView, glTextView2, glTextView3, glTextView4, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
