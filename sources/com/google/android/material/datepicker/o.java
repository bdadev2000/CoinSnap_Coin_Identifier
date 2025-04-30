package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes2.dex */
public final class o implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f14068c;

    public o(q qVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f14068c = qVar;
        this.b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j7) {
        MaterialCalendarGridView materialCalendarGridView = this.b;
        n a6 = materialCalendarGridView.a();
        if (i9 >= a6.a() && i9 <= a6.c()) {
            if (materialCalendarGridView.a().getItem(i9).longValue() >= ((j) this.f14068c.f14071j.f12819c).f14027d.f14011d.b) {
                throw null;
            }
        }
    }
}
