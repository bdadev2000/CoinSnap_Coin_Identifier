package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class DialogGradeFeedbackBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final ViewPager2 vp2;

    private DialogGradeFeedbackBinding(FrameLayout rootView, ViewPager2 vp2) {
        this.rootView = rootView;
        this.vp2 = vp2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static DialogGradeFeedbackBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogGradeFeedbackBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_grade_feedback, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogGradeFeedbackBinding bind(View rootView) {
        int i = R.id.vp2;
        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(rootView, i);
        if (viewPager2 != null) {
            return new DialogGradeFeedbackBinding((FrameLayout) rootView, viewPager2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
