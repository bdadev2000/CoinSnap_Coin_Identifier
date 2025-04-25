package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public final class ItemCollectBySeriesLabelBinding implements ViewBinding {
    public final TextView descTv;
    public final View hightV;
    public final GlTextView optionTv;
    private final ConstraintLayout rootView;
    public final TextView titleTv;

    private ItemCollectBySeriesLabelBinding(ConstraintLayout rootView, TextView descTv, View hightV, GlTextView optionTv, TextView titleTv) {
        this.rootView = rootView;
        this.descTv = descTv;
        this.hightV = hightV;
        this.optionTv = optionTv;
        this.titleTv = titleTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemCollectBySeriesLabelBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemCollectBySeriesLabelBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_collect_by_series_label, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCollectBySeriesLabelBinding bind(View rootView) {
        View findChildViewById;
        int i = R.id.desc_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null && (findChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.hight_v))) != null) {
            i = R.id.option_tv;
            GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
            if (glTextView != null) {
                i = R.id.title_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    return new ItemCollectBySeriesLabelBinding((ConstraintLayout) rootView, textView, findChildViewById, glTextView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
