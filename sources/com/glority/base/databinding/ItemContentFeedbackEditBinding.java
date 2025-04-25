package com.glority.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.base.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes6.dex */
public abstract class ItemContentFeedbackEditBinding extends ViewDataBinding {
    public final EditText notesEt;
    public final MaterialButton submitBt;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemContentFeedbackEditBinding(Object obj, View view, int i, EditText editText, MaterialButton materialButton) {
        super(obj, view, i);
        this.notesEt = editText;
        this.submitBt = materialButton;
    }

    public static ItemContentFeedbackEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemContentFeedbackEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemContentFeedbackEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_content_feedback_edit, viewGroup, z, obj);
    }

    public static ItemContentFeedbackEditBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemContentFeedbackEditBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemContentFeedbackEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_content_feedback_edit, null, false, obj);
    }

    public static ItemContentFeedbackEditBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemContentFeedbackEditBinding bind(View view, Object obj) {
        return (ItemContentFeedbackEditBinding) bind(obj, view, R.layout.item_content_feedback_edit);
    }
}
