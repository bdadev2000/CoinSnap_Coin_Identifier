package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.p0;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class w extends J {

    /* renamed from: i, reason: collision with root package name */
    public final j f14074i;

    public w(j jVar) {
        this.f14074i = jVar;
    }

    @Override // androidx.recyclerview.widget.J
    public final int getItemCount() {
        return this.f14074i.f14027d.f14014h;
    }

    @Override // androidx.recyclerview.widget.J
    public final void onBindViewHolder(p0 p0Var, int i9) {
        String format;
        v vVar = (v) p0Var;
        j jVar = this.f14074i;
        int i10 = jVar.f14027d.b.f14059d + i9;
        vVar.b.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i10)));
        TextView textView = vVar.b;
        Context context = textView.getContext();
        if (u.c().get(1) == i10) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10));
        }
        textView.setContentDescription(format);
        c cVar = jVar.f14030h;
        if (u.c().get(1) == i10) {
            L4.f fVar = cVar.b;
        } else {
            L4.f fVar2 = cVar.f14016a;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.J
    public final p0 onCreateViewHolder(ViewGroup viewGroup, int i9) {
        return new v((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
