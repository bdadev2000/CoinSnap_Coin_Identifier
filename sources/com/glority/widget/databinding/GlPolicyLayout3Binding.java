package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.GlTextView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlPolicyLayout3Binding implements ViewBinding {
    public final GlTextView dataTv;
    private final LinearLayout rootView;
    public final GlTextView titleTv;

    private GlPolicyLayout3Binding(LinearLayout linearLayout, GlTextView glTextView, GlTextView glTextView2) {
        this.rootView = linearLayout;
        this.dataTv = glTextView;
        this.titleTv = glTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlPolicyLayout3Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlPolicyLayout3Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_policy_layout3, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlPolicyLayout3Binding bind(View view) {
        int i = R.id.data_tv;
        GlTextView glTextView = (GlTextView) view.findViewById(i);
        if (glTextView != null) {
            i = R.id.title_tv;
            GlTextView glTextView2 = (GlTextView) view.findViewById(i);
            if (glTextView2 != null) {
                return new GlPolicyLayout3Binding((LinearLayout) view, glTextView, glTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
