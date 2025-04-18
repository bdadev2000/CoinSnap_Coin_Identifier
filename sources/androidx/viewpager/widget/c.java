package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class c extends ViewGroup.LayoutParams {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2113b;

    /* renamed from: c, reason: collision with root package name */
    public float f2114c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2115d;

    /* renamed from: e, reason: collision with root package name */
    public int f2116e;

    /* renamed from: f, reason: collision with root package name */
    public int f2117f;

    public c() {
        super(-1, -1);
        this.f2114c = 0.0f;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2114c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
        this.f2113b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
