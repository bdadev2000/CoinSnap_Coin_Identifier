package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.plantcare.ai.identifier.plantid.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TimePickerView extends ConstraintLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f11870t = 0;

    /* renamed from: s, reason: collision with root package name */
    public final Chip f11871s;

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        k kVar = new k(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f11617d.add(new j(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f11871s = chip2;
        m mVar = new m(new GestureDetector(getContext(), new l(this)));
        chip.setOnTouchListener(mVar);
        chip2.setOnTouchListener(mVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(kVar);
        chip2.setOnClickListener(kVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f11871s.sendAccessibilityEvent(8);
        }
    }
}
