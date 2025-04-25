package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.settings.R;

/* loaded from: classes5.dex */
public final class FragmentInputConversionPageBinding implements ViewBinding {
    public final Button btnAb;
    public final Button btnDefault;
    public final Button btnEnsure;
    public final EditText etInput;
    private final ConstraintLayout rootView;

    private FragmentInputConversionPageBinding(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, EditText editText) {
        this.rootView = constraintLayout;
        this.btnAb = button;
        this.btnDefault = button2;
        this.btnEnsure = button3;
        this.etInput = editText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInputConversionPageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInputConversionPageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_input_conversion_page, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentInputConversionPageBinding bind(View view) {
        int i = R.id.btn_ab;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.btn_default;
            Button button2 = (Button) ViewBindings.findChildViewById(view, i);
            if (button2 != null) {
                i = R.id.btn_ensure;
                Button button3 = (Button) ViewBindings.findChildViewById(view, i);
                if (button3 != null) {
                    i = R.id.et_input;
                    EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                    if (editText != null) {
                        return new FragmentInputConversionPageBinding((ConstraintLayout) view, button, button2, button3, editText);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
