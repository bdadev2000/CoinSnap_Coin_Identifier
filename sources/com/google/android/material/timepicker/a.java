package com.google.android.material.timepicker;

import L3.j;
import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;

/* loaded from: classes2.dex */
public final class a extends j {
    public final /* synthetic */ ChipTextInputComboView b;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.b = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.b;
        if (isEmpty) {
            chipTextInputComboView.b.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a6 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.b;
        if (TextUtils.isEmpty(a6)) {
            a6 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a6);
    }
}
