package ka;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import v8.u0;

/* loaded from: classes3.dex */
public final class l {
    public final p6.a a;

    /* renamed from: b, reason: collision with root package name */
    public final p6.a f20579b;

    /* renamed from: c, reason: collision with root package name */
    public final p6.a f20580c;

    /* renamed from: d, reason: collision with root package name */
    public final p6.a f20581d;

    /* renamed from: e, reason: collision with root package name */
    public final c f20582e;

    /* renamed from: f, reason: collision with root package name */
    public final c f20583f;

    /* renamed from: g, reason: collision with root package name */
    public final c f20584g;

    /* renamed from: h, reason: collision with root package name */
    public final c f20585h;

    /* renamed from: i, reason: collision with root package name */
    public final e f20586i;

    /* renamed from: j, reason: collision with root package name */
    public final e f20587j;

    /* renamed from: k, reason: collision with root package name */
    public final e f20588k;

    /* renamed from: l, reason: collision with root package name */
    public final e f20589l;

    public l(h7.l lVar) {
        this.a = (p6.a) lVar.a;
        this.f20579b = (p6.a) lVar.f18826b;
        this.f20580c = (p6.a) lVar.f18827c;
        this.f20581d = (p6.a) lVar.f18828d;
        this.f20582e = (c) lVar.f18829e;
        this.f20583f = (c) lVar.f18830f;
        this.f20584g = (c) lVar.f18831g;
        this.f20585h = (c) lVar.f18832h;
        this.f20586i = (e) lVar.f18833i;
        this.f20587j = (e) lVar.f18834j;
        this.f20588k = (e) lVar.f18835k;
        this.f20589l = (e) lVar.f18836l;
    }

    public static h7.l a(Context context, int i10, int i11, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(r9.a.f24039v);
        try {
            int i12 = obtainStyledAttributes.getInt(0, 0);
            int i13 = obtainStyledAttributes.getInt(3, i12);
            int i14 = obtainStyledAttributes.getInt(4, i12);
            int i15 = obtainStyledAttributes.getInt(2, i12);
            int i16 = obtainStyledAttributes.getInt(1, i12);
            c c10 = c(obtainStyledAttributes, 5, aVar);
            c c11 = c(obtainStyledAttributes, 8, c10);
            c c12 = c(obtainStyledAttributes, 9, c10);
            c c13 = c(obtainStyledAttributes, 7, c10);
            c c14 = c(obtainStyledAttributes, 6, c10);
            h7.l lVar = new h7.l(1);
            p6.a s5 = u0.s(i13);
            lVar.a = s5;
            h7.l.b(s5);
            lVar.f18829e = c11;
            p6.a s10 = u0.s(i14);
            lVar.f18826b = s10;
            h7.l.b(s10);
            lVar.f18830f = c12;
            p6.a s11 = u0.s(i15);
            lVar.f18827c = s11;
            h7.l.b(s11);
            lVar.f18831g = c13;
            p6.a s12 = u0.s(i16);
            lVar.f18828d = s12;
            h7.l.b(s12);
            lVar.f18832h = c14;
            return lVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static h7.l b(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9.a.f24034p, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i10, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i11 == 6) {
            return new j(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f20589l.getClass().equals(e.class) && this.f20587j.getClass().equals(e.class) && this.f20586i.getClass().equals(e.class) && this.f20588k.getClass().equals(e.class)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float a = this.f20582e.a(rectF);
        if (this.f20583f.a(rectF) == a && this.f20585h.a(rectF) == a && this.f20584g.a(rectF) == a) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((this.f20579b instanceof k) && (this.a instanceof k) && (this.f20580c instanceof k) && (this.f20581d instanceof k)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 && z11 && z12) {
            return true;
        }
        return false;
    }

    public final l e(g gVar) {
        h7.l lVar = new h7.l(this);
        lVar.f18829e = gVar.a(this.f20582e);
        lVar.f18830f = gVar.a(this.f20583f);
        lVar.f18832h = gVar.a(this.f20585h);
        lVar.f18831g = gVar.a(this.f20584g);
        return new l(lVar);
    }

    public l() {
        this.a = new k();
        this.f20579b = new k();
        this.f20580c = new k();
        this.f20581d = new k();
        this.f20582e = new a(0.0f);
        this.f20583f = new a(0.0f);
        this.f20584g = new a(0.0f);
        this.f20585h = new a(0.0f);
        this.f20586i = new e();
        this.f20587j = new e();
        this.f20588k = new e();
        this.f20589l = new e();
    }
}
