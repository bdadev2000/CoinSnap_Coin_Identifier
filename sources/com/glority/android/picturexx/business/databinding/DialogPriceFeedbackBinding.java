package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class DialogPriceFeedbackBinding extends ViewDataBinding {
    public final ImageView ivClose;
    public final EditText notesEt;
    public final Button saveBt;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogPriceFeedbackBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView ivClose, EditText notesEt, Button saveBt) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivClose = ivClose;
        this.notesEt = notesEt;
        this.saveBt = saveBt;
    }

    public static DialogPriceFeedbackBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogPriceFeedbackBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogPriceFeedbackBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_price_feedback, root, attachToRoot, component);
    }

    public static DialogPriceFeedbackBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogPriceFeedbackBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogPriceFeedbackBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_price_feedback, null, false, component);
    }

    public static DialogPriceFeedbackBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogPriceFeedbackBinding bind(View view, Object component) {
        return (DialogPriceFeedbackBinding) bind(component, view, R.layout.dialog_price_feedback);
    }
}
