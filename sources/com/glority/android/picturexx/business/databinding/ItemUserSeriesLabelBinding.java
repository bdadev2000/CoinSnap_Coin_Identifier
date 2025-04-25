package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.flexbox.FlexboxLayout;

/* loaded from: classes2.dex */
public final class ItemUserSeriesLabelBinding implements ViewBinding {
    public final GlTextView filterTv;
    private final FlexboxLayout rootView;
    public final GlTextView turnOverTv;

    private ItemUserSeriesLabelBinding(FlexboxLayout rootView, GlTextView filterTv, GlTextView turnOverTv) {
        this.rootView = rootView;
        this.filterTv = filterTv;
        this.turnOverTv = turnOverTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FlexboxLayout getRoot() {
        return this.rootView;
    }

    public static ItemUserSeriesLabelBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemUserSeriesLabelBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_user_series_label, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemUserSeriesLabelBinding bind(View rootView) {
        int i = R.id.filter_tv;
        GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
        if (glTextView != null) {
            i = R.id.turn_over_tv;
            GlTextView glTextView2 = (GlTextView) ViewBindings.findChildViewById(rootView, i);
            if (glTextView2 != null) {
                return new ItemUserSeriesLabelBinding((FlexboxLayout) rootView, glTextView, glTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
