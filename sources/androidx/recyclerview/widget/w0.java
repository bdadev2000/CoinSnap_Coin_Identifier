package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class w0 extends ViewGroup.MarginLayoutParams {
    public o1 a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2059b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2060c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2061d;

    public w0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2059b = new Rect();
        this.f2060c = true;
        this.f2061d = false;
    }

    public final int a() {
        return this.a.getLayoutPosition();
    }

    public final boolean b() {
        return this.a.isUpdated();
    }

    public final boolean c() {
        return this.a.isRemoved();
    }

    public w0(int i10, int i11) {
        super(i10, i11);
        this.f2059b = new Rect();
        this.f2060c = true;
        this.f2061d = false;
    }

    public w0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2059b = new Rect();
        this.f2060c = true;
        this.f2061d = false;
    }

    public w0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2059b = new Rect();
        this.f2060c = true;
        this.f2061d = false;
    }

    public w0(w0 w0Var) {
        super((ViewGroup.LayoutParams) w0Var);
        this.f2059b = new Rect();
        this.f2060c = true;
        this.f2061d = false;
    }
}
