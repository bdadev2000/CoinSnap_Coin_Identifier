package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;

/* loaded from: classes3.dex */
public final class a extends ea.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f11872b;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f11872b = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f11872b;
        if (isEmpty) {
            chipTextInputComboView.f11849b.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f11849b;
        if (TextUtils.isEmpty(a)) {
            a = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a);
    }
}
