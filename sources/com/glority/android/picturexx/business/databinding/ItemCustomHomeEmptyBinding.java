package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class ItemCustomHomeEmptyBinding implements ViewBinding {
    private final LinearLayout rootView;

    private ItemCustomHomeEmptyBinding(LinearLayout rootView) {
        this.rootView = rootView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemCustomHomeEmptyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemCustomHomeEmptyBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_custom_home_empty, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCustomHomeEmptyBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        return new ItemCustomHomeEmptyBinding((LinearLayout) rootView);
    }
}
