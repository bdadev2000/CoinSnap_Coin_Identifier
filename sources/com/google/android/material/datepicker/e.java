package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class e extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final int f14017f;
    public final Calendar b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14018c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14019d;

    static {
        int i9;
        if (Build.VERSION.SDK_INT >= 26) {
            i9 = 4;
        } else {
            i9 = 1;
        }
        f14017f = i9;
    }

    public e() {
        Calendar d2 = u.d(null);
        this.b = d2;
        this.f14018c = d2.getMaximum(7);
        this.f14019d = d2.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f14018c;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i9) {
        int i10 = this.f14018c;
        if (i9 >= i10) {
            return null;
        }
        int i11 = i9 + this.f14019d;
        if (i11 > i10) {
            i11 -= i10;
        }
        return Integer.valueOf(i11);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i9) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i10 = i9 + this.f14019d;
        int i11 = this.f14018c;
        if (i10 > i11) {
            i10 -= i11;
        }
        Calendar calendar = this.b;
        calendar.set(7, i10);
        textView.setText(calendar.getDisplayName(7, f14017f, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i9) {
        Calendar d2 = u.d(null);
        this.b = d2;
        this.f14018c = d2.getMaximum(7);
        this.f14019d = i9;
    }
}
