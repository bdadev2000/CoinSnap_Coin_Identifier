package com.glority.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.glority.base.R;

/* loaded from: classes6.dex */
public final class DialogContentFeedbackBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final ViewPager2 vp2;

    private DialogContentFeedbackBinding(FrameLayout frameLayout, ViewPager2 viewPager2) {
        this.rootView = frameLayout;
        this.vp2 = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static DialogContentFeedbackBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogContentFeedbackBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_content_feedback, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogContentFeedbackBinding bind(View view) {
        int i = R.id.vp2;
        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
        if (viewPager2 != null) {
            return new DialogContentFeedbackBinding((FrameLayout) view, viewPager2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
