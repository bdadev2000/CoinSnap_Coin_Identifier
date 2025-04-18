package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class w3 extends h.a {

    /* renamed from: b, reason: collision with root package name */
    public int f1075b;

    public w3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1075b = 0;
    }

    public w3() {
        this.f1075b = 0;
        this.a = 8388627;
    }

    public w3(w3 w3Var) {
        super((h.a) w3Var);
        this.f1075b = 0;
        this.f1075b = w3Var.f1075b;
    }

    public w3(h.a aVar) {
        super(aVar);
        this.f1075b = 0;
    }

    public w3(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1075b = 0;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
    }

    public w3(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1075b = 0;
    }
}
