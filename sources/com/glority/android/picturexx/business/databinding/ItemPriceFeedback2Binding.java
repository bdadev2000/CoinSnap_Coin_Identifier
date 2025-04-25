package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public final class ItemPriceFeedback2Binding implements ViewBinding {
    public final ImageView backIv;
    public final EditText notesEt;
    private final FrameLayout rootView;
    public final MaterialButton submitBt;

    private ItemPriceFeedback2Binding(FrameLayout rootView, ImageView backIv, EditText notesEt, MaterialButton submitBt) {
        this.rootView = rootView;
        this.backIv = backIv;
        this.notesEt = notesEt;
        this.submitBt = submitBt;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemPriceFeedback2Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemPriceFeedback2Binding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_price_feedback2, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemPriceFeedback2Binding bind(View rootView) {
        int i = R.id.back_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.notes_et;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, i);
            if (editText != null) {
                i = R.id.submit_bt;
                MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(rootView, i);
                if (materialButton != null) {
                    return new ItemPriceFeedback2Binding((FrameLayout) rootView, imageView, editText, materialButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
