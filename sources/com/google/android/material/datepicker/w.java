package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.j0;
import androidx.recyclerview.widget.o1;
import com.plantcare.ai.identifier.plantid.R;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class w extends j0 {

    /* renamed from: i, reason: collision with root package name */
    public final k f11744i;

    public w(k kVar) {
        this.f11744i = kVar;
    }

    @Override // androidx.recyclerview.widget.j0
    public final int getItemCount() {
        return this.f11744i.f11688d.f11671h;
    }

    @Override // androidx.recyclerview.widget.j0
    public final void onBindViewHolder(o1 o1Var, int i10) {
        String format;
        v vVar = (v) o1Var;
        k kVar = this.f11744i;
        int i11 = kVar.f11688d.f11666b.f11725d + i10;
        vVar.f11743b.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        TextView textView = vVar.f11743b;
        Context context = textView.getContext();
        if (u.c().get(1) == i11) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11));
        }
        textView.setContentDescription(format);
        android.support.v4.media.d dVar = kVar.f11691h;
        if (u.c().get(1) == i11) {
            Object obj = dVar.f527g;
        } else {
            Object obj2 = dVar.f525e;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.j0
    public final o1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new v((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
