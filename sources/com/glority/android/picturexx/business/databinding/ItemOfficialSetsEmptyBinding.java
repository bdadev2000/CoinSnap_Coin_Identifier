package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class ItemOfficialSetsEmptyBinding implements ViewBinding {
    private final LinearLayout rootView;

    private ItemOfficialSetsEmptyBinding(LinearLayout rootView) {
        this.rootView = rootView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemOfficialSetsEmptyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemOfficialSetsEmptyBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_official_sets_empty, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemOfficialSetsEmptyBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        return new ItemOfficialSetsEmptyBinding((LinearLayout) rootView);
    }
}
