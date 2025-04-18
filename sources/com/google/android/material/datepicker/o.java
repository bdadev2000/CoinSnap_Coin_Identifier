package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class o extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final int f11730f = u.d(null).getMaximum(4);

    /* renamed from: g, reason: collision with root package name */
    public static final int f11731g = (u.d(null).getMaximum(7) + u.d(null).getMaximum(5)) - 1;

    /* renamed from: b, reason: collision with root package name */
    public final n f11732b;

    /* renamed from: c, reason: collision with root package name */
    public android.support.v4.media.d f11733c;

    /* renamed from: d, reason: collision with root package name */
    public final c f11734d;

    public o(n nVar, c cVar) {
        this.f11732b = nVar;
        this.f11734d = cVar;
        throw null;
    }

    public final int a() {
        int i10 = this.f11734d.f11670g;
        n nVar = this.f11732b;
        Calendar calendar = nVar.f11723b;
        int i11 = calendar.get(7);
        if (i10 <= 0) {
            i10 = calendar.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            return i12 + nVar.f11726f;
        }
        return i12;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i10) {
        if (i10 >= a() && i10 <= c()) {
            int a = (i10 - a()) + 1;
            Calendar b3 = u.b(this.f11732b.f11723b);
            b3.set(5, a);
            return Long.valueOf(b3.getTimeInMillis());
        }
        return null;
    }

    public final int c() {
        return (a() + this.f11732b.f11727g) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f11731g;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f11732b.f11726f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            android.support.v4.media.d r1 = r4.f11733c
            if (r1 != 0) goto Lf
            android.support.v4.media.d r1 = new android.support.v4.media.d
            r1.<init>(r0)
            r4.f11733c = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131558672(0x7f0d0110, float:1.8742666E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            com.google.android.material.datepicker.n r7 = r4.f11732b
            int r2 = r7.f11727g
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r1] = r6
            java.lang.String r6 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r6, r3)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6c
            goto L71
        L6c:
            r5.longValue()
            if (r0 != 0) goto L72
        L71:
            return r0
        L72:
            r0.getContext()
            java.util.Calendar r5 = com.google.android.material.datepicker.u.c()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.o.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
