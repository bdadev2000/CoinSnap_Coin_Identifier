package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class DialogWebSurveyBinding extends ViewDataBinding {
    public final ImageView ivClose;
    public final ImageView ivIcon;
    public final TextView tvContent;
    public final TextView tvNextTime;
    public final TextView tvTitle;
    public final TextView tvYesSure;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogWebSurveyBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView ivClose, ImageView ivIcon, TextView tvContent, TextView tvNextTime, TextView tvTitle, TextView tvYesSure) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivClose = ivClose;
        this.ivIcon = ivIcon;
        this.tvContent = tvContent;
        this.tvNextTime = tvNextTime;
        this.tvTitle = tvTitle;
        this.tvYesSure = tvYesSure;
    }

    public static DialogWebSurveyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogWebSurveyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogWebSurveyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_web_survey, root, attachToRoot, component);
    }

    public static DialogWebSurveyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogWebSurveyBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogWebSurveyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_web_survey, null, false, component);
    }

    public static DialogWebSurveyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogWebSurveyBinding bind(View view, Object component) {
        return (DialogWebSurveyBinding) bind(component, view, R.layout.dialog_web_survey);
    }
}
