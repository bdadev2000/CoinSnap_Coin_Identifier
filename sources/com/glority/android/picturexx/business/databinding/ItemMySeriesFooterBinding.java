package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public final class ItemMySeriesFooterBinding implements ViewBinding {
    public final GlTextView createSeriesTv;
    private final LinearLayout rootView;

    private ItemMySeriesFooterBinding(LinearLayout rootView, GlTextView createSeriesTv) {
        this.rootView = rootView;
        this.createSeriesTv = createSeriesTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemMySeriesFooterBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemMySeriesFooterBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_my_series_footer, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMySeriesFooterBinding bind(View rootView) {
        int i = R.id.create_series_tv;
        GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
        if (glTextView != null) {
            return new ItemMySeriesFooterBinding((LinearLayout) rootView, glTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
