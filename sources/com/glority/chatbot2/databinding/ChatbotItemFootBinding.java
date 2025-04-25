package com.glority.chatbot2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.chatbot2.R;

/* loaded from: classes6.dex */
public final class ChatbotItemFootBinding implements ViewBinding {
    private final LinearLayout rootView;

    private ChatbotItemFootBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ChatbotItemFootBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChatbotItemFootBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chatbot_item_foot, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChatbotItemFootBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ChatbotItemFootBinding((LinearLayout) view);
    }
}
