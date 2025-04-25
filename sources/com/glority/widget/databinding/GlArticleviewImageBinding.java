package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.glority.widget.GlTextView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlArticleviewImageBinding implements ViewBinding {
    public final View dividerV;
    public final TextView indicatorTv;
    public final ImageView iv;
    private final LinearLayout rootView;
    public final GlTextView titleTv;
    public final ViewPager2 vp2;

    private GlArticleviewImageBinding(LinearLayout linearLayout, View view, TextView textView, ImageView imageView, GlTextView glTextView, ViewPager2 viewPager2) {
        this.rootView = linearLayout;
        this.dividerV = view;
        this.indicatorTv = textView;
        this.iv = imageView;
        this.titleTv = glTextView;
        this.vp2 = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlArticleviewImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlArticleviewImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_articleview_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlArticleviewImageBinding bind(View view) {
        int i = R.id.divider_v;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            i = R.id.indicator_tv;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = R.id.iv;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    i = R.id.title_tv;
                    GlTextView glTextView = (GlTextView) view.findViewById(i);
                    if (glTextView != null) {
                        i = R.id.vp2;
                        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(i);
                        if (viewPager2 != null) {
                            return new GlArticleviewImageBinding((LinearLayout) view, findViewById, textView, imageView, glTextView, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
