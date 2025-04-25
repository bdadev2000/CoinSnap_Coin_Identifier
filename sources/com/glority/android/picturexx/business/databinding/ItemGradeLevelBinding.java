package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public final class ItemGradeLevelBinding implements ViewBinding {
    public final GlTextView levelTv;
    private final FrameLayout rootView;
    public final View selectedV;

    private ItemGradeLevelBinding(FrameLayout rootView, GlTextView levelTv, View selectedV) {
        this.rootView = rootView;
        this.levelTv = levelTv;
        this.selectedV = selectedV;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemGradeLevelBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemGradeLevelBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_grade_level, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemGradeLevelBinding bind(View rootView) {
        View findChildViewById;
        int i = R.id.level_tv;
        GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
        if (glTextView != null && (findChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.selected_v))) != null) {
            return new ItemGradeLevelBinding((FrameLayout) rootView, glTextView, findChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
