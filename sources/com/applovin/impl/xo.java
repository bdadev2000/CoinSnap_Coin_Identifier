package com.applovin.impl;

/* loaded from: classes.dex */
public final class xo {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final ni[] f9069b;

    /* renamed from: c, reason: collision with root package name */
    public final f8[] f9070c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9071d;

    public xo(ni[] niVarArr, f8[] f8VarArr, Object obj) {
        this.f9069b = niVarArr;
        this.f9070c = (f8[]) f8VarArr.clone();
        this.f9071d = obj;
        this.a = niVarArr.length;
    }

    public boolean a(xo xoVar) {
        if (xoVar == null || xoVar.f9070c.length != this.f9070c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f9070c.length; i10++) {
            if (!a(xoVar, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(xo xoVar, int i10) {
        return xoVar != null && yp.a(this.f9069b[i10], xoVar.f9069b[i10]) && yp.a(this.f9070c[i10], xoVar.f9070c[i10]);
    }

    public boolean a(int i10) {
        return this.f9069b[i10] != null;
    }
}
