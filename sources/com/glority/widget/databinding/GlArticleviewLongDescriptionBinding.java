package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.GlTextView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlArticleviewLongDescriptionBinding implements ViewBinding {
    public final TextView contentTv;
    public final View dividerV;
    public final TextView infoTv;
    public final ImageView iv;
    private final LinearLayout rootView;
    public final GlTextView titleTv;

    private GlArticleviewLongDescriptionBinding(LinearLayout linearLayout, TextView textView, View view, TextView textView2, ImageView imageView, GlTextView glTextView) {
        this.rootView = linearLayout;
        this.contentTv = textView;
        this.dividerV = view;
        this.infoTv = textView2;
        this.iv = imageView;
        this.titleTv = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlArticleviewLongDescriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlArticleviewLongDescriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_articleview_long_description, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlArticleviewLongDescriptionBinding bind(View view) {
        View findViewById;
        int i = R.id.content_tv;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null && (findViewById = view.findViewById((i = R.id.divider_v))) != null) {
            i = R.id.info_tv;
            TextView textView2 = (TextView) view.findViewById(i);
            if (textView2 != null) {
                i = R.id.iv;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    i = R.id.title_tv;
                    GlTextView glTextView = (GlTextView) view.findViewById(i);
                    if (glTextView != null) {
                        return new GlArticleviewLongDescriptionBinding((LinearLayout) view, textView, findViewById, textView2, imageView, glTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
