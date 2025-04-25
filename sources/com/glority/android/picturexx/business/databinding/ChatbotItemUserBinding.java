package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public final class ChatbotItemUserBinding implements ViewBinding {
    public final GlTextView askTv;
    public final ImageView noteIv;
    private final LinearLayout rootView;

    private ChatbotItemUserBinding(LinearLayout rootView, GlTextView askTv, ImageView noteIv) {
        this.rootView = rootView;
        this.askTv = askTv;
        this.noteIv = noteIv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ChatbotItemUserBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ChatbotItemUserBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.chatbot_item_user, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChatbotItemUserBinding bind(View rootView) {
        int i = R.id.ask_tv;
        GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
        if (glTextView != null) {
            i = R.id.note_iv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                return new ChatbotItemUserBinding((LinearLayout) rootView, glTextView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
