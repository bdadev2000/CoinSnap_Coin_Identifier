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
public final class CmsItemPriceCardChild1Binding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView selectedInfoTv;
    public final LinearLayout yearLl;
    public final GlTextView yearTv;

    private CmsItemPriceCardChild1Binding(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, GlTextView glTextView) {
        this.rootView = linearLayout;
        this.selectedInfoTv = textView;
        this.yearLl = linearLayout2;
        this.yearTv = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CmsItemPriceCardChild1Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CmsItemPriceCardChild1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.cms_item_price_card_child1, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CmsItemPriceCardChild1Binding bind(View view) {
        int i = R.id.selected_info_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.year_ll;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.year_tv;
                GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(view, i);
                if (glTextView != null) {
                    return new CmsItemPriceCardChild1Binding((LinearLayout) view, textView, linearLayout, glTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
