package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.X;
import androidx.recyclerview.widget.p0;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class q extends J {

    /* renamed from: i, reason: collision with root package name */
    public final b f14070i;

    /* renamed from: j, reason: collision with root package name */
    public final com.bumptech.glide.f f14071j;

    /* renamed from: k, reason: collision with root package name */
    public final int f14072k;

    public q(ContextThemeWrapper contextThemeWrapper, b bVar, com.bumptech.glide.f fVar) {
        int i9;
        m mVar = bVar.b;
        m mVar2 = bVar.f14012f;
        if (mVar.b.compareTo(mVar2.b) <= 0) {
            if (mVar2.b.compareTo(bVar.f14010c.b) <= 0) {
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * n.f14064f;
                if (k.e(contextThemeWrapper, android.R.attr.windowFullscreen)) {
                    i9 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i9 = 0;
                }
                this.f14072k = dimensionPixelSize + i9;
                this.f14070i = bVar;
                this.f14071j = fVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.J
    public final int getItemCount() {
        return this.f14070i.f14015i;
    }

    @Override // androidx.recyclerview.widget.J
    public final long getItemId(int i9) {
        Calendar b = u.b(this.f14070i.b.b);
        b.add(2, i9);
        return new m(b).b.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.J
    public final void onBindViewHolder(p0 p0Var, int i9) {
        p pVar = (p) p0Var;
        b bVar = this.f14070i;
        Calendar b = u.b(bVar.b.b);
        b.add(2, i9);
        m mVar = new m(b);
        pVar.b.setText(mVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) pVar.f14069c.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() != null && mVar.equals(materialCalendarGridView.a().b)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.a().getClass();
            throw null;
        }
        new n(mVar, bVar);
        throw null;
    }

    @Override // androidx.recyclerview.widget.J
    public final p0 onCreateViewHolder(ViewGroup viewGroup, int i9) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (k.e(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            linearLayout.setLayoutParams(new X(-1, this.f14072k));
            return new p(linearLayout, true);
        }
        return new p(linearLayout, false);
    }
}
