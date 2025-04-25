package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.android.cmsui2.R;

/* loaded from: classes14.dex */
public final class ActivityCmsInfoBinding implements ViewBinding {
    public final FrameLayout flCmsHome;
    private final FrameLayout rootView;

    private ActivityCmsInfoBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.flCmsHome = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCmsInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCmsInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_cms_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityCmsInfoBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new ActivityCmsInfoBinding(frameLayout, frameLayout);
    }
}
