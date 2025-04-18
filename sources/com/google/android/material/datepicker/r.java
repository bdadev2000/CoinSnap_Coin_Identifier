package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.j0;
import androidx.recyclerview.widget.o1;
import androidx.recyclerview.widget.w0;
import com.plantcare.ai.identifier.plantid.R;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class r extends j0 {

    /* renamed from: i, reason: collision with root package name */
    public final c f11739i;

    /* renamed from: j, reason: collision with root package name */
    public final y7.q f11740j;

    /* renamed from: k, reason: collision with root package name */
    public final int f11741k;

    public r(ContextThemeWrapper contextThemeWrapper, c cVar, y7.q qVar) {
        int i10;
        Calendar calendar = cVar.f11666b.f11723b;
        n nVar = cVar.f11669f;
        if (calendar.compareTo(nVar.f11723b) <= 0) {
            if (nVar.f11723b.compareTo(cVar.f11667c.f11723b) <= 0) {
                int i11 = o.f11730f;
                int i12 = k.f11686o;
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i11;
                if (l.f(contextThemeWrapper)) {
                    i10 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i10 = 0;
                }
                this.f11741k = dimensionPixelSize + i10;
                this.f11739i = cVar;
                this.f11740j = qVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.j0
    public final int getItemCount() {
        return this.f11739i.f11672i;
    }

    @Override // androidx.recyclerview.widget.j0
    public final long getItemId(int i10) {
        Calendar b3 = u.b(this.f11739i.f11666b.f11723b);
        b3.add(2, i10);
        return new n(b3).f11723b.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.j0
    public final void onBindViewHolder(o1 o1Var, int i10) {
        q qVar = (q) o1Var;
        c cVar = this.f11739i;
        Calendar b3 = u.b(cVar.f11666b.f11723b);
        b3.add(2, i10);
        n nVar = new n(b3);
        qVar.f11737b.setText(nVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) qVar.f11738c.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() != null && nVar.equals(materialCalendarGridView.getAdapter().f11732b)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().getClass();
            throw null;
        }
        new o(nVar, cVar);
        throw null;
    }

    @Override // androidx.recyclerview.widget.j0
    public final o1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (l.f(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new w0(-1, this.f11741k));
            return new q(linearLayout, true);
        }
        return new q(linearLayout, false);
    }
}
