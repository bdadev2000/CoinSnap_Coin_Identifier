package com.google.common.collect;

import java.util.Map;

/* loaded from: classes3.dex */
public final class a0 extends s {

    /* renamed from: b, reason: collision with root package name */
    public final Object f11898b;

    /* renamed from: c, reason: collision with root package name */
    public int f11899c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f11900d;

    public a0(c0 c0Var, int i10) {
        this.f11900d = c0Var;
        Object obj = c0.f11913l;
        this.f11898b = c0Var.d(i10);
        this.f11899c = i10;
    }

    public final void a() {
        int i10 = this.f11899c;
        Object obj = this.f11898b;
        c0 c0Var = this.f11900d;
        if (i10 == -1 || i10 >= c0Var.size() || !v8.u0.t(obj, c0Var.d(this.f11899c))) {
            Object obj2 = c0.f11913l;
            this.f11899c = c0Var.b(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11898b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        c0 c0Var = this.f11900d;
        Map a = c0Var.a();
        if (a != null) {
            return a.get(this.f11898b);
        }
        a();
        int i10 = this.f11899c;
        if (i10 == -1) {
            return null;
        }
        return c0Var.l(i10);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        c0 c0Var = this.f11900d;
        Map a = c0Var.a();
        Object obj2 = this.f11898b;
        if (a != null) {
            return a.put(obj2, obj);
        }
        a();
        int i10 = this.f11899c;
        if (i10 == -1) {
            c0Var.put(obj2, obj);
            return null;
        }
        Object l10 = c0Var.l(i10);
        c0Var.j()[this.f11899c] = obj;
        return l10;
    }
}
