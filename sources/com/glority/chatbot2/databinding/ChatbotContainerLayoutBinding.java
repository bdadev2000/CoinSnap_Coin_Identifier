package com.glority.chatbot2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.chatbot2.R;

/* loaded from: classes6.dex */
public final class ChatbotContainerLayoutBinding implements ViewBinding {
    public final ImageView avatarIv;
    public final LinearLayout ll;
    private final LinearLayout rootView;

    private ChatbotContainerLayoutBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.avatarIv = imageView;
        this.ll = linearLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ChatbotContainerLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChatbotContainerLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chatbot_container_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChatbotContainerLayoutBinding bind(View view) {
        int i = R.id.avatar_iv;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new ChatbotContainerLayoutBinding(linearLayout, imageView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
