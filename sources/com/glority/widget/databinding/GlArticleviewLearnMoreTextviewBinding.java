package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlArticleviewLearnMoreTextviewBinding implements ViewBinding {
    public final View maskView;
    public final ImageView moreIv;
    public final TextView moreTv;
    public final LinearLayout moreView;
    private final LinearLayout rootView;
    public final TextView textTv;

    private GlArticleviewLearnMoreTextviewBinding(LinearLayout linearLayout, View view, ImageView imageView, TextView textView, LinearLayout linearLayout2, TextView textView2) {
        this.rootView = linearLayout;
        this.maskView = view;
        this.moreIv = imageView;
        this.moreTv = textView;
        this.moreView = linearLayout2;
        this.textTv = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlArticleviewLearnMoreTextviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlArticleviewLearnMoreTextviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_articleview_learn_more_textview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlArticleviewLearnMoreTextviewBinding bind(View view) {
        int i = R.id.mask_view;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            i = R.id.more_iv;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R.id.more_tv;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = R.id.more_view;
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                    if (linearLayout != null) {
                        i = R.id.text_tv;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            return new GlArticleviewLearnMoreTextviewBinding((LinearLayout) view, findViewById, imageView, textView, linearLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
