package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.android.cmsui2.R;

/* loaded from: classes14.dex */
public final class CmsSeparator2Binding implements ViewBinding {
    private final LinearLayout rootView;

    private CmsSeparator2Binding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CmsSeparator2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CmsSeparator2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.cms_separator2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CmsSeparator2Binding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new CmsSeparator2Binding((LinearLayout) view);
    }
}
