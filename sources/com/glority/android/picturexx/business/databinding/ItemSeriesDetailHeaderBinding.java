package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class ItemSeriesDetailHeaderBinding implements ViewBinding {
    private final LinearLayout rootView;

    private ItemSeriesDetailHeaderBinding(LinearLayout rootView) {
        this.rootView = rootView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemSeriesDetailHeaderBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemSeriesDetailHeaderBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_series_detail_header, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSeriesDetailHeaderBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        return new ItemSeriesDetailHeaderBinding((LinearLayout) rootView);
    }
}
