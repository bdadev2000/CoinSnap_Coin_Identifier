package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class f implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f11679c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f11680d;

    public /* synthetic */ f(k kVar, r rVar, int i10) {
        this.f11678b = i10;
        this.f11680d = kVar;
        this.f11679c = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f11678b;
        r rVar = this.f11679c;
        k kVar = this.f11680d;
        switch (i10) {
            case 0:
                int findLastVisibleItemPosition = ((LinearLayoutManager) kVar.f11693j.getLayoutManager()).findLastVisibleItemPosition() - 1;
                if (findLastVisibleItemPosition >= 0) {
                    Calendar b3 = u.b(rVar.f11739i.f11666b.f11723b);
                    b3.add(2, findLastVisibleItemPosition);
                    kVar.b(new n(b3));
                    return;
                }
                return;
            default:
                int findFirstVisibleItemPosition = ((LinearLayoutManager) kVar.f11693j.getLayoutManager()).findFirstVisibleItemPosition() + 1;
                if (findFirstVisibleItemPosition < kVar.f11693j.getAdapter().getItemCount()) {
                    Calendar b10 = u.b(rVar.f11739i.f11666b.f11723b);
                    b10.add(2, findFirstVisibleItemPosition);
                    kVar.b(new n(b10));
                    return;
                }
                return;
        }
    }
}
