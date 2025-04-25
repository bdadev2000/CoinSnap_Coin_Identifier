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
public final class CmsItemGradingPriceBinding implements ViewBinding {
    public final LinearLayout container;
    public final LinearLayout mintageLl;
    public final GlTextView mintageTv;
    public final TextView priceIntroduceTv;
    private final LinearLayout rootView;
    public final TextView timeTv;
    public final LinearLayout yearLl;
    public final GlTextView yearTv;

    private CmsItemGradingPriceBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, GlTextView glTextView, TextView textView, TextView textView2, LinearLayout linearLayout4, GlTextView glTextView2) {
        this.rootView = linearLayout;
        this.container = linearLayout2;
        this.mintageLl = linearLayout3;
        this.mintageTv = glTextView;
        this.priceIntroduceTv = textView;
        this.timeTv = textView2;
        this.yearLl = linearLayout4;
        this.yearTv = glTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CmsItemGradingPriceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CmsItemGradingPriceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.cms_item_grading_price, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CmsItemGradingPriceBinding bind(View view) {
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.mintage_ll;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.mintage_tv;
                GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(view, i);
                if (glTextView != null) {
                    i = R.id.price_introduce_tv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.time_tv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.year_ll;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout3 != null) {
                                i = R.id.year_tv;
                                GlTextView glTextView2 = (GlTextView) ViewBindings.findChildViewById(view, i);
                                if (glTextView2 != null) {
                                    return new CmsItemGradingPriceBinding((LinearLayout) view, linearLayout, linearLayout2, glTextView, textView, textView2, linearLayout3, glTextView2);
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
