package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.cmsui2.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes14.dex */
public final class CmsItemPriceCardChild2Binding implements ViewBinding {
    public final ConstraintLayout gradeLl;
    public final ImageView icon;
    private final ConstraintLayout rootView;
    public final MaterialButton startBt;
    public final GlTextView tv1;

    private CmsItemPriceCardChild2Binding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, MaterialButton materialButton, GlTextView glTextView) {
        this.rootView = constraintLayout;
        this.gradeLl = constraintLayout2;
        this.icon = imageView;
        this.startBt = materialButton;
        this.tv1 = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static CmsItemPriceCardChild2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CmsItemPriceCardChild2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.cms_item_price_card_child2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CmsItemPriceCardChild2Binding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.start_bt;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, i);
            if (materialButton != null) {
                i = R.id.tv1;
                GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(view, i);
                if (glTextView != null) {
                    return new CmsItemPriceCardChild2Binding(constraintLayout, constraintLayout, imageView, materialButton, glTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
