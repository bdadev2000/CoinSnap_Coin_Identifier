package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public final class ChatbotItemRobotBinding implements ViewBinding {
    public final MaterialButton dislikeBt;
    public final MaterialButton likeBt;
    public final LinearLayout likeLl;
    public final GlTextView returnTv;
    private final LinearLayout rootView;

    private ChatbotItemRobotBinding(LinearLayout rootView, MaterialButton dislikeBt, MaterialButton likeBt, LinearLayout likeLl, GlTextView returnTv) {
        this.rootView = rootView;
        this.dislikeBt = dislikeBt;
        this.likeBt = likeBt;
        this.likeLl = likeLl;
        this.returnTv = returnTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ChatbotItemRobotBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ChatbotItemRobotBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.chatbot_item_robot, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChatbotItemRobotBinding bind(View rootView) {
        int i = R.id.dislike_bt;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(rootView, i);
        if (materialButton != null) {
            i = R.id.like_bt;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(rootView, i);
            if (materialButton2 != null) {
                i = R.id.like_ll;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = R.id.return_tv;
                    GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
                    if (glTextView != null) {
                        return new ChatbotItemRobotBinding((LinearLayout) rootView, materialButton, materialButton2, linearLayout, glTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
