package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class ItemHomeOptionCardBinding implements ViewBinding {
    public final LinearLayout gradingLl;
    public final LinearLayout idenfityLl;
    private final LinearLayout rootView;

    private ItemHomeOptionCardBinding(LinearLayout rootView, LinearLayout gradingLl, LinearLayout idenfityLl) {
        this.rootView = rootView;
        this.gradingLl = gradingLl;
        this.idenfityLl = idenfityLl;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemHomeOptionCardBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemHomeOptionCardBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_home_option_card, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHomeOptionCardBinding bind(View rootView) {
        int i = R.id.grading_ll;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = R.id.idenfity_ll;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
            if (linearLayout2 != null) {
                return new ItemHomeOptionCardBinding((LinearLayout) rootView, linearLayout, linearLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
