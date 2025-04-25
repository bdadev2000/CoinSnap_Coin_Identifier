package com.glority.chatbot2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.android.chatbot2.widget.ChatbotLoadingView;
import com.glority.chatbot2.R;

/* loaded from: classes6.dex */
public final class ChatbotItemLoadingBinding implements ViewBinding {
    public final LinearLayout bgLl;
    public final ChatbotLoadingView loadingV;
    private final LinearLayout rootView;

    private ChatbotItemLoadingBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ChatbotLoadingView chatbotLoadingView) {
        this.rootView = linearLayout;
        this.bgLl = linearLayout2;
        this.loadingV = chatbotLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ChatbotItemLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChatbotItemLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chatbot_item_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChatbotItemLoadingBinding bind(View view) {
        int i = R.id.bg_ll;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
        if (linearLayout != null) {
            i = R.id.loading_v;
            ChatbotLoadingView chatbotLoadingView = (ChatbotLoadingView) view.findViewById(i);
            if (chatbotLoadingView != null) {
                return new ChatbotItemLoadingBinding((LinearLayout) view, linearLayout, chatbotLoadingView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
