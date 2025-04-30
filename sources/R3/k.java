package R3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public y8.a f2692a = new i();
    public y8.a b = new i();

    /* renamed from: c, reason: collision with root package name */
    public y8.a f2693c = new i();

    /* renamed from: d, reason: collision with root package name */
    public y8.a f2694d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f2695e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f2696f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f2697g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public c f2698h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public e f2699i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f2700j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f2701k = new e(0);
    public e l = new e(0);

    public static j a(Context context, int i9, int i10, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i9);
        if (i10 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i10);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC2861a.f23680v);
        try {
            int i11 = obtainStyledAttributes.getInt(0, 0);
            int i12 = obtainStyledAttributes.getInt(3, i11);
            int i13 = obtainStyledAttributes.getInt(4, i11);
            int i14 = obtainStyledAttributes.getInt(2, i11);
            int i15 = obtainStyledAttributes.getInt(1, i11);
            c c9 = c(obtainStyledAttributes, 5, aVar);
            c c10 = c(obtainStyledAttributes, 8, c9);
            c c11 = c(obtainStyledAttributes, 9, c9);
            c c12 = c(obtainStyledAttributes, 7, c9);
            c c13 = c(obtainStyledAttributes, 6, c9);
            j jVar = new j();
            y8.a g9 = z2.i.g(i12);
            jVar.f2682a = g9;
            j.b(g9);
            jVar.f2685e = c10;
            y8.a g10 = z2.i.g(i13);
            jVar.b = g10;
            j.b(g10);
            jVar.f2686f = c11;
            y8.a g11 = z2.i.g(i14);
            jVar.f2683c = g11;
            j.b(g11);
            jVar.f2687g = c12;
            y8.a g12 = z2.i.g(i15);
            jVar.f2684d = g12;
            j.b(g12);
            jVar.f2688h = c13;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i9, int i10) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2861a.f23674p, i9, i10);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i9, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i9);
        if (peekValue == null) {
            return cVar;
        }
        int i10 = peekValue.type;
        if (i10 == 5) {
            return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i10 == 6) {
            return new h(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z8;
        boolean z9;
        boolean z10;
        if (this.l.getClass().equals(e.class) && this.f2700j.getClass().equals(e.class) && this.f2699i.getClass().equals(e.class) && this.f2701k.getClass().equals(e.class)) {
            z8 = true;
        } else {
            z8 = false;
        }
        float a6 = this.f2695e.a(rectF);
        if (this.f2696f.a(rectF) == a6 && this.f2698h.a(rectF) == a6 && this.f2697g.a(rectF) == a6) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((this.b instanceof i) && (this.f2692a instanceof i) && (this.f2693c instanceof i) && (this.f2694d instanceof i)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z8 || !z9 || !z10) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, R3.j] */
    public final j e() {
        ?? obj = new Object();
        obj.f2682a = this.f2692a;
        obj.b = this.b;
        obj.f2683c = this.f2693c;
        obj.f2684d = this.f2694d;
        obj.f2685e = this.f2695e;
        obj.f2686f = this.f2696f;
        obj.f2687g = this.f2697g;
        obj.f2688h = this.f2698h;
        obj.f2689i = this.f2699i;
        obj.f2690j = this.f2700j;
        obj.f2691k = this.f2701k;
        obj.l = this.l;
        return obj;
    }
}
