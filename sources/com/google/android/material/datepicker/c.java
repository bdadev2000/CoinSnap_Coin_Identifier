package com.google.android.material.datepicker;

import a.AbstractC0325a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.tools.arruler.photomeasure.camera.ruler.R;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final L4.f f14016a;
    public final L4.f b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0325a.p(context, R.attr.materialCalendarStyle, j.class.getCanonicalName()).data, AbstractC2861a.l);
        L4.f.d(context, obtainStyledAttributes.getResourceId(4, 0));
        L4.f.d(context, obtainStyledAttributes.getResourceId(2, 0));
        L4.f.d(context, obtainStyledAttributes.getResourceId(3, 0));
        L4.f.d(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList p2 = android.support.v4.media.session.a.p(context, obtainStyledAttributes, 7);
        this.f14016a = L4.f.d(context, obtainStyledAttributes.getResourceId(9, 0));
        L4.f.d(context, obtainStyledAttributes.getResourceId(8, 0));
        this.b = L4.f.d(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(p2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
