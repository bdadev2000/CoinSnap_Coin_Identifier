package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.GlTextView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlPurchaseLayout2Binding implements ViewBinding {
    public final TextView continueTv;
    public final TextView descTv;
    private final LinearLayout rootView;
    public final GlTextView tryTv;

    private GlPurchaseLayout2Binding(LinearLayout linearLayout, TextView textView, TextView textView2, GlTextView glTextView) {
        this.rootView = linearLayout;
        this.continueTv = textView;
        this.descTv = textView2;
        this.tryTv = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlPurchaseLayout2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlPurchaseLayout2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_purchase_layout2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlPurchaseLayout2Binding bind(View view) {
        int i = R.id.continue_tv;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.desc_tv;
            TextView textView2 = (TextView) view.findViewById(i);
            if (textView2 != null) {
                i = R.id.try_tv;
                GlTextView glTextView = (GlTextView) view.findViewById(i);
                if (glTextView != null) {
                    return new GlPurchaseLayout2Binding((LinearLayout) view, textView, textView2, glTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
