package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.GlTextView;
import com.glority.widget.R;
import com.google.android.material.textfield.TextInputEditText;

/* loaded from: classes12.dex */
public final class GlAlertCustomBinding implements ViewBinding {
    public final TextInputEditText et;
    public final ImageView ivClose;
    public final GlTextView msg;
    public final ScrollView msgContainer;
    public final Button negative;
    public final Button positive;
    private final ConstraintLayout rootView;
    public final RecyclerView rv;
    public final GlTextView title;

    private GlAlertCustomBinding(ConstraintLayout constraintLayout, TextInputEditText textInputEditText, ImageView imageView, GlTextView glTextView, ScrollView scrollView, Button button, Button button2, RecyclerView recyclerView, GlTextView glTextView2) {
        this.rootView = constraintLayout;
        this.et = textInputEditText;
        this.ivClose = imageView;
        this.msg = glTextView;
        this.msgContainer = scrollView;
        this.negative = button;
        this.positive = button2;
        this.rv = recyclerView;
        this.title = glTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static GlAlertCustomBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlAlertCustomBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_alert_custom, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlAlertCustomBinding bind(View view) {
        int i = R.id.et;
        TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(i);
        if (textInputEditText != null) {
            i = R.id.iv_close;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R.id.msg;
                GlTextView glTextView = (GlTextView) view.findViewById(i);
                if (glTextView != null) {
                    i = R.id.msg_container;
                    ScrollView scrollView = (ScrollView) view.findViewById(i);
                    if (scrollView != null) {
                        i = R.id.negative;
                        Button button = (Button) view.findViewById(i);
                        if (button != null) {
                            i = R.id.positive;
                            Button button2 = (Button) view.findViewById(i);
                            if (button2 != null) {
                                i = R.id.rv;
                                RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
                                if (recyclerView != null) {
                                    i = R.id.title;
                                    GlTextView glTextView2 = (GlTextView) view.findViewById(i);
                                    if (glTextView2 != null) {
                                        return new GlAlertCustomBinding((ConstraintLayout) view, textInputEditText, imageView, glTextView, scrollView, button, button2, recyclerView, glTextView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
