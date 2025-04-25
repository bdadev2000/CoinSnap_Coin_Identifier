package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public final class CoinNotFoundBinding implements ViewBinding {
    public final LinearLayout llTitle;
    private final ConstraintLayout rootView;
    public final MaterialButton tvRetake;
    public final TextView tvTips;

    private CoinNotFoundBinding(ConstraintLayout rootView, LinearLayout llTitle, MaterialButton tvRetake, TextView tvTips) {
        this.rootView = rootView;
        this.llTitle = llTitle;
        this.tvRetake = tvRetake;
        this.tvTips = tvTips;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static CoinNotFoundBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static CoinNotFoundBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.coin_not_found, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static CoinNotFoundBinding bind(View rootView) {
        int i = R.id.ll_title;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = R.id.tv_retake;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(rootView, i);
            if (materialButton != null) {
                i = R.id.tv_tips;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    return new CoinNotFoundBinding((ConstraintLayout) rootView, linearLayout, materialButton, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
