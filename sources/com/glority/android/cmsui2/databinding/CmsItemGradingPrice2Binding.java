package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.cmsui2.R;
import com.glority.widget.GlTextView;

/* loaded from: classes14.dex */
public final class CmsItemGradingPrice2Binding implements ViewBinding {
    public final TextView priceTitleTv;
    public final GlTextView priceValueTv;
    private final LinearLayout rootView;

    private CmsItemGradingPrice2Binding(LinearLayout linearLayout, TextView textView, GlTextView glTextView) {
        this.rootView = linearLayout;
        this.priceTitleTv = textView;
        this.priceValueTv = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CmsItemGradingPrice2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CmsItemGradingPrice2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.cms_item_grading_price2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CmsItemGradingPrice2Binding bind(View view) {
        int i = R.id.price_title_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.price_value_tv;
            GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(view, i);
            if (glTextView != null) {
                return new CmsItemGradingPrice2Binding((LinearLayout) view, textView, glTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
