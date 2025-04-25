package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class ItemCollectionTopBar2Binding implements ViewBinding {
    private final FrameLayout rootView;

    private ItemCollectionTopBar2Binding(FrameLayout rootView) {
        this.rootView = rootView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemCollectionTopBar2Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemCollectionTopBar2Binding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_collection_top_bar_2, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCollectionTopBar2Binding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        return new ItemCollectionTopBar2Binding((FrameLayout) rootView);
    }
}
