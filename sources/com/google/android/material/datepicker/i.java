package com.google.android.material.datepicker;

import androidx.recyclerview.widget.AbstractC0519b0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class i extends AbstractC0519b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f14024a;
    public final /* synthetic */ MaterialButton b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f14025c;

    public i(j jVar, q qVar, MaterialButton materialButton) {
        this.f14025c = jVar;
        this.f14024a = qVar;
        this.b = materialButton;
    }

    @Override // androidx.recyclerview.widget.AbstractC0519b0
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0519b0
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        int findLastVisibleItemPosition;
        j jVar = this.f14025c;
        if (i9 < 0) {
            findLastVisibleItemPosition = ((LinearLayoutManager) jVar.f14032j.getLayoutManager()).findFirstVisibleItemPosition();
        } else {
            findLastVisibleItemPosition = ((LinearLayoutManager) jVar.f14032j.getLayoutManager()).findLastVisibleItemPosition();
        }
        q qVar = this.f14024a;
        Calendar b = u.b(qVar.f14070i.b.b);
        b.add(2, findLastVisibleItemPosition);
        jVar.f14028f = new m(b);
        Calendar b8 = u.b(qVar.f14070i.b.b);
        b8.add(2, findLastVisibleItemPosition);
        b8.set(5, 1);
        Calendar b9 = u.b(b8);
        b9.get(2);
        b9.get(1);
        b9.getMaximum(7);
        b9.getActualMaximum(5);
        b9.getTimeInMillis();
        this.b.setText(u.a("yMMMM", Locale.getDefault()).format(new Date(b9.getTimeInMillis())));
    }
}
