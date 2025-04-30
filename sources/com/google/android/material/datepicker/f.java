package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class f implements View.OnClickListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f14020c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f14021d;

    public /* synthetic */ f(j jVar, q qVar, int i9) {
        this.b = i9;
        this.f14021d = jVar;
        this.f14020c = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                j jVar = this.f14021d;
                int findLastVisibleItemPosition = ((LinearLayoutManager) jVar.f14032j.getLayoutManager()).findLastVisibleItemPosition() - 1;
                if (findLastVisibleItemPosition >= 0) {
                    Calendar b = u.b(this.f14020c.f14070i.b.b);
                    b.add(2, findLastVisibleItemPosition);
                    jVar.b(new m(b));
                    return;
                }
                return;
            default:
                j jVar2 = this.f14021d;
                int findFirstVisibleItemPosition = ((LinearLayoutManager) jVar2.f14032j.getLayoutManager()).findFirstVisibleItemPosition() + 1;
                if (findFirstVisibleItemPosition < jVar2.f14032j.getAdapter().getItemCount()) {
                    Calendar b8 = u.b(this.f14020c.f14070i.b.b);
                    b8.add(2, findFirstVisibleItemPosition);
                    jVar2.b(new m(b8));
                    return;
                }
                return;
        }
    }
}
