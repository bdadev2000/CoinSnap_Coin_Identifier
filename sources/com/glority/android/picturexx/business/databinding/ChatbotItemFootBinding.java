package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class ChatbotItemFootBinding implements ViewBinding {
    private final LinearLayout rootView;

    private ChatbotItemFootBinding(LinearLayout rootView) {
        this.rootView = rootView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ChatbotItemFootBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ChatbotItemFootBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.chatbot_item_foot, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChatbotItemFootBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        return new ChatbotItemFootBinding((LinearLayout) rootView);
    }
}
