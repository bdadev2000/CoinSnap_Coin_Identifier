package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class ItemSuggestInputBinding implements ViewBinding {
    public final ImageView deleteCommonName;
    public final EditText inputCommonName;
    private final ConstraintLayout rootView;

    private ItemSuggestInputBinding(ConstraintLayout rootView, ImageView deleteCommonName, EditText inputCommonName) {
        this.rootView = rootView;
        this.deleteCommonName = deleteCommonName;
        this.inputCommonName = inputCommonName;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemSuggestInputBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemSuggestInputBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_suggest_input, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSuggestInputBinding bind(View rootView) {
        int i = R.id.delete_common_name;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.input_common_name;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, i);
            if (editText != null) {
                return new ItemSuggestInputBinding((ConstraintLayout) rootView, imageView, editText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
