package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlArticleviewTableItemBinding implements ViewBinding {
    public final View dividerV;
    private final LinearLayout rootView;
    public final TextView tv1;
    public final TextView tv2;

    private GlArticleviewTableItemBinding(LinearLayout linearLayout, View view, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.dividerV = view;
        this.tv1 = textView;
        this.tv2 = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlArticleviewTableItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlArticleviewTableItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_articleview_table_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlArticleviewTableItemBinding bind(View view) {
        int i = R.id.divider_v;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            i = R.id.tv1;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = R.id.tv2;
                TextView textView2 = (TextView) view.findViewById(i);
                if (textView2 != null) {
                    return new GlArticleviewTableItemBinding((LinearLayout) view, findViewById, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
