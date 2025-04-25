package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlItemArticleOtherBinding implements ViewBinding {
    public final TextView keyTv;
    private final LinearLayout rootView;
    public final TextView valueTv;

    private GlItemArticleOtherBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.keyTv = textView;
        this.valueTv = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlItemArticleOtherBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlItemArticleOtherBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_item_article_other, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlItemArticleOtherBinding bind(View view) {
        int i = R.id.key_tv;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.value_tv;
            TextView textView2 = (TextView) view.findViewById(i);
            if (textView2 != null) {
                return new GlItemArticleOtherBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
