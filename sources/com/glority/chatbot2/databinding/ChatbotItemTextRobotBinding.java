package com.glority.chatbot2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.glority.chatbot2.R;
import com.glority.widget.GlTextView;

/* loaded from: classes6.dex */
public final class ChatbotItemTextRobotBinding implements ViewBinding {
    public final CardView dislikeContainer;
    public final ImageView dislikeIv;
    public final CardView likeContainer;
    public final ImageView likeIv;
    public final LinearLayout likeLl;
    public final GlTextView returnTv;
    private final LinearLayout rootView;

    private ChatbotItemTextRobotBinding(LinearLayout linearLayout, CardView cardView, ImageView imageView, CardView cardView2, ImageView imageView2, LinearLayout linearLayout2, GlTextView glTextView) {
        this.rootView = linearLayout;
        this.dislikeContainer = cardView;
        this.dislikeIv = imageView;
        this.likeContainer = cardView2;
        this.likeIv = imageView2;
        this.likeLl = linearLayout2;
        this.returnTv = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ChatbotItemTextRobotBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChatbotItemTextRobotBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chatbot_item_text_robot, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChatbotItemTextRobotBinding bind(View view) {
        int i = R.id.dislike_container;
        CardView cardView = (CardView) view.findViewById(i);
        if (cardView != null) {
            i = R.id.dislike_iv;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R.id.like_container;
                CardView cardView2 = (CardView) view.findViewById(i);
                if (cardView2 != null) {
                    i = R.id.like_iv;
                    ImageView imageView2 = (ImageView) view.findViewById(i);
                    if (imageView2 != null) {
                        i = R.id.like_ll;
                        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                        if (linearLayout != null) {
                            i = R.id.return_tv;
                            GlTextView glTextView = (GlTextView) view.findViewById(i);
                            if (glTextView != null) {
                                return new ChatbotItemTextRobotBinding((LinearLayout) view, cardView, imageView, cardView2, imageView2, linearLayout, glTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
