package com.glority.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.base.R;
import com.glority.widget.GlTextView;

/* loaded from: classes6.dex */
public final class ItemContentFeedbackLayoutBinding implements ViewBinding {
    public final ImageView backIv;
    public final LinearLayout bgLl;
    public final LinearLayout containerLl;
    private final FrameLayout rootView;
    public final LinearLayout titleLl;
    public final GlTextView titleTv;

    private ItemContentFeedbackLayoutBinding(FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, GlTextView glTextView) {
        this.rootView = frameLayout;
        this.backIv = imageView;
        this.bgLl = linearLayout;
        this.containerLl = linearLayout2;
        this.titleLl = linearLayout3;
        this.titleTv = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemContentFeedbackLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemContentFeedbackLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_content_feedback_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemContentFeedbackLayoutBinding bind(View view) {
        int i = R.id.back_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.bg_ll;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.container_ll;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.title_ll;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.title_tv;
                        GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(view, i);
                        if (glTextView != null) {
                            return new ItemContentFeedbackLayoutBinding((FrameLayout) view, imageView, linearLayout, linearLayout2, linearLayout3, glTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
