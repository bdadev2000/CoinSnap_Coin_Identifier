package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.GlTextView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlSettingGroupBinding implements ViewBinding {
    public final LinearLayout containerV;
    private final LinearLayout rootView;
    public final GlTextView titleTv;

    private GlSettingGroupBinding(LinearLayout linearLayout, LinearLayout linearLayout2, GlTextView glTextView) {
        this.rootView = linearLayout;
        this.containerV = linearLayout2;
        this.titleTv = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlSettingGroupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlSettingGroupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_setting_group, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlSettingGroupBinding bind(View view) {
        int i = R.id.container_v;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
        if (linearLayout != null) {
            i = R.id.title_tv;
            GlTextView glTextView = (GlTextView) view.findViewById(i);
            if (glTextView != null) {
                return new GlSettingGroupBinding((LinearLayout) view, linearLayout, glTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
