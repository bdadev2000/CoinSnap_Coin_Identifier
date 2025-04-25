package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.settings.R;

/* loaded from: classes5.dex */
public final class LayoutFaqAndHelpQuestionAnswerBinding implements ViewBinding {
    public final ImageView ivFaqIndicator;
    public final LinearLayout llFaqQuestion;
    private final ConstraintLayout rootView;
    public final TextView tvFaqAnswer;
    public final TextView tvFaqQuestion;

    private LayoutFaqAndHelpQuestionAnswerBinding(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.ivFaqIndicator = imageView;
        this.llFaqQuestion = linearLayout;
        this.tvFaqAnswer = textView;
        this.tvFaqQuestion = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutFaqAndHelpQuestionAnswerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutFaqAndHelpQuestionAnswerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_faq_and_help_question_answer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutFaqAndHelpQuestionAnswerBinding bind(View view) {
        int i = R.id.iv_faq_indicator;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ll_faq_question;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.tv_faq_answer;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_faq_question;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new LayoutFaqAndHelpQuestionAnswerBinding((ConstraintLayout) view, imageView, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
