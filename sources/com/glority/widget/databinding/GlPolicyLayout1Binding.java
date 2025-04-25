package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.GlTextView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlPolicyLayout1Binding implements ViewBinding {
    public final GlTextView dataTv;
    private final LinearLayout rootView;
    public final GlTextView titleTv;

    private GlPolicyLayout1Binding(LinearLayout linearLayout, GlTextView glTextView, GlTextView glTextView2) {
        this.rootView = linearLayout;
        this.dataTv = glTextView;
        this.titleTv = glTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlPolicyLayout1Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlPolicyLayout1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_policy_layout1, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlPolicyLayout1Binding bind(View view) {
        int i = R.id.data_tv;
        GlTextView glTextView = (GlTextView) view.findViewById(i);
        if (glTextView != null) {
            i = R.id.title_tv;
            GlTextView glTextView2 = (GlTextView) view.findViewById(i);
            if (glTextView2 != null) {
                return new GlPolicyLayout1Binding((LinearLayout) view, glTextView, glTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
