package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public final class ItemMeOfficialSetsLabelBinding implements ViewBinding {
    public final TextView descTv;
    private final LinearLayout rootView;
    public final GlTextView titleTv;

    private ItemMeOfficialSetsLabelBinding(LinearLayout rootView, TextView descTv, GlTextView titleTv) {
        this.rootView = rootView;
        this.descTv = descTv;
        this.titleTv = titleTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemMeOfficialSetsLabelBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemMeOfficialSetsLabelBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_me_official_sets_label, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMeOfficialSetsLabelBinding bind(View rootView) {
        int i = R.id.desc_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.title_tv;
            GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
            if (glTextView != null) {
                return new ItemMeOfficialSetsLabelBinding((LinearLayout) rootView, textView, glTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
