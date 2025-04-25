package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public final class ItemTotalSeriesBinding implements ViewBinding {
    public final ImageView iv;
    public final GlTextView numberTv;
    private final CardView rootView;
    public final TextView seriesNameTv;

    private ItemTotalSeriesBinding(CardView rootView, ImageView iv, GlTextView numberTv, TextView seriesNameTv) {
        this.rootView = rootView;
        this.iv = iv;
        this.numberTv = numberTv;
        this.seriesNameTv = seriesNameTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemTotalSeriesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemTotalSeriesBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_total_series, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTotalSeriesBinding bind(View rootView) {
        int i = R.id.iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.number_tv;
            GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
            if (glTextView != null) {
                i = R.id.series_name_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    return new ItemTotalSeriesBinding((CardView) rootView, imageView, glTextView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
