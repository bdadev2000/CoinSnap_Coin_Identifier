package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.plantcare.ai.identifier.plantid.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class e extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final int f11674f;

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f11675b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11676c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11677d;

    static {
        f11674f = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar d10 = u.d(null);
        this.f11675b = d10;
        this.f11676c = d10.getMaximum(7);
        this.f11677d = d10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f11676c;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f11676c;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f11677d;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.f11677d;
        int i12 = this.f11676c;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f11675b;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, f11674f, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i10) {
        Calendar d10 = u.d(null);
        this.f11675b = d10;
        this.f11676c = d10.getMaximum(7);
        this.f11677d = i10;
    }
}
