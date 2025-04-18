package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.o1;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes3.dex */
public final class q extends o1 {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f11737b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialCalendarGridView f11738c;

    public q(LinearLayout linearLayout, boolean z10) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f11737b = textView;
        ViewCompat.setAccessibilityHeading(textView, true);
        this.f11738c = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z10) {
            textView.setVisibility(8);
        }
    }
}
