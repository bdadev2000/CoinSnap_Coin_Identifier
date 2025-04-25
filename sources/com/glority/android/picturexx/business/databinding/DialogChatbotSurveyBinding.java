package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.recognize.widget.rating.FiveStarRatingBar;
import com.glority.base.widget.ScrollableEditText;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class DialogChatbotSurveyBinding extends ViewDataBinding {
    public final ScrollableEditText etContent;
    public final FiveStarRatingBar ratingBar;
    public final TextView tvDialogTitle;
    public final GlTextView tvDontShowAgain;
    public final MaterialButton tvSubmit;
    public final ImageView tvSurveyClose;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogChatbotSurveyBinding(Object _bindingComponent, View _root, int _localFieldCount, ScrollableEditText etContent, FiveStarRatingBar ratingBar, TextView tvDialogTitle, GlTextView tvDontShowAgain, MaterialButton tvSubmit, ImageView tvSurveyClose) {
        super(_bindingComponent, _root, _localFieldCount);
        this.etContent = etContent;
        this.ratingBar = ratingBar;
        this.tvDialogTitle = tvDialogTitle;
        this.tvDontShowAgain = tvDontShowAgain;
        this.tvSubmit = tvSubmit;
        this.tvSurveyClose = tvSurveyClose;
    }

    public static DialogChatbotSurveyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogChatbotSurveyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogChatbotSurveyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_chatbot_survey, root, attachToRoot, component);
    }

    public static DialogChatbotSurveyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogChatbotSurveyBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogChatbotSurveyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_chatbot_survey, null, false, component);
    }

    public static DialogChatbotSurveyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogChatbotSurveyBinding bind(View view, Object component) {
        return (DialogChatbotSurveyBinding) bind(component, view, R.layout.dialog_chatbot_survey);
    }
}
