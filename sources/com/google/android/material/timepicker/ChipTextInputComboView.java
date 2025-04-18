package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.nu;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.plantcare.ai.identifier.plantid.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: b, reason: collision with root package name */
    public final Chip f11849b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f11850c;

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f11849b = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f11850c = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f11849b.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f11850c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z10) {
        int i10;
        int i11;
        Chip chip = this.f11849b;
        chip.setChecked(z10);
        boolean z11 = false;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        EditText editText = this.f11850c;
        editText.setVisibility(i10);
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        chip.setVisibility(i11);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new nu(3, editText, z11));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f11849b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        this.f11849b.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f11849b.toggle();
    }
}
