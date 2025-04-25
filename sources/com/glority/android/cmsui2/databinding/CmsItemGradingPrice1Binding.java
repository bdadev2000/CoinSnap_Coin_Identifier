package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.cmsui2.R;

/* loaded from: classes14.dex */
public final class CmsItemGradingPrice1Binding implements ViewBinding {
    private final LinearLayout rootView;
    public final LinearLayout selectYearTipsLl;

    private CmsItemGradingPrice1Binding(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.selectYearTipsLl = linearLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CmsItemGradingPrice1Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CmsItemGradingPrice1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.cms_item_grading_price1, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CmsItemGradingPrice1Binding bind(View view) {
        int i = R.id.select_year_tips_ll;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            return new CmsItemGradingPrice1Binding((LinearLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
