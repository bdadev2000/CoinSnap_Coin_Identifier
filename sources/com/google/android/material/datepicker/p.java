package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes3.dex */
public final class p implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f11735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f11736c;

    public p(r rVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f11736c = rVar;
        this.f11735b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        boolean z10;
        MaterialCalendarGridView materialCalendarGridView = this.f11735b;
        o adapter = materialCalendarGridView.getAdapter();
        boolean z11 = true;
        if (i10 >= adapter.a() && i10 <= adapter.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            y7.q qVar = this.f11736c.f11740j;
            long longValue = materialCalendarGridView.getAdapter().getItem(i10).longValue();
            Object obj = qVar.f27991b;
            if (longValue < ((d) ((k) obj).f11688d.f11668d).f11673b) {
                z11 = false;
            }
            if (z11) {
                ((k) obj).getClass();
                throw null;
            }
        }
    }
}
