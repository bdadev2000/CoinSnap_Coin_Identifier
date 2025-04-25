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
public final class DialogRecognizePriceFeedbackBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final ViewPager2 vp2;

    private DialogRecognizePriceFeedbackBinding(FrameLayout rootView, ViewPager2 vp2) {
        this.rootView = rootView;
        this.vp2 = vp2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static DialogRecognizePriceFeedbackBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogRecognizePriceFeedbackBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_recognize_price_feedback, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogRecognizePriceFeedbackBinding bind(View rootView) {
        int i = R.id.vp2;
        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(rootView, i);
        if (viewPager2 != null) {
            return new DialogRecognizePriceFeedbackBinding((FrameLayout) rootView, viewPager2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
