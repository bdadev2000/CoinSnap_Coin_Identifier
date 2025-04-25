package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class ItemCollectionAlreadyAddedEmptyBinding implements ViewBinding {
    private final FrameLayout rootView;

    private ItemCollectionAlreadyAddedEmptyBinding(FrameLayout rootView) {
        this.rootView = rootView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemCollectionAlreadyAddedEmptyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemCollectionAlreadyAddedEmptyBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_collection_already_added_empty, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCollectionAlreadyAddedEmptyBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        return new ItemCollectionAlreadyAddedEmptyBinding((FrameLayout) rootView);
    }
}
