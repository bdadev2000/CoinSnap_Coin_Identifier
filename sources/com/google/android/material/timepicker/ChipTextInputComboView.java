package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
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
import androidx.annotation.VisibleForTesting;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    private final Chip chip;
    private final EditText editText;
    private TextView label;
    private final TextInputLayout textInputLayout;
    private TextWatcher watcher;

    /* loaded from: classes2.dex */
    public class TextFormatter extends TextWatcherAdapter {
        private static final String DEFAULT_TEXT = "00";

        private TextFormatter() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.chip.setText(ChipTextInputComboView.this.formatText(DEFAULT_TEXT));
                return;
            }
            String formatText = ChipTextInputComboView.this.formatText(editable);
            Chip chip = ChipTextInputComboView.this.chip;
            if (TextUtils.isEmpty(formatText)) {
                formatText = ChipTextInputComboView.this.formatText(DEFAULT_TEXT);
            }
            chip.setText(formatText);
        }
    }

    public ChipTextInputComboView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatText(CharSequence charSequence) {
        return TimeModel.formatText(getResources(), charSequence);
    }

    private void updateHintLocales() {
        this.editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public void addInputFilter(InputFilter inputFilter) {
        InputFilter[] filters = this.editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.editText.setFilters(inputFilterArr);
    }

    @VisibleForTesting
    public CharSequence getChipText() {
        return this.chip.getText();
    }

    public TextInputLayout getTextInput() {
        return this.textInputLayout;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.chip.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateHintLocales();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        this.chip.setChecked(z2);
        this.editText.setVisibility(z2 ? 0 : 4);
        this.chip.setVisibility(z2 ? 8 : 0);
        if (isChecked()) {
            ViewUtils.requestFocusAndShowKeyboard(this.editText, false);
        }
    }

    public void setChipDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.A(this.chip, accessibilityDelegateCompat);
    }

    public void setCursorVisible(boolean z2) {
        this.editText.setCursorVisible(z2);
    }

    public void setHelperText(CharSequence charSequence) {
        this.label.setText(charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.chip.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        this.chip.setTag(i2, obj);
    }

    public void setText(CharSequence charSequence) {
        String formatText = formatText(charSequence);
        this.chip.setText(formatText);
        if (TextUtils.isEmpty(formatText)) {
            return;
        }
        this.editText.removeTextChangedListener(this.watcher);
        this.editText.setText(formatText);
        this.editText.addTextChangedListener(this.watcher);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.chip.toggle();
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.chip = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.textInputLayout = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.editText = editText;
        editText.setVisibility(4);
        TextFormatter textFormatter = new TextFormatter();
        this.watcher = textFormatter;
        editText.addTextChangedListener(textFormatter);
        updateHintLocales();
        addView(chip);
        addView(textInputLayout);
        this.label = (TextView) findViewById(R.id.material_label);
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        editText.setId(View.generateViewId());
        this.label.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
