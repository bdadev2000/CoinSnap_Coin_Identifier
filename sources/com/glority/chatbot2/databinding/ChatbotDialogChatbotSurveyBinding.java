package com.glority.chatbot2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.chatbot2.widget.ChatbotScrollableEditText;
import com.glority.android.chatbot2.widget.FiveStarRatingBar;
import com.glority.chatbot2.R;
import com.glority.widget.GlTextView;

/* loaded from: classes6.dex */
public abstract class ChatbotDialogChatbotSurveyBinding extends ViewDataBinding {
    public final ChatbotScrollableEditText etContent;
    public final FiveStarRatingBar ratingBar;
    public final TextView tvDialogTitle;
    public final GlTextView tvDontShowAgain;
    public final TextView tvSubmit;
    public final ImageView tvSurveyClose;

    /* JADX INFO: Access modifiers changed from: protected */
    public ChatbotDialogChatbotSurveyBinding(Object obj, View view, int i, ChatbotScrollableEditText chatbotScrollableEditText, FiveStarRatingBar fiveStarRatingBar, TextView textView, GlTextView glTextView, TextView textView2, ImageView imageView) {
        super(obj, view, i);
        this.etContent = chatbotScrollableEditText;
        this.ratingBar = fiveStarRatingBar;
        this.tvDialogTitle = textView;
        this.tvDontShowAgain = glTextView;
        this.tvSubmit = textView2;
        this.tvSurveyClose = imageView;
    }

    public static ChatbotDialogChatbotSurveyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ChatbotDialogChatbotSurveyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ChatbotDialogChatbotSurveyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.chatbot_dialog_chatbot_survey, viewGroup, z, obj);
    }

    public static ChatbotDialogChatbotSurveyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ChatbotDialogChatbotSurveyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ChatbotDialogChatbotSurveyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.chatbot_dialog_chatbot_survey, null, false, obj);
    }

    public static ChatbotDialogChatbotSurveyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ChatbotDialogChatbotSurveyBinding bind(View view, Object obj) {
        return (ChatbotDialogChatbotSurveyBinding) bind(obj, view, R.layout.chatbot_dialog_chatbot_survey);
    }
}
