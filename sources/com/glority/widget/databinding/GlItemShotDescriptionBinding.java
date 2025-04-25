package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.GlTextView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlItemShotDescriptionBinding implements ViewBinding {
    public final GlTextView keyTv;
    private final LinearLayout rootView;
    public final GlTextView valueTv;

    private GlItemShotDescriptionBinding(LinearLayout linearLayout, GlTextView glTextView, GlTextView glTextView2) {
        this.rootView = linearLayout;
        this.keyTv = glTextView;
        this.valueTv = glTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlItemShotDescriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlItemShotDescriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_item_shot_description, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlItemShotDescriptionBinding bind(View view) {
        int i = R.id.key_tv;
        GlTextView glTextView = (GlTextView) view.findViewById(i);
        if (glTextView != null) {
            i = R.id.value_tv;
            GlTextView glTextView2 = (GlTextView) view.findViewById(i);
            if (glTextView2 != null) {
                return new GlItemShotDescriptionBinding((LinearLayout) view, glTextView, glTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
