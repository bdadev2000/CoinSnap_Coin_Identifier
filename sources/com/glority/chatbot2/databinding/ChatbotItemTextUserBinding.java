package com.glority.chatbot2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.chatbot2.R;
import com.glority.widget.GlTextView;

/* loaded from: classes6.dex */
public final class ChatbotItemTextUserBinding implements ViewBinding {
    public final GlTextView askTv;
    public final ImageView noteIv;
    private final LinearLayout rootView;

    private ChatbotItemTextUserBinding(LinearLayout linearLayout, GlTextView glTextView, ImageView imageView) {
        this.rootView = linearLayout;
        this.askTv = glTextView;
        this.noteIv = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ChatbotItemTextUserBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChatbotItemTextUserBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chatbot_item_text_user, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChatbotItemTextUserBinding bind(View view) {
        int i = R.id.ask_tv;
        GlTextView glTextView = (GlTextView) view.findViewById(i);
        if (glTextView != null) {
            i = R.id.note_iv;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                return new ChatbotItemTextUserBinding((LinearLayout) view, glTextView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
