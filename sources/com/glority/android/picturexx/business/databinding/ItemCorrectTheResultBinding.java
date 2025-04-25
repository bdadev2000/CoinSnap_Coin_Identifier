package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public final class ItemCorrectTheResultBinding implements ViewBinding {
    public final MaterialButton correctNameTv;
    private final LinearLayout rootView;

    private ItemCorrectTheResultBinding(LinearLayout rootView, MaterialButton correctNameTv) {
        this.rootView = rootView;
        this.correctNameTv = correctNameTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemCorrectTheResultBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemCorrectTheResultBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_correct_the_result, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCorrectTheResultBinding bind(View rootView) {
        int i = R.id.correct_name_tv;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(rootView, i);
        if (materialButton != null) {
            return new ItemCorrectTheResultBinding((LinearLayout) rootView, materialButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
