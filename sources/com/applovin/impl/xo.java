package com.applovin.impl;

/* loaded from: classes.dex */
public final class xo {

    /* renamed from: a, reason: collision with root package name */
    public final int f12287a;
    public final ni[] b;

    /* renamed from: c, reason: collision with root package name */
    public final f8[] f12288c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12289d;

    public xo(ni[] niVarArr, f8[] f8VarArr, Object obj) {
        this.b = niVarArr;
        this.f12288c = (f8[]) f8VarArr.clone();
        this.f12289d = obj;
        this.f12287a = niVarArr.length;
    }

    public boolean a(xo xoVar) {
        if (xoVar == null || xoVar.f12288c.length != this.f12288c.length) {
            return false;
        }
        for (int i9 = 0; i9 < this.f12288c.length; i9++) {
            if (!a(xoVar, i9)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(xo xoVar, int i9) {
        return xoVar != null && yp.a(this.b[i9], xoVar.b[i9]) && yp.a(this.f12288c[i9], xoVar.f12288c[i9]);
    }

    public boolean a(int i9) {
        return this.b[i9] != null;
    }
}
