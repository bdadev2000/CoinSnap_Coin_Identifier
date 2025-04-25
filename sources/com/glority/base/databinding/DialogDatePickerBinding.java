package com.glority.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import androidx.viewbinding.ViewBinding;
import com.glority.base.R;

/* loaded from: classes6.dex */
public final class DialogDatePickerBinding implements ViewBinding {
    public final DatePicker datePicker;
    private final DatePicker rootView;

    private DialogDatePickerBinding(DatePicker datePicker, DatePicker datePicker2) {
        this.rootView = datePicker;
        this.datePicker = datePicker2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DatePicker getRoot() {
        return this.rootView;
    }

    public static DialogDatePickerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogDatePickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_date_picker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogDatePickerBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        DatePicker datePicker = (DatePicker) view;
        return new DialogDatePickerBinding(datePicker, datePicker);
    }
}
