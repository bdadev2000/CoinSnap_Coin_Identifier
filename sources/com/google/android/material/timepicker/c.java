package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements MaterialButtonToggleGroup.OnButtonCheckedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28745b;

    public /* synthetic */ c(Object obj, int i2) {
        this.f28744a = i2;
        this.f28745b = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z2) {
        int i3 = this.f28744a;
        Object obj = this.f28745b;
        switch (i3) {
            case 0:
                TimePickerTextInputPresenter.a((TimePickerTextInputPresenter) obj, materialButtonToggleGroup, i2, z2);
                return;
            default:
                TimePickerView.b((TimePickerView) obj, materialButtonToggleGroup, i2, z2);
                return;
        }
    }
}
