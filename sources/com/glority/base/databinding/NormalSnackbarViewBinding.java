package com.glority.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.base.R;
import com.glority.widget.GlTextView;

/* loaded from: classes6.dex */
public final class NormalSnackbarViewBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final GlTextView tv;

    private NormalSnackbarViewBinding(LinearLayout linearLayout, GlTextView glTextView) {
        this.rootView = linearLayout;
        this.tv = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static NormalSnackbarViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static NormalSnackbarViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.normal_snackbar_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static NormalSnackbarViewBinding bind(View view) {
        int i = R.id.tv;
        GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(view, i);
        if (glTextView != null) {
            return new NormalSnackbarViewBinding((LinearLayout) view, glTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
