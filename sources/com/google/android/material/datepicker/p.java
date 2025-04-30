package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.p0;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes2.dex */
public final class p extends p0 {
    public final TextView b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialCalendarGridView f14069c;

    public p(LinearLayout linearLayout, boolean z8) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.b = textView;
        ViewCompat.setAccessibilityHeading(textView, true);
        this.f14069c = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z8) {
            textView.setVisibility(8);
        }
    }
}
