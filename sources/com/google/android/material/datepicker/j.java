package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a1;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class j extends a1 {
    public final /* synthetic */ r a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f11684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f11685c;

    public j(k kVar, r rVar, MaterialButton materialButton) {
        this.f11685c = kVar;
        this.a = rVar;
        this.f11684b = materialButton;
    }

    @Override // androidx.recyclerview.widget.a1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f11684b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int findLastVisibleItemPosition;
        k kVar = this.f11685c;
        if (i10 < 0) {
            findLastVisibleItemPosition = ((LinearLayoutManager) kVar.f11693j.getLayoutManager()).findFirstVisibleItemPosition();
        } else {
            findLastVisibleItemPosition = ((LinearLayoutManager) kVar.f11693j.getLayoutManager()).findLastVisibleItemPosition();
        }
        r rVar = this.a;
        Calendar b3 = u.b(rVar.f11739i.f11666b.f11723b);
        b3.add(2, findLastVisibleItemPosition);
        kVar.f11689f = new n(b3);
        Calendar b10 = u.b(rVar.f11739i.f11666b.f11723b);
        b10.add(2, findLastVisibleItemPosition);
        this.f11684b.setText(new n(b10).c());
    }
}
