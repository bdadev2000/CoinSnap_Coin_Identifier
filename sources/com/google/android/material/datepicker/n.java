package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class n extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final int f14064f = u.d(null).getMaximum(4);

    /* renamed from: g, reason: collision with root package name */
    public static final int f14065g = (u.d(null).getMaximum(7) + u.d(null).getMaximum(5)) - 1;
    public final m b;

    /* renamed from: c, reason: collision with root package name */
    public c f14066c;

    /* renamed from: d, reason: collision with root package name */
    public final b f14067d;

    public n(m mVar, b bVar) {
        this.b = mVar;
        this.f14067d = bVar;
        throw null;
    }

    public final int a() {
        int i9 = this.f14067d.f14013g;
        m mVar = this.b;
        Calendar calendar = mVar.b;
        int i10 = calendar.get(7);
        if (i9 <= 0) {
            i9 = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - i9;
        if (i11 < 0) {
            return i11 + mVar.f14060f;
        }
        return i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i9) {
        if (i9 >= a() && i9 <= c()) {
            int a6 = (i9 - a()) + 1;
            Calendar b = u.b(this.b.b);
            b.set(5, a6);
            return Long.valueOf(b.getTimeInMillis());
        }
        return null;
    }

    public final int c() {
        return (a() + this.b.f14061g) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f14065g;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i9) {
        return i9 / this.b.f14060f;
    }

    @Override // android.widget.Adapter
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f14066c == null) {
            this.f14066c = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a6 = i9 - a();
        if (a6 >= 0) {
            m mVar = this.b;
            if (a6 < mVar.f14061g) {
                textView.setTag(mVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a6 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i9) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                u.c().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i9) == null) {
            textView.getContext();
            u.c().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
