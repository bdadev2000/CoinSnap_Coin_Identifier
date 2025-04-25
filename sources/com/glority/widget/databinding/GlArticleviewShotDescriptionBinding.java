package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.GlTextView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlArticleviewShotDescriptionBinding implements ViewBinding {
    public final LinearLayout container;
    public final View dividerV;
    public final ImageView iv;
    private final LinearLayout rootView;
    public final GlTextView titleTv;

    private GlArticleviewShotDescriptionBinding(LinearLayout linearLayout, LinearLayout linearLayout2, View view, ImageView imageView, GlTextView glTextView) {
        this.rootView = linearLayout;
        this.container = linearLayout2;
        this.dividerV = view;
        this.iv = imageView;
        this.titleTv = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlArticleviewShotDescriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlArticleviewShotDescriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_articleview_shot_description, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlArticleviewShotDescriptionBinding bind(View view) {
        View findViewById;
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
        if (linearLayout != null && (findViewById = view.findViewById((i = R.id.divider_v))) != null) {
            i = R.id.iv;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R.id.title_tv;
                GlTextView glTextView = (GlTextView) view.findViewById(i);
                if (glTextView != null) {
                    return new GlArticleviewShotDescriptionBinding((LinearLayout) view, linearLayout, findViewById, imageView, glTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
