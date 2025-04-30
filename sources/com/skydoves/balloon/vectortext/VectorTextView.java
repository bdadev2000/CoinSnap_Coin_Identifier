package com.skydoves.balloon.vectortext;

import G7.j;
import M0.C0219j;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import j6.v;
import o6.C2511a;
import y8.a;

/* loaded from: classes3.dex */
public final class VectorTextView extends AppCompatTextView {
    public C2511a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.e(context, "context");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f21195a);
            j.d(obtainStyledAttributes, "obtainStyledAttributes(...)");
            setDrawableTextViewParams(new C2511a(a.w(obtainStyledAttributes.getResourceId(5, Integer.MIN_VALUE)), a.w(obtainStyledAttributes.getResourceId(1, Integer.MIN_VALUE)), a.w(obtainStyledAttributes.getResourceId(0, Integer.MIN_VALUE)), a.w(obtainStyledAttributes.getResourceId(7, Integer.MIN_VALUE)), null, null, null, null, a.w(obtainStyledAttributes.getResourceId(3, Integer.MIN_VALUE)), a.w(obtainStyledAttributes.getColor(6, Integer.MIN_VALUE)), a.w(obtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE)), a.w(obtainStyledAttributes.getResourceId(2, Integer.MIN_VALUE)), a.w(obtainStyledAttributes.getResourceId(4, Integer.MIN_VALUE)), 8176));
            obtainStyledAttributes.recycle();
        }
    }

    public final C2511a getDrawableTextViewParams() {
        return this.b;
    }

    public final void setDrawableTextViewParams(C2511a c2511a) {
        if (c2511a != null) {
            C0219j.c(this, c2511a);
        } else {
            c2511a = null;
        }
        this.b = c2511a;
    }
}
