package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.base.widget.LoadingTextView;

/* loaded from: classes2.dex */
public final class ChatbotItemWaitingBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final LoadingTextView waitingTv;

    private ChatbotItemWaitingBinding(LinearLayout rootView, LoadingTextView waitingTv) {
        this.rootView = rootView;
        this.waitingTv = waitingTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ChatbotItemWaitingBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ChatbotItemWaitingBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.chatbot_item_waiting, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChatbotItemWaitingBinding bind(View rootView) {
        int i = R.id.waiting_tv;
        LoadingTextView loadingTextView = (LoadingTextView) ViewBindings.findChildViewById(rootView, i);
        if (loadingTextView != null) {
            return new ChatbotItemWaitingBinding((LinearLayout) rootView, loadingTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
