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
public final class ChatbotItemWelcomeBinding implements ViewBinding {
    public final ImageView iv;
    private final LinearLayout rootView;
    public final GlTextView tv;

    private ChatbotItemWelcomeBinding(LinearLayout linearLayout, ImageView imageView, GlTextView glTextView) {
        this.rootView = linearLayout;
        this.iv = imageView;
        this.tv = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ChatbotItemWelcomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChatbotItemWelcomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chatbot_item_welcome, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChatbotItemWelcomeBinding bind(View view) {
        int i = R.id.iv;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.tv;
            GlTextView glTextView = (GlTextView) view.findViewById(i);
            if (glTextView != null) {
                return new ChatbotItemWelcomeBinding((LinearLayout) view, imageView, glTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
