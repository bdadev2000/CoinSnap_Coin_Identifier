package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class X extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public p0 f4947a;
    public final Rect b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4948c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4949d;

    public X(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.f4948c = true;
        this.f4949d = false;
    }

    public X(int i9, int i10) {
        super(i9, i10);
        this.b = new Rect();
        this.f4948c = true;
        this.f4949d = false;
    }

    public X(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.f4948c = true;
        this.f4949d = false;
    }

    public X(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.f4948c = true;
        this.f4949d = false;
    }

    public X(X x9) {
        super((ViewGroup.LayoutParams) x9);
        this.b = new Rect();
        this.f4948c = true;
        this.f4949d = false;
    }
}
