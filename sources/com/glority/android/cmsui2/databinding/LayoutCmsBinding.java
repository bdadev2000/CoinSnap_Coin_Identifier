package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.glority.android.cmsui2.R;

/* loaded from: classes14.dex */
public final class LayoutCmsBinding implements ViewBinding {
    private final RecyclerView rootView;
    public final RecyclerView rv;

    private LayoutCmsBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.rv = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RecyclerView getRoot() {
        return this.rootView;
    }

    public static LayoutCmsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutCmsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_cms, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutCmsBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new LayoutCmsBinding(recyclerView, recyclerView);
    }
}
