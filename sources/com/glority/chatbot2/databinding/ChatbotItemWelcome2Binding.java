package com.glority.chatbot2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.chatbot2.R;
import com.glority.widget.GlTextView;

/* loaded from: classes6.dex */
public final class ChatbotItemWelcome2Binding implements ViewBinding {
    private final LinearLayout rootView;
    public final GlTextView tv;

    private ChatbotItemWelcome2Binding(LinearLayout linearLayout, GlTextView glTextView) {
        this.rootView = linearLayout;
        this.tv = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ChatbotItemWelcome2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChatbotItemWelcome2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chatbot_item_welcome2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChatbotItemWelcome2Binding bind(View view) {
        int i = R.id.tv;
        GlTextView glTextView = (GlTextView) view.findViewById(i);
        if (glTextView != null) {
            return new ChatbotItemWelcome2Binding((LinearLayout) view, glTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
