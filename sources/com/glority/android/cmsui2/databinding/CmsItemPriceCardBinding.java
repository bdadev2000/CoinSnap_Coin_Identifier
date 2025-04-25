package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.cmsui2.R;
import com.glority.widget.GlTextView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes14.dex */
public final class CmsItemPriceCardBinding implements ViewBinding {
    public final ViewStub gradingVs;
    public final ImageView moreIv;
    public final TextView priceTipsTv;
    private final LinearLayout rootView;
    public final ViewStub selectedYearVs;
    public final TextView timeTv;
    public final GlTextView titleTv;
    public final MaterialTextView toKnowMoreTv;

    private CmsItemPriceCardBinding(LinearLayout linearLayout, ViewStub viewStub, ImageView imageView, TextView textView, ViewStub viewStub2, TextView textView2, GlTextView glTextView, MaterialTextView materialTextView) {
        this.rootView = linearLayout;
        this.gradingVs = viewStub;
        this.moreIv = imageView;
        this.priceTipsTv = textView;
        this.selectedYearVs = viewStub2;
        this.timeTv = textView2;
        this.titleTv = glTextView;
        this.toKnowMoreTv = materialTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CmsItemPriceCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CmsItemPriceCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.cms_item_price_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CmsItemPriceCardBinding bind(View view) {
        int i = R.id.grading_vs;
        ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
        if (viewStub != null) {
            i = R.id.more_iv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.price_tips_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.selected_year_vs;
                    ViewStub viewStub2 = (ViewStub) ViewBindings.findChildViewById(view, i);
                    if (viewStub2 != null) {
                        i = R.id.time_tv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.title_tv;
                            GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(view, i);
                            if (glTextView != null) {
                                i = R.id.to_know_more_tv;
                                MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, i);
                                if (materialTextView != null) {
                                    return new CmsItemPriceCardBinding((LinearLayout) view, viewStub, imageView, textView, viewStub2, textView2, glTextView, materialTextView);
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
