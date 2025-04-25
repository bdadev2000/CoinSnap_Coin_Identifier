package com.glority.purchase.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.purchase.ui.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes9.dex */
public final class BuiHowToOpenNotifycationBinding implements ViewBinding {
    public final ImageView closeIv;
    public final TextView contentTv;
    public final MaterialButton gotItTv;
    private final LinearLayout rootView;
    public final GlTextView sendEmailTv;

    private BuiHowToOpenNotifycationBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, MaterialButton materialButton, GlTextView glTextView) {
        this.rootView = linearLayout;
        this.closeIv = imageView;
        this.contentTv = textView;
        this.gotItTv = materialButton;
        this.sendEmailTv = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static BuiHowToOpenNotifycationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BuiHowToOpenNotifycationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.bui_how_to_open_notifycation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static BuiHowToOpenNotifycationBinding bind(View view) {
        int i = R.id.close_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.content_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.got_it_tv;
                MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, i);
                if (materialButton != null) {
                    i = R.id.send_email_tv;
                    GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(view, i);
                    if (glTextView != null) {
                        return new BuiHowToOpenNotifycationBinding((LinearLayout) view, imageView, textView, materialButton, glTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
