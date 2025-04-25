package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.GlTextView;
import com.glority.widget.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

/* loaded from: classes12.dex */
public final class GlAlertSystemBinding implements ViewBinding {
    public final TextInputEditText et;
    public final GlTextView msg;
    public final MaterialButton negative;
    public final MaterialButton positive;
    private final ConstraintLayout rootView;
    public final GlTextView title;

    private GlAlertSystemBinding(ConstraintLayout constraintLayout, TextInputEditText textInputEditText, GlTextView glTextView, MaterialButton materialButton, MaterialButton materialButton2, GlTextView glTextView2) {
        this.rootView = constraintLayout;
        this.et = textInputEditText;
        this.msg = glTextView;
        this.negative = materialButton;
        this.positive = materialButton2;
        this.title = glTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static GlAlertSystemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlAlertSystemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_alert_system, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlAlertSystemBinding bind(View view) {
        int i = R.id.et;
        TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(i);
        if (textInputEditText != null) {
            i = R.id.msg;
            GlTextView glTextView = (GlTextView) view.findViewById(i);
            if (glTextView != null) {
                i = R.id.negative;
                MaterialButton materialButton = (MaterialButton) view.findViewById(i);
                if (materialButton != null) {
                    i = R.id.positive;
                    MaterialButton materialButton2 = (MaterialButton) view.findViewById(i);
                    if (materialButton2 != null) {
                        i = R.id.title;
                        GlTextView glTextView2 = (GlTextView) view.findViewById(i);
                        if (glTextView2 != null) {
                            return new GlAlertSystemBinding((ConstraintLayout) view, textInputEditText, glTextView, materialButton, materialButton2, glTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
