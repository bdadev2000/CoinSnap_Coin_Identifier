package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class ItemCustomEmptyFootViewBinding implements ViewBinding {
    private final LinearLayout rootView;

    private ItemCustomEmptyFootViewBinding(LinearLayout rootView) {
        this.rootView = rootView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemCustomEmptyFootViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemCustomEmptyFootViewBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_custom_empty_foot_view, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCustomEmptyFootViewBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        return new ItemCustomEmptyFootViewBinding((LinearLayout) rootView);
    }
}
