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
public final class GlArticleviewTableImageBinding implements ViewBinding {
    public final LinearLayout containerV;
    public final View dividerV;
    public final ImageView iv;
    public final View maskView;
    public final ImageView moreIv;
    public final LinearLayout moreLl;
    public final TextView moreTv;
    public final LinearLayout moreView;
    private final LinearLayout rootView;
    public final GlTextView titleTv;

    private GlArticleviewTableImageBinding(LinearLayout linearLayout, LinearLayout linearLayout2, View view, ImageView imageView, View view2, ImageView imageView2, LinearLayout linearLayout3, TextView textView, LinearLayout linearLayout4, GlTextView glTextView) {
        this.rootView = linearLayout;
        this.containerV = linearLayout2;
        this.dividerV = view;
        this.iv = imageView;
        this.maskView = view2;
        this.moreIv = imageView2;
        this.moreLl = linearLayout3;
        this.moreTv = textView;
        this.moreView = linearLayout4;
        this.titleTv = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlArticleviewTableImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlArticleviewTableImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_articleview_table_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlArticleviewTableImageBinding bind(View view) {
        View findViewById;
        View findViewById2;
        int i = R.id.container_v;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
        if (linearLayout != null && (findViewById = view.findViewById((i = R.id.divider_v))) != null) {
            i = R.id.iv;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null && (findViewById2 = view.findViewById((i = R.id.mask_view))) != null) {
                i = R.id.more_iv;
                ImageView imageView2 = (ImageView) view.findViewById(i);
                if (imageView2 != null) {
                    i = R.id.more_ll;
                    LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                    if (linearLayout2 != null) {
                        i = R.id.more_tv;
                        TextView textView = (TextView) view.findViewById(i);
                        if (textView != null) {
                            i = R.id.more_view;
                            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i);
                            if (linearLayout3 != null) {
                                i = R.id.title_tv;
                                GlTextView glTextView = (GlTextView) view.findViewById(i);
                                if (glTextView != null) {
                                    return new GlArticleviewTableImageBinding((LinearLayout) view, linearLayout, findViewById, imageView, findViewById2, imageView2, linearLayout2, textView, linearLayout3, glTextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
