package com.glority.purchase.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.purchase.ui.R;
import com.glority.widget.GlTextView;

/* loaded from: classes9.dex */
public abstract class BuiDialogInputEmailByReminderBinding extends ViewDataBinding {
    public final EditText etEmail;
    public final GlTextView tvNotInput;
    public final TextView tvSave;

    /* JADX INFO: Access modifiers changed from: protected */
    public BuiDialogInputEmailByReminderBinding(Object obj, View view, int i, EditText editText, GlTextView glTextView, TextView textView) {
        super(obj, view, i);
        this.etEmail = editText;
        this.tvNotInput = glTextView;
        this.tvSave = textView;
    }

    public static BuiDialogInputEmailByReminderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BuiDialogInputEmailByReminderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (BuiDialogInputEmailByReminderBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bui_dialog_input_email_by_reminder, viewGroup, z, obj);
    }

    public static BuiDialogInputEmailByReminderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BuiDialogInputEmailByReminderBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (BuiDialogInputEmailByReminderBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bui_dialog_input_email_by_reminder, null, false, obj);
    }

    public static BuiDialogInputEmailByReminderBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BuiDialogInputEmailByReminderBinding bind(View view, Object obj) {
        return (BuiDialogInputEmailByReminderBinding) bind(obj, view, R.layout.bui_dialog_input_email_by_reminder);
    }
}
