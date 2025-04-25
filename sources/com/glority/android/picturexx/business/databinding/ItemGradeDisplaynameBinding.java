package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlDividerView;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public final class ItemGradeDisplaynameBinding implements ViewBinding {
    public final GlDividerView dividerV;
    public final GlTextView nameTv;
    private final LinearLayout rootView;
    public final View selectedV;

    private ItemGradeDisplaynameBinding(LinearLayout rootView, GlDividerView dividerV, GlTextView nameTv, View selectedV) {
        this.rootView = rootView;
        this.dividerV = dividerV;
        this.nameTv = nameTv;
        this.selectedV = selectedV;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemGradeDisplaynameBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemGradeDisplaynameBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_grade_displayname, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemGradeDisplaynameBinding bind(View rootView) {
        View findChildViewById;
        int i = R.id.divider_v;
        GlDividerView glDividerView = (GlDividerView) ViewBindings.findChildViewById(rootView, i);
        if (glDividerView != null) {
            i = R.id.name_tv;
            GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
            if (glTextView != null && (findChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.selected_v))) != null) {
                return new ItemGradeDisplaynameBinding((LinearLayout) rootView, glDividerView, glTextView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
