package com.glority.android.picturexx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.R;

/* loaded from: classes2.dex */
public final class AgreementFragmentAgreementBinding implements ViewBinding {
    public final TextView ivLogo;
    private final ConstraintLayout rootView;
    public final ConstraintLayout splashPolicyContainer;
    public final TextView tvPolicyContinue;
    public final TextView tvPolicyHint;

    private AgreementFragmentAgreementBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.ivLogo = textView;
        this.splashPolicyContainer = constraintLayout2;
        this.tvPolicyContinue = textView2;
        this.tvPolicyHint = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AgreementFragmentAgreementBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AgreementFragmentAgreementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.agreement_fragment_agreement, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AgreementFragmentAgreementBinding bind(View view) {
        int i = R.id.iv_logo;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.tv_policy_continue;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.tv_policy_hint;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    return new AgreementFragmentAgreementBinding(constraintLayout, textView, constraintLayout, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
