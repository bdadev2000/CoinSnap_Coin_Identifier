package com.glority.reviewpopview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.reviewpopview.R;

/* loaded from: classes9.dex */
public final class ReviewPopviewDialogRequestRatingBinding implements ViewBinding {
    public final TextView desc;
    public final ImageView ivClose;
    private final ConstraintLayout rootView;
    public final Button tvGoToRate;
    public final TextView tvNotNow;

    private ReviewPopviewDialogRequestRatingBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, Button button, TextView textView2) {
        this.rootView = constraintLayout;
        this.desc = textView;
        this.ivClose = imageView;
        this.tvGoToRate = button;
        this.tvNotNow = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ReviewPopviewDialogRequestRatingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ReviewPopviewDialogRequestRatingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.review_popview_dialog_request_rating, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ReviewPopviewDialogRequestRatingBinding bind(View view) {
        int i = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.iv_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tv_go_to_rate;
                Button button = (Button) ViewBindings.findChildViewById(view, i);
                if (button != null) {
                    i = R.id.tv_not_now;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new ReviewPopviewDialogRequestRatingBinding((ConstraintLayout) view, textView, imageView, button, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
