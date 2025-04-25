package com.glority.chatbot2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.chatbot2.R;

/* loaded from: classes6.dex */
public final class ChatbotItemLoadingViewBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final View v1;
    public final View v2;
    public final View v3;

    private ChatbotItemLoadingViewBinding(LinearLayout linearLayout, View view, View view2, View view3) {
        this.rootView = linearLayout;
        this.v1 = view;
        this.v2 = view2;
        this.v3 = view3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ChatbotItemLoadingViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChatbotItemLoadingViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chatbot_item_loading_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChatbotItemLoadingViewBinding bind(View view) {
        View findViewById;
        View findViewById2;
        int i = R.id.v1;
        View findViewById3 = view.findViewById(i);
        if (findViewById3 != null && (findViewById = view.findViewById((i = R.id.v2))) != null && (findViewById2 = view.findViewById((i = R.id.v3))) != null) {
            return new ChatbotItemLoadingViewBinding((LinearLayout) view, findViewById3, findViewById, findViewById2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
