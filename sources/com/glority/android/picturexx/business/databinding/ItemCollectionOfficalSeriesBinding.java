package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public final class ItemCollectionOfficalSeriesBinding implements ViewBinding {
    public final ImageView icon;
    private final FrameLayout rootView;
    public final GlTextView seriesNameTv;
    public final ConstraintLayout toSeriesLl;

    private ItemCollectionOfficalSeriesBinding(FrameLayout rootView, ImageView icon, GlTextView seriesNameTv, ConstraintLayout toSeriesLl) {
        this.rootView = rootView;
        this.icon = icon;
        this.seriesNameTv = seriesNameTv;
        this.toSeriesLl = toSeriesLl;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemCollectionOfficalSeriesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemCollectionOfficalSeriesBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_collection_offical_series, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCollectionOfficalSeriesBinding bind(View rootView) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.series_name_tv;
            GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
            if (glTextView != null) {
                i = R.id.to_series_ll;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                if (constraintLayout != null) {
                    return new ItemCollectionOfficalSeriesBinding((FrameLayout) rootView, imageView, glTextView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
