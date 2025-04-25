package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlPurchaseLayout9Binding implements ViewBinding {
    public final TextView continueTv;
    private final LinearLayout rootView;
    public final TextView tryTv;

    private GlPurchaseLayout9Binding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.continueTv = textView;
        this.tryTv = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlPurchaseLayout9Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlPurchaseLayout9Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_purchase_layout9, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlPurchaseLayout9Binding bind(View view) {
        int i = R.id.continue_tv;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.try_tv;
            TextView textView2 = (TextView) view.findViewById(i);
            if (textView2 != null) {
                return new GlPurchaseLayout9Binding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
